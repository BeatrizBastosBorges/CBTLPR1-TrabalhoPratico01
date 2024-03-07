import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class TP01Ex15 {

    /* 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
    dólares. Calcular e exibir o valor correspondente em Reais (R$). 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double cotacaoDolar, dolar, real;

        System.out.println("Digite o valor da cotacao do dolar: ");
        cotacaoDolar = scan.nextDouble();

        System.out.println("Digite uma certa quantidade de dolares: ");
        dolar = scan.nextDouble();

        real = cotacaoDolar * dolar;

        System.out.println("\nValor em real: " + df.format(real));
    }
}
