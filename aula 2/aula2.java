package aula2;

/**
 * atvdd 2
 * aula: 10/07/2023
 * disciplina: Linguagem de Programação
 * materia: manipulação de string
 * doc 1:https://www.w3schools.com/java/java_variables.asp
 * doc 2: https://www.w3schools.com/java/java_strings.asp
 * @author Valentim
 * a concatenação de strings é o processo de combinar duas 
 * ou mais strings. Em Java, você pode usar o operador de 
 * adição (+) ou o método concat() para realizar essa operação. Por exemplo:
 */
public class aula2 {
    public static void main(String[] args) {
        //concatenação de strings
        String saudacao = "olá";
        String nome = "maria";
        String mensagem = saudacao + ", " + nome + "!";
        
        System.out.println(mensagem);
        
        //tamanho de uma string
        String texto = "hello, world!";
        int tamanho = texto.length(); 
        
        System.out.println(tamanho);
        
        //transformação de uma String em letras maiusculas e minusculas
        String txt = "hello world";
        System.out.println(txt.toUpperCase());   
        System.out.println(txt.toLowerCase());   
    }
}
