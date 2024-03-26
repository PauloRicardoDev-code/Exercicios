package exerciciosgit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciciosGIT {

    public static void main(String[] args) {

        System.out.println("Exercicio 1:");
        /*
        Escreva um programa que, com base em uma temperatura em graus celsius,
            a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
            seguindo as fórmulas:
            F = C * 1.8 + 32; 
            K = C + 273.15;
            Re = C * 0.8; 
            Ra = C * 1.8 + 32 + 459.67 
         */

        Scanner sc = new Scanner(System.in);
        Ex1 celsius = new Ex1();
        System.out.println("Digite a temperatura em Celsius");
        double temp = sc.nextDouble();
        celsius.setC(temp);

        celsius.descrever(celsius.getC());

        System.out.println("\n\n\n");

        System.out.println("Exercicio 2:");

        /*Tem-se um conjunto de dados contendo a altura e o sexo (masculino,
        feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
        a. a maior e a menor altura do grupo;
        b. média de altura dos homens;
        c. o número de mulheres.
        */
        
        
        double[] altura = new double[10];
        String[] sexo = new String[10];
        int numMulheres = 0;
        int numHomens = 0;
        double somaAlturaHomens = 0;

        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Bom dia");
            System.out.println("Vamos começar o questionário");
            System.out.println("Qual sua altura?");
            altura[i] = sc.nextDouble();
            System.out.println("Digite o Sexo é:     M | F");
            sexo[i] = sc.next().toLowerCase();

            
            try {
                
                if (sexo[i].equalsIgnoreCase("M")) {
                    somaAlturaHomens = altura[i];
                    numHomens++;
                    
                } else if (sexo[i].equalsIgnoreCase("F")) {
                    numMulheres++;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Inserção de dados incorreta \n"
                        + "Tente novamente");
                i--;
            }
        }

        
        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        
        
        for (int i = 0; i < 10; i++) {
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            
            if(altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        
        double mediaAlturaHomens = somaAlturaHomens / numHomens;
        
        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + numMulheres);

        sc.close();
        
        
    }
}
