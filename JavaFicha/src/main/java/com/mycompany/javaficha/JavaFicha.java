/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaficha;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//importando os pacotes de classe

public class JavaFicha {
    private static String Nome;
    private static int Idade;
    private static float Altura;
    private static float Peso;
    private static char Sexo;
     //      
/*public = metodo visivel 
    static = associado à classe e invocado apenas por outros metodos static
    void = sem valor de retorno 
     
    */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); 
        do{
             System.out.println("Digite seu nome:");
              Nome = leitura.nextLine();   //nextline = ler string
        }
        while(Nome.length() < 2 || Nome.length() > 30);
        
        do{
             System.out.println("Digite sua idade:");
              Idade = leitura.nextInt();
        } while(Idade <= 0 || Idade >= 100);
        
          do{
             System.out.println("Digite sua altura:");
              Altura = leitura.nextFloat();
        } while(Altura <= 0);
          
           do{
             System.out.println("Digite seu peso:");
              Peso = leitura.nextFloat();
        } while(Peso <= 0);
           
            do{
            try {
                System.out.println("Digite seu sexo: F ou M ");          
                Sexo = (char) System.in.read();
            } catch (IOException ex) {
                Logger.getLogger(JavaFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while(Sexo!= 'F' && Sexo!= 'M');
            //possibilidade de erros ou falhas 
            
             System.out.println("\nNome:" + Nome);  
              System.out.println("Idade:" + Idade); 
               System.out.println("Altura:" + Altura); 
                System.out.println("Peso:" + Peso); 
                 System.out.println("Sexo:" + Sexo); 
         
                                             
    }
}
