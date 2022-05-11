import java.util.Random;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int val = rand.nextInt(5, 10);
        
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < val; i++) {
            num.add(i);
        }
        for (int nam : num) {
            System.out.print(nam + " ");
        }
    }
}
