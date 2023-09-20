
package aula4;

/**
 * atvdd 4
 * disciplina: linguagem de programação
 * materia: operadores atribuição e aritméticos
 * doc 1:https://www.devmedia.com.br/java-operadores-de-atribuicao-aritmeticos-relacionais-e-logicos/38289
 * @author Valentim
 */
public class aula4 {
    public static void main(String[] args) {
        int a = 10;
        String b = "10";
        int c = 2;
        
        int resultadoA = a + c;
        int resultadoB = a - c;
        int resultadoC = a * c;
        int resultadoD = a / c;
        int resultadoE = a % c;
        int resultadoF = (int)a / c;
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("soma: " + resultadoA);
        System.out.println("subtração: " + resultadoB);
        System.out.println("multiplicação: " + resultadoC);
        System.out.println("divisão: " + resultadoD);
        System.out.println("resto: " + resultadoE);
        System.out.println("resultado como inteiro: " + resultadoF);
        
        
    }
}
