package basicJava;

public class StringPractice {
    
    public static void main(String[] args) {
        String a="Ajay";
        String b= "Ajay";
        System.out.println(a==b);

        String name=new String("Ajay");
        String name2= new String("Ajay");
        System.out.println(name==name2);

        a="Suraj";
        System.out.println(a);
    }
}
