import java.util.List;
import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(); 
        str.add("あ");
        str.add("い");
        str.add("う");
        str.add("え");
        str.add("お");
        str.remove(2);
        str.add(3, "が");
        int index=str.indexOf("あ");
        if (index >= 0) {
            str.remove(index);
        }
        int index2=str.indexOf("い");
        if (index >= 0) {
            str.remove(index2);
        }

        for (String str1 : str) {
            System.out.print(str1);
        }

    }
}
