package kadai_028;
	

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        Scanner sc = new Scanner(System.in);
        String myChoice = "";

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            myChoice = sc.nextLine();

            // 正しい入力かどうか判定
            if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
                // 正しい場合は返す
                return myChoice;
            } else {
                // 間違った入力ならエラーを出して再入力
                System.out.println("入力が正しくありません。再度入力してください。");
            }
        }
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        String[] te = { "r", "s", "p" }; // 配列にじゃんけんの手をセット

        double rnd = Math.random() * 3; // 3未満の乱数
        int index = (int) Math.floor(rnd); // 切り捨て 0〜2

        return te[index]; // 配列の0〜2の要素から取得
    }

    // じゃんけんを行う
    public void playGame(String my, String enemy) {

        // HashMap を使って日本語の手を保持
        HashMap<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        // 手を出力
        System.out.println("自分の手は" + map.get(my) + ",対戦相手の手は" + map.get(enemy));

        // 勝敗判定
        if (my.equals(enemy)) {
            System.out.println("あいこです");
        } 
        else if ((my.equals("r") && enemy.equals("s")) ||
                 (my.equals("s") && enemy.equals("p")) ||
                 (my.equals("p") && enemy.equals("r"))) {
            System.out.println("自分の勝ちです");
        } 
        else {
            System.out.println("自分の負けです");
        }
    }

}
