import java.util.Random;

public class ex10 {
    static void main() {
        Random random = new Random();
        int[] x = new int[10];
        int aux;

        System.out.println("Antes da ordenação: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(5,100);
            System.out.print(x[i] + "\t");
        }

        // ordenação
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] < x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }

        System.out.println("\nDepois da ordenação: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
}
