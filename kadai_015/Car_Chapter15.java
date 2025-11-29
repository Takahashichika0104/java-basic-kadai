package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;   // 1速から5速
    private int speed = 10; // ギアチェンジ後の速度

    // ギアを変更するメソッド
    public void changeGear(int afterGear) {
        // ギアを変更
        this.gear = afterGear;

        // ギアに応じて速度を設定
        switch (gear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                // 上記以外のギア → 時速10km
                this.speed = 10;
        }
    }

    // 走行する（速度を表示する）メソッド
    public void run() {
        System.out.println("現在の速度は時速" + this.speed + "kmです。");
    }
}
