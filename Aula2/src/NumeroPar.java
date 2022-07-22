import java.util.Scanner;
public class NumeroPar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        while (Y <  100) {
            if (Y%2==1) {

                System.out.println(Y);

            }
            Y++;
        }
    }
}

