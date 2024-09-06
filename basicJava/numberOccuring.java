package basicJava;

import java.util.Scanner;

public class numberOccuring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int  num= sc.nextInt();
        System.out.println("number to search:");
        int search= sc.nextInt();

        int count= 0;
        while(num>0){
            int rem= num%10;
            if(rem==search){
                count++;
            }
                num= num/10;
        }

    System.out.println(count);


        sc.close();
    }
}
