package attIFELSE;
import java.util.*;

public class att2 {                    //calcular soma de 2 números
    public static void main(String[] args) {
        Scanner scnNum1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scnNum1.nextInt();

        Scanner scnNum2 = new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        int num2 = scnNum2.nextInt();

        System.out.println("A soma dos dois números é: " + (num1 + num2));
    }
}