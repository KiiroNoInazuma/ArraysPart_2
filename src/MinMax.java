public class MinMax {
    public static void main(String[] args) {
        InitialArray mm = new InitialArray();
        int[] arr = mm.ledger();
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
        System.out.println(mm.showArray);
    }
}
