// 識別番号クラス（その１）

class Id {
    static int counter = 0;

    private int id;

    //--- コンストラクタ ---//
    public Id() {
        id = ++counter;
    }

    //--- 識別番号を取得 ---//
    public int getId() {
        return id;
    }
}

public class IdTester {
    public static void main(String[] args) {
		Id a = new Id();		// 識別番号１番
		Id b = new Id();		// 識別番号２番

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());

		System.out.println("Id.counter = " + Id.counter);
		System.out.println("a.counter  = " +  a.counter);
		System.out.println("b.counter  = " +  b.counter);
	}
}
