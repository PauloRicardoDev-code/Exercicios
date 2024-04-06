

package ExSequencial01;

import java.util.Scanner;


public class Calculadora {
    
    private int num1;
    private int num2;
    private int soma;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
    public void calculo(int num1,int num2) {
        
        
        
        
        
        Calculadora calc = new Calculadora(num1,num2);
        
        int soma = calc.getNum1() + calc.getNum2();
        
        System.out.println("Entrada   |      saida  ");
        System.out.println(num1+"         "+"|"+"       "+soma);
        System.out.println(num2); 
    }
    
}
