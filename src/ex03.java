import java.util.Random;
import java.util.Scanner;

public class ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double nota1, nota2, nota3, nota4;
        double[] media = new double[10];
        int aprovados = 0;

        for(int i = 0; i < media.length; i++) {
            nota1 = random.nextDouble(0,10);
            nota2 = random.nextDouble(0,10);
            nota3 = random.nextDouble(0,10);
            nota4 = random.nextDouble(0,10);
            media[i] = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println(media[i]);
            if(media[i] >= 6) {
                aprovados++;
            }
        }

        System.out.println("total de aprovados --> " + aprovados);
    }
}
