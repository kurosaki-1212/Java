import java.util.Scanner;

class Menseki {

    private double teihenn;
    private double takasa;

    public Menseki(double teihenn, double takasa) {
        this.teihenn = teihenn;
        this.takasa = takasa;
    }

    public double getTeihenn() {
        return teihenn;
    }
    public double getTakasa() {
        return takasa;
    }
    public void setTeihenn(double teihenn) {
        this.teihenn = teihenn;
    }
    public void setTakasa(double takasa) {
        this.takasa = takasa;
    }

    public double Menseki2() {
        return this.teihenn * this.takasa  / 2;
    }
    
    public double Menseki2(double deta, double deta1) {
        return teihenn * takasa / 2;
    }
}


public class Sankaku {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("底辺：");
        double deta = stdIn.nextInt();
        System.out.print("高さ：");
        double deta1 = stdIn.nextInt();

        Menseki menseki = new Menseki(deta, deta1);
        double alia = menseki.Menseki2();

        System.out.print("三角形の二倍の面積は" + alia);

        stdIn.close();
    }
}
