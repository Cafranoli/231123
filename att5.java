package attIFELSE;

import java.util.Scanner;                  

public class att5 {                       //validar altura máxima de pacote (altura x largura x comprimento)
    public static void main(String[] args) {  

        int altMax = 2005;

        Scanner altScanner = new Scanner(System.in);
        System.out.println("Aviso: a altura do pacote esta medida em centímetros! ");
        System.out.println("Digite a altura do pacote: ");
        int alt = altScanner.nextInt();

        if (alt == 2005) {
            System.out.println("A altura esta no limite do permitido! Não será possível adicionar mais valores.");
        }else if (alt > 2005) {
            System.out.println("A altura excedeu o permitido!");
        }else if (alt < 2005){
            System.out.println("A passagem esta permitida!");
        }
    }
}
