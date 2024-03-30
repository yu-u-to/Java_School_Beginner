//とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
//人数を入力し、入場料の合計を計算するプログラム

import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        System.out.println("人数を入力してください");
        Scanner scanner = new java.util.Scanner(System.in);

        // 人数を入力
        int menber = scanner.nextInt();
        payment(menber);

        scanner.close();

    }

    private static void payment(int men) {

        int fee = 0;

        if (men <= 4) {

            // 人数が4以下は入場料が600円
            fee = men * 600;

        } else if (men >= 5 && men <= 19) {

            // 人数が5以上19以下は入場料が550円
            fee = men * 550;

        } else if (men >= 20) {

            // 人数が20以上は入場料が500円
            fee = men * 500;

        }

        // 料金を表示
        System.out.println("料金は" + fee + "です");

    }
}
