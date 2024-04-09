
package exerccondicional1;

import java.util.Scanner;


public class ExercCondicional1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sair;
        do {
            
        System.out.println("Digite um numero : ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("O numero é negativo!");
        }else{
            System.out.println("O numero é positivo!");
        }
            System.out.println("Deseja Sair ?   S|N");
            sair = sc.next();
        } while (sair.equalsIgnoreCase("S"));
        
        System.out.println("Obrigado pela experiencia");
    }
    
}
