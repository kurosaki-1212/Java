// Stringコンストラクタによる文字列の生成

public class StringConstructor {
    public static void main(String[] args) {
        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};

        String s1 = new String();         // String()
        String s2 = new String(c);        // String(char[])
        String s3 = new String(c, 5, 3);  // String(char[], int, int)
        String s4 = new String("XYZ");    // String(String)
        String s5 = "ABC";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
    }
}
