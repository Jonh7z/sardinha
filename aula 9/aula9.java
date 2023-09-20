package aula9;

import java.util.Scanner;

/**atvdd 9
 * disciplina: operadores atribuição e aritméticos
 * aula: 15/08/2023
 * materia: entrada de dados
 * @author Joao valentim
 */
public class aula9 {
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       System.out.println("digite o valor A:");
       float A = ler.nextFloat();
        System.out.println("digite o valor B:");
       float B = ler.nextFloat();
        if(A > B){
           System.out.println("maior");   
   }else if(A < B){
       System.out.println("menor");
   }else{
       System.out.println("igual");
   }
       
        
   } 
}
