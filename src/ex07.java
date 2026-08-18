import java.util.Random;
import java.util.Scanner;

public class ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1,10);
            System.out.print(x[i] + "\t");

        }
    }
}
