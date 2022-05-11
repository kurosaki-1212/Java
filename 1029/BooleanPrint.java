import java.util.Scanner;

public class BooleanPrint {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); int a = stdIn.nextInt();
        System.out.print("整数b："); int b = stdIn.nextInt();

        System.out.println("a <  b  = " + (a <  b));
        System.out.println("a <= b  = " + (a <= b));
        System.out.println("a >  b  = " + (a >  b));
        System.out.println("a >= b  = " + (a >= b));
        System.out.println("a == b  = " + (a == b));
        System.out.println("a != b  = " + (a != b));
        System.out.println("!(a==0) = " + (!(a==0)));
        System.out.println("!(b==0) = " + (!(b==0)));

        stdIn.close();
    }
}