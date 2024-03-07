import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class TP01Ex16 {

    /* 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
    seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
    Lembre-se que uma função trigonométrica trabalha em radianos. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double angulo, anguloOposto, seno, cosseno, tangente, secante;

        System.out.println("Digite o valor de um angulo em graus: ");
        angulo = scan.nextDouble();

        anguloOposto = 90 - angulo;

        seno = Math.sin(Math.toRadians(angulo));
        cosseno = Math.cos(Math.toRadians(angulo));
        tangente = Math.tan(Math.toRadians(angulo));
        secante = 1 / cosseno;

        System.out.println("\nSeno: " + df.format(seno));
        System.out.println("\nCosseno: " + df.format(cosseno));
        System.out.println("\nTangente: " + df.format(tangente));
        System.out.println("\nSecante: " + df.format(secante));
    }
}
