import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class TP01Ex09 {

    /* 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
    alores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double resistencia, corrente, tensao;

        System.out.println("Digite o valor da resistencia eletrica: ");
        resistencia = scan.nextDouble();

        System.out.println("\nDigite o valor da corrente eletrica: ");
        corrente = scan.nextDouble();

        tensao = resistencia * corrente;

        System.out.println("\nA tensao eletrica e: " + df.format(tensao));
    }
}
