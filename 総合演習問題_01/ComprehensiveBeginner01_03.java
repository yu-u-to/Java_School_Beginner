import java.util.Scanner;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {

        int a, b, c, d;

        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("二次方程式y=ax^2+bx+cの解を判別します");

        // 整数をa,b,cを入力する
        System.out.print("aを入力してください：");
        a = scanner.nextInt();

        System.out.print("bを入力してください：");
        b = scanner.nextInt();

        System.out.print("cを入力してください：");
        c = scanner.nextInt();

        d = (b * b) - 4 * a * c;

        System.out.println("y=" + a + "x^2+" + b + "x+" + c + "の判定は以下の通りです");

        if (d > 0) {

            // Dが0以上は異なる実数解をもつと表示
            System.out.println("判別式D＞0");
            System.out.print("２つの異なる実数解をもつ");

        } else if (d == 0) {

            // Dが0は実数の重解をもつと表示
            System.out.println("判別式D＝0");
            System.out.print("実数の重解をもつ");

        } else if (d < 0) {

            // Dが0以下の場合実数解をもたないと表示
            System.out.println("判別式D＜0");
            System.out.print("実数解をもたない");

        }

        scanner.close();
    }
}
