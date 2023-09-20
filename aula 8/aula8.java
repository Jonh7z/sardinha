package aula8;

/**atvdd 8
 * disciplina: operadores atribuição e aritméticos
 * aula: 15/08/2023
 * materia: entrada de dados
 * @author Joao valentim
 */
public class aula8 {
   public static void main(String[] args){
       int a = 5;
       int b = 10;
       
       System.out.println(a > b && a < b);
       
       if(a > b){
           System.out.println("maior");   
   }else if(a < b){
       System.out.println("menor");
   }else{
       System.out.println("igual");
   }
}
}
