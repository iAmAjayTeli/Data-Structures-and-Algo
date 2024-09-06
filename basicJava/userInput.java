package basicJava;

import java.util.Scanner;

/**
 * userInput
 */
public class userInput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        System.out.println("the number is "+ num);

        sc.close();

    } 
                                            
}