package Solutions;

public class factorialPractice {
    public static void main(String[] args) {
        int num=5;
        System.out.println(findfactorial(num));
    }

    private static int findfactorial(int num){

        if(num<2){
            return num;
        }

        return num*findfactorial(num-1);
    }
}
