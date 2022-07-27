import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
    public static void main(String[] args) {

        List<String> element1 = new ArrayList<>();
        element1.add("aditya");
        element1.add("abhishek");
        element1.add("anirudha");
        element1.add("sanket");
        System.out.println(element1);

        List<String> element2 = new ArrayList<>();
        element2.add("aditya");
        element2.add("abhishek");
        element2.add("anirudha");
        element2.add("sanket");

        boolean val = element1.equals(element2);
        System.out.println(val);
    }
}
