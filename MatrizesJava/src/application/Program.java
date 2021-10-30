package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Criando uma matriz em java
        int[][] mat = new int[n][n]; // instancia de uma matriz na memória

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Print da diagonal principal
        System.out.println("Main diagonal: ");
        for (int i=0;i<n;i++) {
            System.out.print(mat[i][i] + " ");
        }

        // Print da quantidade dos números negativos
        int count = 0;
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count +=1;
                }
            }
        }

        System.out.println("");
        System.out.printf("Números negativos: %d", count);
        sc.close();
    }
}
