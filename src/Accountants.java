import java.util.Arrays;

public class Accountants {
    public static void main(String[] args) {
        InitialArray acc = new InitialArray();
        int[] account = acc.ledger();
        int sum = 0;
        for (int t : account) {
            sum += t;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println(Arrays.toString(account));
    }
}
