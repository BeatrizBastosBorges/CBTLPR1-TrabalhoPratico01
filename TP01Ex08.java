import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex08 {

    /* 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
    dois metros e que um quilômetro possui mil metros, fazer um programa para
    converter milhas marítimas em quilômetros. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite a distancia em milhas maritmas: ");
        double milha = scan.nextDouble();

        double resultado = milha * 1.852;

        System.out.println("Digite a distancia em quilometros e: " + resultado + "km");
    }
}
