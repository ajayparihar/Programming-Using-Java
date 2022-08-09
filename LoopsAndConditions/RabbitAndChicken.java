package LoopsAndConditions;

import java.util.Scanner;

public class RabbitAndChicken {

    public static void main(String[] args) {

        int heads;
        int legs;
        int noOfRabbits;
        int temp;
        int noOfChickens;
        int totalCheck;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of HEADS");
        heads = scan.nextInt();

        System.out.println("Enter number of LEGS");
        legs = scan.nextInt();

        temp = legs - (heads * 2);
        noOfRabbits = temp / 2;
        noOfChickens = heads - noOfRabbits;

        totalCheck = legs - ((noOfRabbits * 4) + (noOfChickens * 2));

        if (totalCheck == 0) {
            System.out.println("Chickens=" + noOfChickens);
            System.out.println("Rabbits=" + noOfRabbits);
        } else {
            System.out.println("The Number of Chickens and Rabbits cannot be found");
        }
        scan.close();
    }
}
