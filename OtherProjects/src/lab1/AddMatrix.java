package lab1;

import java.util.*;
public class AddMatrix {
    public static void main(String[] args) {
        System.out.println("Please enter matrix!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of row ?");
        int row = scanner.nextInt();
        System.out.println("Size of columm ?");
        int col = scanner.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.println("Enter the elements of the first matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the first matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The sum of the matrices is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix1[i][j] +matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

