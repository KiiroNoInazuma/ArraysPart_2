import java.util.Random;

public class Accountants {

    Random random = new Random();

    public int[] ledger() {
        int[] mass = new int[30];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = 100000 + random.nextInt(100000) + 1;
        }
        return mass;
    }

    public static void main(String[] args) {
        int sum = 0;
        Accountants acc = new Accountants();
        int[] total = acc.ledger();
        for (int t : total) {
            sum += t;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
}
