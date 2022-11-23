import java.util.Random;
import java.util.Scanner;

public class Testes {
    
    public static void main(String[] args) {
        Random gerador = new Random();

        int a = gerador.nextInt(100);
        int b = gerador.nextInt(100);
  
        System.out.println(a);
        System.out.println(b);

        if (a == b) {
            System.out.print("São iguais!");
        } else {
            System.out.print("Não são iguais!");
        }
    }
}