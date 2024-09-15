package Solutions;

public class NumberIntoDIgit {
    public static void main(String[] args) {
        int num=10;
        System.out.println(isDivisible(num));
    }

    private static boolean isDivisible(int num){
       char[] ch= (Integer.toString(num)).toCharArray();
    

       for(int i=0; i<ch.length; i++){
        if(ch[i]=='0'){
            return false;
        }

         if(num%(Integer.parseInt(Character.toString(ch[i])))!=0){
            return false;
         }
         
       }

       return true;
    }
}
