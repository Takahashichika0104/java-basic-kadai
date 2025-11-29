package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        // 車のインスタンスを生成
        Car_Chapter15 gear = new Car_Chapter15();
        
        // ギアチェンジし、その結果を表示する
        gear.changeGear(3);
        gear.run();
    }
}