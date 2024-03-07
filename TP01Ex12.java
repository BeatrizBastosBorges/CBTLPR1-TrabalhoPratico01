import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex12 {

    /* 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
    base que serão digitados. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite a altura do cone");
        double h = scan.nextDouble();
        
        System.out.println("Digite o valor do raio da base: ");
        double rBase = scan.nextDouble();

        double volumeCone = (Math.PI * Math.pow(rBase, 2) * h) / 3;

        System.out.println("O valor do volume do cone e: " + df.format(volumeCone) + " metros cubicos");
    }
}
