//整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
//小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラム
import java.util.Scanner;

public class ComprehensiveBeginner01_02 {

    public static void main(String[] args) {

        System.out.println("整数を三回入力してください");
        Scanner scanner = new java.util.Scanner(System.in);

        // 整数を3回入力する
        int inputNum01 = scanner.nextInt();
        int inputNum02 = scanner.nextInt();
        int inputNum03 = scanner.nextInt();
        junban(inputNum01, inputNum02, inputNum03);

        scanner.close();
    }

    private static void junban(int a, int b, int c) {

        if (a < b && b < c) {

            // 入力された数値が小さい順ならOKと表示
            System.out.println("OK");

        } else {

            // 小さい順でなければNGと表示
            System.out.println("NG");

        }
    }
}
