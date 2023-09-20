package aula5;

/**
 * atvdd 5
 * disciplina: linguagem de programação
 * classe math: constantes, principais métodos e chamando métodos de outras classes
 * doc 1:https://www.w3schools.com/java/java_math.asp
 * @author Valentim
 * 
 */
public class aula5 {
    public static void main(String[] args) {
        System.out.println("imprimindo o valor de Pi e da constante de euler, o 'e' dos números exponenciais: \n");
        System.out.println("O valor de pi é: " + Math.PI);
        System.out.println("O valor de E é: " + Math.E + "\n\n");
        
        System.out.println("Exponencial e potenciação na classe Math:\n");
        System.out.println("'e' elevado ao quadrado = "+ Math.exp(2));
        System.out.println("2 elevado ao cubo = " + Math.pow(2, 3)+ "\n\n");
        
        System.out.println("Calculando a Raiz quadrada em Java através da classe Math:\n");
        System.out.println("A raiz quadrada de Pi é = "+ Math.sqrt( Math.PI )+"\n\n" );
        
        System.out.println("Calculando logaritmos naturais em Java através da classe Math:\n");
        System.out.println("O logaritmo natural de 10 é = "+ Math.log(10) );
        System.out.println("O logaritmo natural de 'e' é = "+ Math.log( Math.E ));
    }
}
