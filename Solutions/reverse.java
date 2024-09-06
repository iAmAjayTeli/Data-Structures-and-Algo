package Solutions;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        while (num>0) {
            int rem= num%10;
            System.out.print(rem);
            num= num/10;
        }
        sc.close();
    }
}
