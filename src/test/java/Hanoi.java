package test.java;

import java.util.Scanner;

/**
 * Created by danielbalogh on 5/8/17.
 */
public class Hanoi {

    public void solve(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println(start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }

    public static void main(String[] args) {
        Hanoi towersOfHanoi = new Hanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.solve(discs, "A", "B", "C");
    }
}