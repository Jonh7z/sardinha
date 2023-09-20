package aula6;

/**atvdd 6
 * disciplina: operadores atribuição e aritméticos
 * aula: 15/08/2023
 * materia: entrada de dados
 * @author Joao Valentim
 */
public class aula6 {
    public static void main(String[]args){
       float nota01 = 10;
       float nota02 = 9;
       float nota03 = 8;
       float nota04 = 3;
       
       float media, soma =0;
       soma = nota01 + nota02 + nota03 + nota04;
       media = soma / 4;
       System.out.println("Soma:"+ soma);
       System.out.println("Media:"+ media);
    }
}
