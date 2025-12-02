package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

    private HashMap<String, String> fruitMap; // 英単語の辞書として機能する

    public Dictionary_Chapter21() {
        fruitMap = new HashMap<>();
        tuika();
    }

    // 辞書に単語を追加するメソッド
    public void tuika() {
        fruitMap.put("apple", "りんご");
        fruitMap.put("peach", "桃");
        fruitMap.put("banana", "バナナ");
        fruitMap.put("lemon", "レモン");
        fruitMap.put("pear", "梨");
        fruitMap.put("kiwi", "キウィ");
        fruitMap.put("strawberry", "いちご");
        fruitMap.put("grape", "ぶどう");
        fruitMap.put("muscat", "マスカット");
        fruitMap.put("cherry", "さくらんぼ");
    }

    // 単語を配列で受け取り繰り返し検索するメソッド
    public void searchWords(String[] words) {
        for (String word : words) {
            if (fruitMap.containsKey(word)) {
                System.out.println(word + "の意味は" + fruitMap.get(word) + "です");
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}