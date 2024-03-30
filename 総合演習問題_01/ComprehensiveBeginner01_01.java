//整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラム

import java.util.Scanner;

public class ComprehensiveBeginner01_01 {

    public static void main(String[] args) {

        System.out.println("整数を入力してください");
        Scanner scanner = new java.util.Scanner(System.in);

        // 整数を入力
        int inputNum = scanner.nextInt();
        nanber(inputNum);

        scanner.close();
    }

    private static void nanber(int a) {
        if (a % 2 == 0) {

            // 数値が偶数ならevenと表示
            System.out.println("even");

        } else {

            // 数値が奇数ならoddと表示
            System.out.println("odd");

        }
    }
}
