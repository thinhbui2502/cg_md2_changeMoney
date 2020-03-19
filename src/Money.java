import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("Enter your money (by USD)");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;

        System.out.println("Tiền VN sau khi chuyển đổi là: " + vnd);
    }
}
