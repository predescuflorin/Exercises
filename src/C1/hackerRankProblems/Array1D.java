package C1.hackerRankProblems;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] a = new int[n];

        for (int i= 0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
