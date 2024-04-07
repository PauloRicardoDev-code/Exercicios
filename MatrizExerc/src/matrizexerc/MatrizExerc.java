
package matrizexerc;

import java.util.Scanner;


public class MatrizExerc {


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                
            }
        }
        
        
        System.out.println("Main Diagonal");
        
        for (int i = 0; i < n; i++) {            
                System.out.print(mat[i][i] + " ");     
        }
        System.out.println();
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("Negative Numbers :" + cont );
        sc.close();
    }
}