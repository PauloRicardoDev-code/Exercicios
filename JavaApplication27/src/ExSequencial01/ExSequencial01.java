/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExSequencial01;

import java.util.Scanner;

public class ExSequencial01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero ?");
        int num1 = sc.nextInt();
        
        System.out.println("Digite o primeiro numero ?");
        int num2 = sc.nextInt();
        
        Calculadora calc = new Calculadora(num1, num2);
        calc.calculo(num1, num2);
        
    }
    
}
