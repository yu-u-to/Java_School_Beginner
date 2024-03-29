//九九の表を、2重の繰り返し(2重for文)を使って表示するプログラム
public class ComprehensiveBeginner01_05 {

    public static void main(String[] args) {
        kuku();
    }

    private static void kuku() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {

                // xを宣言しi、jを計算
                int x = i * j;

                System.out.print(" ");

                if (10 > x)

                    System.out.print(" ");

                // xの結果を表示
                System.out.print(x);

            }

            // 段の改行
            System.out.println();

        }
    }
}
