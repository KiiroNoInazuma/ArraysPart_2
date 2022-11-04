import java.util.Arrays;

public class ArrAverage {
    public static void main(String[] args) {
        double avg = 0;
        InitialArray arrAver = new InitialArray();
        int[] arMass = arrAver.ledger();
        for (int x : arMass) {
            avg += x;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (avg / arMass.length) + " рублей");
        System.out.println(Arrays.toString(arMass));
    }


}



