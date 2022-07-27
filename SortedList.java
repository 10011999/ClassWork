import javafx.print.Collation;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> element = new ArrayList<>();
        element.add("aditya");
        element.add("abhishek");
        element.add("anirudha");
        element.add("sanket");
        System.out.println(element);
        Collections.sort(element);
        System.out.println(element);
    }
}
