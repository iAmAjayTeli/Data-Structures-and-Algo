package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class userInput2 {
    public static void main(String[] args) throws Exception{

       BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int num= Integer.parseInt(bf.readLine());

        System.out.println("The number is"+ num);
       
    }
}                                                                                                        
