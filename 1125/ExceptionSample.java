import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSample {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("xとyを加減乗除します。");

        while(true) {
            try {
                System.out.print("xの値：");
                int x = stdIn.nextInt();

                System.out.print("yの値：");
                int y = stdIn.nextInt();

                System.out.println("x + y = " + (x + y));
                System.out.println("x - y = " + (x - y));
                System.out.println("x * y = " + (x * y));
                System.out.println("x / y = " + (x / y));
                System.out.println("x % y = " + (x % y));
            } catch (InputMismatchException e) {
                System.out.println("入力エラー発生");
                String s = stdIn.next();
                System.out.println(s + "は無視しました");
            } catch (ArithmeticException e) {
                System.out.println("算術エラー発生");
                System.out.println("エラーが出ないような数値をお願いします");
            } finally {
                System.out.println("-----------------------");
                System.out.println("もう一度？（1...Yes/2...No) :");
                int retry = stdIn.nextInt();
                System.out.println("-----------------------");
                if (retry == 2) break;
            }
        }

        stdIn.close();
    }
}
