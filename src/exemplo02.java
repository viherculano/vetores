import java.util.Random;

public class exemplo02 {
    static void main() {
        Random random = new Random();
        int x;
        double y;

        x = random.nextInt(10, 20);
        y = random.nextDouble();

        System.out.println(x);
        System.out.println(y);
    }
}
