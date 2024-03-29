//スロットマシーンプログラムを作成
//"ゾロ目で大当たり！チャンスは30回"と表示させる
//"begin と入力してください> " と入力すると、開始するようにする
//ランダムな3つの自然数を、"〇回目：xxx" というように表示
//大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示
//30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示
import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_01 {

    public static void main(String[] args) {

        int ChanceCount = 1;

        System.out.println("ゾロ目で大当たり！チャンスは30回");

        System.out.println("begin と入力してください");

        Scanner scanner = new java.util.Scanner(System.in);

        // begin を入力
        String Start = scanner.nextLine();

        // begin と入力されているか判定
        if (Start.equals("begin")) {

            // ChanceCountが三十回以下まで繰り返す
            while (ChanceCount <= 30) {

                // 3つのランダム変数を宣言
                int Slot01 = new Random().nextInt(9) + 1;
                int Slot02 = new Random().nextInt(9) + 1;
                int Slot03 = new Random().nextInt(9) + 1;

                // 3つのランダム変数を表示
                System.out.println(ChanceCount + "回目" + Slot01 + Slot02 + Slot03);

                // 3つの数字が揃っていたら大当たりと表示
                if (Slot01 == Slot02 && Slot02 == Slot03) {

                    System.out.println(ChanceCount + "回目で大当たりです。おめでとうございます！");
                    break;

                }

                // 3つの数字が揃っていなければ30回までカウントをする
                ChanceCount++;

            }

            if (ChanceCount >= 31) {

                // 30回超えたら終了表示
                System.out.println("残念でした。終わります。");

            }
        }
        scanner.close();
    }

}
