package basicJava;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth termth");
        int num= sc.nextInt();
        
        int a=0, b=1, c=0;
    
        if(num<2){
            System.out.println("Please enter the valid number");
        }
        else{
            System.out.println("The fibonacci series are:-");
            for(int i=1; i<num; i++){
               c= a+b;
              a= b;
              b= c;
            }
            System.out.println(c);
    
        }
    
        sc.close();
    }
}
