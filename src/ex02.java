import java.util.Scanner;

public class ex02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[10];
        int par = 0;

        for(int i = 0; i < x.length; i++) {
            System.out.print("Valor: ");
            x[i] = sc.nextInt();
            if(x[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("Total de pares = " + par);
        System.out.println("Total de ímpares = " + (x.length - par));
    }
}
