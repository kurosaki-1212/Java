// 日付クラスDay【第１版】利用例（その１：日付を表示）

import java.util.Scanner;

public class DayTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 曜日の配列
        String[] wd = {"日","月","火","水","木","金","土"};
        
        System.out.println("誕生日を西暦で入力せよ。");

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
        Day birthday = new Day(year, month, date);

        // 日付インスタンスのデータを表示
        System.out.println("あなたの誕生日 "
                            + birthday.getYear()  + "年 "
                            + birthday.getMonth() + "月 "
                            + birthday.getDate()  + "日 "
                            + wd[birthday.dayOfWeek()] + "曜日です。");

        stdIn.close();
    }
    
} 