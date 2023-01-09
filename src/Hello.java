public class Hello {
    public static void main(String[] args) {
        int t = 15;
        if (t < 0) {
            System.out.println(" it's very cold!");
        } else {
            System.out.println("it's quite warm");
        }
        System.out.println(t < 0? " it's very cold!" : "it's quite warm"); // второй способ
    }
}
