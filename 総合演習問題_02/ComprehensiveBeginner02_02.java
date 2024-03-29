//ジャンケンプログラムを作成
//"ジャンケン"と表示
//"0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
//それ以外の数字が入力された場合、エラーとして説明した後に 数字入力に戻るようにする
//ジャンケン処理を実装
import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {

        System.out.println("ジャンケン");
        System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");

        Scanner scanner = new java.util.Scanner(System.in);

        // プレイヤーのジャンケンの手 を入力
        int jankenP = scanner.nextInt();

        // NPCのランダム変数を宣言
        int jankenN = new Random().nextInt(3);

        // 入力値が3以上の時
        while (jankenP >= 3) {

            // もう一度入力するよう表示
            System.out.println("もう一度入力してください");
            jankenP = scanner.nextInt();

        }

        JankenPlayer(jankenP);
        JankenNPC(jankenN);

        // ジャンケンの勝敗を判定
        // プレイヤーの手がグーの時判定
        if (jankenP == 0) {
            if (jankenN == 0) {

                // NPCの手がグーの時あいこ表示
                System.out.println("あいこです");

            } else if (jankenN == 1) {

                // NPCの手がチョキの時勝ち表示
                System.out.println("あなたの勝ちです");

            } else if (jankenN == 2) {

                // NPCの手がパーの時負け表示
                System.out.println("あなたの負けです");

            }
            // プレイヤーの手がチョキの時判定
        } else if (jankenP == 1) {
            if (jankenN == 0) {

                // NPCの手がグーの時負け表示
                System.out.println("あなたの負けです");

            } else if (jankenN == 1) {

                // NPCの手がチョキの時あいこ表示
                System.out.println("あいこです");

            } else if (jankenN == 2) {

                // NPCの手がパーの時勝ち表示
                System.out.println("あなたの勝ちです");

            }
            // プレイヤーの手がパーの時判定
        } else if (jankenP == 2) {
            if (jankenN == 0) {

                // NPCの手がグーの時勝ち表示
                System.out.println("あなたの勝ちです");

            } else if (jankenN == 1) {

                // NPCの手がチョキの時負け表示
                System.out.println("あなたの負けです");

            } else if (jankenN == 2) {

                // NPCの手がパーの時あいこ表示
                System.out.println("あいこです");

            }
        }

        scanner.close();

    }

    private static void JankenPlayer(int PlayerHand) {

        System.out.print("プレイヤーの手 :");

        // プレイヤーの手を表示
        switch (PlayerHand) {
            case 0:
                System.out.println("グー");
                break;

            case 1:
                System.out.println("チョキ");
                break;

            case 2:
                System.out.println("パー");
                break;

            default:
                System.out.println("表示できません");
                break;
        }

    }

    private static void JankenNPC(int NPCHand) {

        System.out.print("NPCの手 :");

        // NPCの手を表示
        switch (NPCHand) {
            case 0:
                System.out.println("グー");
                break;

            case 1:
                System.out.println("チョキ");
                break;

            case 2:
                System.out.println("パー");
                break;
            default:
                System.out.println("手が分かりません");
                break;
        }

    }
}
