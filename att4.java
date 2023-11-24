package attIFELSE;

import java.util.Scanner;

public class att4 {                             //verificar idade acima de 18 anos
    public static void main(String[] args) {  

        Scanner intScanner = new Scanner(System.in);
        System.out.println("Digite o ano que em que estamos: ");
        int anoAtual = intScanner.nextInt();

        Scanner nascScanner = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int anoNasc = nascScanner.nextInt();

        int result = anoAtual - anoNasc;
        System.out.println(result);

        if (result > 18) {
            System.out.println("Você é maior de idade!");
      } else if (result == 18){
            System.out.println("Você acabou de completar seus 18!");
      } else {
            System.out.println("Você é menor de idade!");
      }         
    } 
}
