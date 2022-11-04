public class Accountants {
    public static void main(String[] args) {
        InitialArray acc = new InitialArray();
        int sum = 0;
        for (int t : acc.ledger()) {
            sum += t;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println(acc.showArray);
    }
}
