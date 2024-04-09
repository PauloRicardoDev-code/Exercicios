
package exerccondicional2;

import java.util.Scanner;


public class ExercCondicional2 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int codigo, quantidade;
        double valor = 0,valorPedido;
        String sair;
        
        
        do {
            
        
        System.out.println(" Codigo |  Especificação  |  Preço  ");
        System.out.println("   1    | Cachorro Quente |  R$4,00 ");
        System.out.println("   2    |     X-Salada    |  R$4,50 ");
        System.out.println("   3    |     X-bacon     |  R$5,00 ");
        System.out.println("   4    | Torrada Simples |  R$2,00 ");
        System.out.println("   5    |  Refrigerante   |  R$1,50 ");
        
        
        
        System.out.println("Digite o codigo do produto escolhido: ");
        codigo = sc.nextInt();
        
        
        switch (codigo) {
            case 1:
                System.out.println("Voce escolheu Cachorro Quente"
                        + " Qual a quantidade ?");
                quantidade = sc.nextInt();
                
                valorPedido = quantidade * 4.00;
                valor = valor + valorPedido;
                valorPedido = 0;
                break;
            case 2:
                System.out.println("Voce escolheu X-Salada"
                        + " Qual a quantidade ?");
                quantidade = sc.nextInt();
                
                valorPedido = quantidade * 4.50;
                valor = valor + valorPedido;
                valorPedido = 0;
                break;
            case 3:
                System.out.println("Voce escolheu X-bacon"
                        + " Qual a quantidade ?");
                quantidade = sc.nextInt();
                
                valorPedido = quantidade * 5.00;
                valor = valor + valorPedido;
                valorPedido = 0;
                break;
            case 4:
                System.out.println("Voce escolheu Torrada Simples"
                        + " Qual a quantidade ?");
                quantidade = sc.nextInt();
                
                valorPedido = quantidade * 2.00;
                valor = valor + valorPedido;
                valorPedido = 0;
                break;
            case 5:
                System.out.println("Voce escolheu Refrigerante"
                        + " Qual a quantidade ?");
                quantidade = sc.nextInt();
                
                valorPedido = quantidade * 2.00;
                valor = valor + valorPedido;
                valorPedido = 0;
                break;
            default:
                throw new AssertionError();   
            }
            
            System.out.println("Total a pagar: R$" + valor);
            System.out.println("Deseja sair ?  S|N");
            sair = sc.next();
            
        } while (!sair.equalsIgnoreCase("S"));
          
        System.out.println("O valor total da compra e de : R$ " + valor  );
        System.out.println("Obrigado pela escolha !!!");
        System.out.println("Volte Sempre !!!");
        
        
    }
    
}
