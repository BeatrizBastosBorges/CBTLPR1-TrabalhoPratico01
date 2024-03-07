import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex05 {

    /* 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite o diametro da esfera: ");
        double d = scan.nextDouble();

        double r = d / 2;

        double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);

        System.out.println("O volume da esfera e: " + df.format(volume) + " metros cubicos");
    }
}
