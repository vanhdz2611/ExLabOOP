package lab1;

import java.util.*;
public class Triangle_Height_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < 2*n + 2; j++) {
                if (j < n+1-i) {
                    System.out.print(" ");
                    
                }
                if (j >= n+1-i && j <= n+1-i+2*(i-1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
            
    }
}