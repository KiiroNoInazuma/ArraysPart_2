public class MinMax extends Accountants {
    public static void main(String[] args) {
        Accountants acc = new MinMax();
        int[] arr = acc.ledger();
        int resultMin = arr[0];
        int resultMax = resultMin;

        for (int x : arr) {
            if (resultMin > x) {
                resultMin = x;
            } else if (resultMax < x) {
                resultMax = x;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + resultMin + " рублей. Максимальная сумма трат за день составила " + resultMax + " рублей.");
        System.out.println(acc.showArray);
    }
}
