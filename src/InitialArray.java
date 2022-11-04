import java.util.Arrays;
import java.util.Random;

public class InitialArray {
    String showArray = Arrays.toString(ledger());

    public int[] ledger() {
        Random random = new Random();
        int[] mass = new int[5];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = 100 + random.nextInt(100) + 1;
        }
        return mass;
    }
}
