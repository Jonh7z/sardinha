package aula12;

import java.util.Scanner;

public class aula12 {
    public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       int idade;
        System.out.println("digite a sua idade:");
        idade = ler.nextInt();
        if (idade<=18){
            System.out.println("e menor de idade");
        }else{
            System.out.println("e maior de idade");
        }
        
    }
    
}
