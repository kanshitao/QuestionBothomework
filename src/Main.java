
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt(); // 读取电脑的价格
        int day = 0;
        int sum = 0;

        while (sum < price) {
            day++;
            sum += day;
        }

        System.out.println(day);
    }
}