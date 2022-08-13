package oops.constructors;

import java.util.Scanner;

class sumOfDigits {

    public int num;

    public int sumOfDigits(int num) {
        int sum = 0;
        this.num = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
}

class Calculator {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a NUMBER");
        int num = scan.nextInt();
        sumOfDigits calculator = new sumOfDigits();
        System.out.println(calculator.sumOfDigits(num));

    }
}