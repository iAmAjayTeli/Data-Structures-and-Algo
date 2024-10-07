package Solutions;

import java.util.Scanner;
import java.lang.Math;;

public class CommandLineArgument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=3;
  double ans=Math.pow(2, n);
     long ans2= Double.valueOf(ans).longValue();
     System.out.println(ans2);
        sc.close();
    }
}
