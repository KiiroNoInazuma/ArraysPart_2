import java.util.Arrays;
import java.util.Random;

public class InitialArray {
    String showArray = Arrays.toString(ledger());

    public int[] ledger() {
        Random random = new Random();
        int[] mass = new int[30];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = 100000 + random.nextInt(100000) + 1;
        }
        return mass;
    }
}
