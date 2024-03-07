import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class TP01Ex13 {

    /* 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
    valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
    (em s) que serão digitados. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double velocidadeInicial, aceleracao, tempo, velocidadeFinal;

        System.out.println("Digite a velocidade (em m/s) inicial: ");
        velocidadeInicial = scan.nextDouble();

        System.out.println("Digite a aceleracao (m/s2): ");
        aceleracao = scan.nextDouble();

        System.out.println("Digite o tempo (em s): ");
        tempo = scan.nextDouble();

        velocidadeFinal = (velocidadeInicial + (aceleracao * tempo)) * 3.6;

        System.out.println("\nVelocidade Final: " + df.format(velocidadeFinal));
    }
}
