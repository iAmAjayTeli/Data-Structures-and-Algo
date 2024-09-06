package basicJava;

public class searchCharacter {
    public static void main(String[] args) {
        String name="Ajay";
        char target='z';

      Boolean ans=  searhTarget(name, target);
      System.out.println(ans);
    }

    private static Boolean searhTarget(String name, char target) {
        if (name.length()==0) {
        return false;
        }

        else{
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i)==target){
                    return true;
                }
            }
        }

        return false;
    }

    


}
