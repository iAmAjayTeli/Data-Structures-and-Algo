package basicJava;
import java.util.List;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(5);

        int size=ans.size();
        System.out.println(size);

        System.out.println(ans.get(0)==5);
    }
}
