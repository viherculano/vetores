import java.util.Scanner;

public class ex04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] temperatura = new double[12];
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"};
        double media = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Temperatura média de " + mes[i] + ":");
            temperatura[i] = sc.nextDouble();
            media = media + temperatura[i];
        }

        // cálculo da média anual
        media = media / temperatura.length;
        System.out.println("média anual " + String.format("%.2f", media));

        //exibe as temperaturas acima da média
        for (int i = 0; i < temperatura.length; i++) {
            if(temperatura[i] > media) {
                System.out.print(String.format("%-8s", mes[i]));
                System.out.println(String.format("%.2f", temperatura[i]));
            }
        }
    }
}
