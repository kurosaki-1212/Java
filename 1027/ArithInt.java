import java.util.Scanner;

class ArithInt {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("xの値：");
        int x = stdIn.nextInt();

        System.out.print("yの値：");
        int y = stdIn.nextInt();

        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));
        stdIn.close();
    }
}
