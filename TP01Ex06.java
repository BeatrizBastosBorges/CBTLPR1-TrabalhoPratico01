import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex06 {

    /* 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double[] n = new double [4]; 

        for(int i = 0; i < 4; i++)
        {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            n[i] = scan.nextDouble();
        }

        double r =(n[0] + n[1] + n[2] + n[3]) / 4;

        System.out.println("A media aritmetica e: " + df.format(r));
    }
}
