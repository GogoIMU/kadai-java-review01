
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int num1 = 1500;
        double num3 = 0.1;
        int result = tax(num1,num3);
        System.out.println((num1) + "円の商品の税込価格は" + (num1 + result) + "円" + "（消費税は" + (result) + "円）です。");
    }

    public static int tax(int kingaku,double zeiritsu) {
        double syouhizei = kingaku * zeiritsu;
        return (int)syouhizei;
}
}