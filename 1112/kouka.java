class Pokemon {
    protected String name;
    protected String type;
    protected int age;
    protected String roar;

    public Pokemon(String name, String type, int age, String roar) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.roar = roar;
    }

    public void greeting() {
        System.out.printf("「%s」\n", roar);
    }

    public void introduction() {
        System.out.printf("私は%sです\n", name);
        System.out.printf("年齢は%dです\n", age);
        System.out.printf("%sタイプです\n", type);
    }
}

class Pikachu extends Pokemon{
    public Pikachu(String name, String type, int age, String roar) {
        super(name, type, age, roar);
    }
    @Override
    public void introduction() {
        super.greeting();
        System.out.printf("僕は%sです\n", name);
        System.out.printf("年齢は%dです\n", age);
        System.out.printf("%sタイプです\n", type);
    }
}

class Pochama extends Pokemon{
    public Pochama(String name, String type, int age, String roar) {
        super(name, type, age, roar);
    }
    @Override
    public void introduction() {
        super.greeting();
        super.introduction();
    }
}

public class kouka {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("ピカチュー", "でんき", 6, "ピカピカー！");
        Pochama pochama = new Pochama("ポッチャマ", "みず", 7, "ぽっちゃまー！");

        pikachu.introduction();
        System.out.println("");
        pochama.introduction();
    }
}
