// 日付クラスDay【第１版】利用例（その１：日付を表示）

import java.util.Scanner;

public class DayTester2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("day1を入力せよ。");

        // 年の入力
        System.out.print("年："); int year = stdIn.nextInt();

        // 月の入力
        System.out.print("月："); int month = stdIn.nextInt();

        // 日の入力
        System.out.print("日："); int date = stdIn.nextInt();

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

        // 日付の比較
        if (day1 == day2) {
            System.out.println("等しいです");
        } else {
            System.out.println("等しくないです");
        }

        Day day3 = day1;
        day3.set(2999, 12, 31);

        System.out.printf("day1 = %d年%d月%d日\n", day1.getYear(), day1.getMonth(), day1.getDate());
        System.out.printf("day3 = %d年%d月%d日\n", day3.getYear(), day3.getMonth(), day3.getDate());

        stdIn.close();
    }
}