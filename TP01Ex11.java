import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class TP01Ex11 {

    /* 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double diametro, area;

        System.out.println("Digite o valor do diametro: ");
        diametro = scan.nextDouble();

        area = Math.PI * Math.pow((diametro/2), 2);

        System.out.println("\nArea do circulo: " + df.format(area));
    }
}
