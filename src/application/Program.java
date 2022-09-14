package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Enter height: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / n;

        System.out.println();
        System.out.printf("AVERAGE HEIGHT: %.2f", average);
    }
}
