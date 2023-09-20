package aula17;

import java.util.Scanner;

/**
 *
 * @author Joao valentim
 */
public class aula17 {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("digite um numero inteiro: ");
    n = scanner.nextInt();
    
    for(int i = 2; i < n; i+=2){
        System.out.println(i);
    }
}
}
