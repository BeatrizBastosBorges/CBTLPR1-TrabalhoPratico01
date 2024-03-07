import java.util.Scanner;
import java.lang.Math;

public class TP01Ex02 {

    /* 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da aresta do quadrado");
        int aresta = scan.nextInt();

        int area = aresta * aresta;

        System.out.println("O valor da area e: " + area + " metros quadrados");
    }
}
