package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;   // 現在のギア（初期値 1）
    private int speed = 10; // 現在の速度（初期値 10）

    // ギアを変更するメソッド
    public void changeGear(int afterGear) {
        int beforeGear = this.gear; // 変更前ギアを保存

        // ギア変更
        this.gear = afterGear;

        // ギアに応じて速度を設定
        switch (gear) {
            case 1:  speed = 10; break;
            case 2:  speed = 20; break;
            case 3:  speed = 30; break;
            case 4:  speed = 40; break;
            case 5:  speed = 50; break;
            default: speed = 10;
        }

        // 変更メッセージ表示
        System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
    }

    // 走行する（速度を表示する）メソッド
    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}

