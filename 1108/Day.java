public class Day {
    private int year;
    private int month;
    private int date;

    /**
     * コンストラクタ
     * 
     * @param なし
     */
    public Day() {
        set(1, 1, 1);
    }

    /**
     * コンストラクタ
     * 
     * @param year 年
     */
    public Day(int year) {
        set(year, 1, 1);
    }

    /**
     * コンストラクタ
     * 
     * @param year 年
     * @param month 月
     */
    public Day(int year, int month) {
        set(year, month, 1);
    }

    /**
     * コンストラクタ
     * 
     * @param year 年
     * @param month 月
     * @param date 日
     */
    public Day(int year, int month, int date) {
        set(year, month, date);
    }

    /**
     * コンストラクタ
     * 
     * @param d 日付インスタンス
     */
    public Day(Day d) {
        set(d.getYear(), d.getMonth(), d.getDate());
    }

    // 年月日を取得
    public int getYear() {
        return this.year;
    }
    public int getMonth() {
        return this.month;
    }
    public int getDate() {
        return this.date;
    }

    // 年月日を設定
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }    
    public void setDate(int date) {
        this.date = date;
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // 曜日を求める
    int dayOfWeek() {
        int y = year;
        int m = month;
        
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y /4 -y / 100 + y /400 + (13 * m + 8) / 5 + date) % 7;
    }

    /**
     * 年月日を比較する
     * 
     * @param d 日付インスタンス
     * @return 同じ年月日の場合：true / その他：false 
     */
    public boolean equalTo(Day d) {
        boolean result = year == d.getYear()
                            &&
                         month == d.getMonth()
                            &&
                         date == d.getDate();
        return result;
    }

    /** 
     * 文字列表現を返却
     * 
    */
    public String toString() {
        String[] wd = {"日","月","火","水","木","金","土"};

        return String.format("%04d年%02d月%02d日(%s)",
                                year, month, date, wd[dayOfWeek()]);
    }
}
