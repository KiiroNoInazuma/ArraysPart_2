public class Confusion {
    public static void main(String[] args) {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int x = reverseFullName.length-1; x >= 0; x--) {
            System.out.print(reverseFullName[x]);
        }
    }
}


//Код, если надо поменять сам массив, а не вывести только печать в правильном порядке.
   /* char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int x = 0; x <= reverseFullName.length / 2; x++) {
                char buffer = reverseFullName[x];
                reverseFullName[x] = reverseFullName[reverseFullName.length - (x + 1)];
                reverseFullName[reverseFullName.length - (x + 1)] = buffer;
                }
                for (int x : reverseFullName)
                System.out.print((char) x);*/
