import java.util.Scanner;
import java.lang.Math;

public class TP01Ex03 {
    
    /* 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal do quadrado");
        int diagonal = scan.nextInt();

        int area = (diagonal * diagonal) / 2;

        System.out.println("O valor da area e: " + area + " metros quadrados");
    }
}
