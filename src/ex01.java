import java.util.Scanner;

public class ex01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < x.length; i++) {
            System.out.print("Informe os valores --> ");
            x[i] = sc.nextInt();
        }

        for(int i = 0; i < x.length; i++) {
            if(x[i] > maior) {
                maior = x[i];
            }
            if(x[i] < menor) {
                menor = x[i];
            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
    }
}
