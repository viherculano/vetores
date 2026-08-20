import java.util.Random;

public class ex09 {
    static void main() {
        Random random = new Random();
        int[] x = new int[random.nextInt(3,15)];
        boolean achou;

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(15);
            achou = false;
            for (int j = 0; j < i; j++) {
                if(x[i] == x[j]) {
                    achou = true;
                    break;
                }
            }
            if(achou == false) {
                System.out.print(x[i] + "\t");
                i++;
            }
        }
    }
}
