import java.util.Scanner;

class HelloNext {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前は：");
        String str = stdIn.next();

        System.out.println("こんにちは" + str + "さん。");
        stdIn.close();
    }
}

