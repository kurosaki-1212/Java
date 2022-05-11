import java.util.Scanner;

public class DayComparator {
    static boolean compDay(Day d1, Day d2) {
        return d1.getYear() == d2.getYear() &&
               d1.getMonth() == d2.getMonth() &&
               d1.getDate() == d2.getDate();
        }

        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);

            System.out.println("day1を入力せよ。");

        // 年の入力
        System.out.print("年："); 
        int year = stdIn.nextInt();

        // 月の入力
        System.out.print("月："); 
        int month = stdIn.nextInt();

        // 日の入力
        System.out.print("日："); 
        int date = stdIn.nextInt();

        // 日付クラスのインスタンスを生成
        Day day1 = new Day(year, month, date);


        System.out.println("day2を入力せよ。");

        // 年の入力
        System.out.print("年："); 
        int year2 = stdIn.nextInt();

        // 月の入力
        System.out.print("月："); 
        int month2 = stdIn.nextInt();

        // 日の入力
        System.out.print("日："); 
        int date2 = stdIn.nextInt();

        // 日付クラスのインスタンスを生成
        Day day2= new Day(year2, month2, date2);

            if (compDay(day1, day2))
                System.out.println("等しいです");
            else
                System.out.println("等しくありません");

        stdIn.close();
        }
    }

