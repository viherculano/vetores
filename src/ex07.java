import java.util.Random;
import java.util.Scanner;

public class ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] x = new int[10];
        int cont, grau = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1,10);
            System.out.print(x[i] + "\t");

        }

        for (int i = 0; i < x.length; i++) {
            cont = 0;
            for (int j = 0; j < x.length; j++) {
                if(x[i] == x[j]) {
                    cont++;
                }
            }
            if(cont > grau) {
                grau = cont;
            }
        }
        System.out.println(grau);
    }
}
