import java.awt.*;
import java.util.Scanner;

public class Menu {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     String[] menu = {"1","2"};

     System.out.println("Escolha : ");
     //System.out.println("1 - Sim,  0 - Não");

     String n = scanner.next();
     for(int i =0; i<2; i++) {
         System.out.println("1 - Sim,  0 - Não");

         if (n != "1" && n != "0") {
             System.out.println("Encerrado!");

         }



     }




}
}
