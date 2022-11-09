import java.util.Random;

public class InitialArray {
    public int[] ledger() {
        Random random = new Random();
        int[] mass = new int[5];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = 100000 + random.nextInt(100000) + 1;
        }
        return mass;
    }
}
