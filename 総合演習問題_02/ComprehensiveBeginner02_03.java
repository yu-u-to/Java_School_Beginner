//以下の表示結果が表示されるよう、下記のクラスを使用してコーディング
//buyDrink() メソッドを持つ、Coffee クラスを使用する
//buyDrink() メソッドを持つ、Juice クラスを使用する
//表示内容---------------------------------------------------
//バヤリース の オレンジ 味です。130 円になります。
//午後の紅茶 の レモンティー 味です。150 円になります。
//ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
//ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
//-----------------------------------------------------------

class Coffee {

    String name = "coffee";
    String sweetness = "nothing";
    int price = 0;
    boolean milk;

    public void buyDrink() {

        // コーヒーの甘さ
        switch (sweetness) {
            case "modest":
                System.out.print("甘さは 控え目、 ");
                break;

            case "sweet":
                System.out.print("甘さは 甘め、");
                break;

            default:
                System.out.print("表示できません");
                break;
        }

        // ミルク有り無し判定
        if (milk == true) {

            System.out.print("ミルク 入りです。");

        } else if (milk == false) {

            System.out.print("ミルク 無しです。");

        }
        // コーヒーの値段表示
        System.out.println(price + "円になります。");
    }

}

class Juice {

    String name = "juice";
    String type = "nothing";
    int price = 0;

    public void buyDrink() {

        // ジュースの味
        switch (type) {
            case "orange":
                System.out.print("オレンジ味 です。");
                break;

            case "lemontea":
                System.out.print("レモンティー味 です。");
                break;

            default:
                System.out.print("表示できません");
                break;
        }

        // ジュースの値段表示
        System.out.println(price + "円になります。");
    }

}

public class ComprehensiveBeginner02_03 {

    public static void main(String[] args) {

        // Juiceをインスタンス化
        Juice m_juice = new Juice();
        // Coffeeをインスタンス化
        Coffee m_coffee = new Coffee();

        // バヤリースの値を代入
        m_juice.name = "バヤリース の";
        System.out.print(m_juice.name);
        m_juice.type = "orange";
        m_juice.price = 130;
        m_juice.buyDrink();

        // 午後の紅茶の値を代入
        m_juice.name = "午後の紅茶 ";
        System.out.print(m_juice.name);
        m_juice.type = "lemontea";
        m_juice.price = 150;
        m_juice.buyDrink();

        // ボスの値を代入
        m_coffee.name = "ボス の";
        System.out.print(m_coffee.name);
        m_coffee.sweetness = "modest";
        m_coffee.milk = false;
        m_coffee.price = 110;
        m_coffee.buyDrink();

        // ジョージアの値を代入
        m_coffee.name = "ジョージア の";
        System.out.print(m_coffee.name);
        m_coffee.sweetness = "sweet";
        m_coffee.milk = true;
        m_coffee.price = 120;
        m_coffee.buyDrink();

    }
}
