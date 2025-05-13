import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a, b;
        a = sc.nextShort();
        b = sc.nextShort();

        System.out.println(Math.sqrt(a * a + b * b));
    }
}
