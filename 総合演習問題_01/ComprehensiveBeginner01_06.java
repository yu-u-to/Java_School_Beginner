//1から100までの値を繰り返しで表示するが、3の倍数の時はfoo、5の倍数の時はbarと数字の代わりに表示するプログラム
//3と5の両方の倍数の時はfoobarと表示
public class ComprehensiveBeginner01_06 {

    public static void main(String[] args) {
        count();
    }

    private static void count() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {

                // 3の倍数の時fooと表示
                System.out.println("foo");

            } else if (i % 3 != 0 && i % 5 == 0) {

                // 5の倍数の時barと表示
                System.out.println("bar");

            } else if (i % 3 == 0 && i % 5 == 0) {

                // 3と5の倍数の時foobarと表示
                System.out.println("foobar");

            } else

                System.out.println(i);

        }
    }
}
