import java.util.Scanner;

public class DoWhileNumeroImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro>1: ");

        int banana = scanner.nextInt();


        while (banana < 10) {

            if (banana % 2 == 0) {
                System.out.println(banana);


            }

             banana++;
        }

    }
}



