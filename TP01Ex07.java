import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class TP01Ex07 {

    /* 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double num1, num2, mediaGeometrica;
        
        System.out.println("Digite o primeiro valor: ");
        num1 = scan.nextDouble();

        System.out.println("\nDigite o segundo valor: ");
        num2 = scan.nextDouble();

        mediaGeometrica = Math.sqrt((num1 * num2));

        System.out.println("\nA media geometrica e: " + df.format(mediaGeometrica));
    }
}
