import java.util.Random;
import java.util.Scanner;

public class ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        Random random = new Random();
        int aux, j;

        // geração e impressão dos valores
        System.out.println("Antes da inversão:");
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1,30);
            System.out.print(x[i] + " ");
        }

        // inversão dos valores
        j = x.length - 1;
        for (int i = 0; i < x.length / 2; i++, j--) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }

        // impressão após a inversão
        System.out.println("\nDepois da inversão:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
    }
}
