import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex017 {

    /* 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
    cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
     */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite o valor da x: ");
        int x = scan.nextInt();

        System.out.println("Digite o valor do y: ");
        int y = scan.nextInt();
        
        int contador = x;

        for(int i = 1; i <= (y - 1); i++ ){
            
            x = x * contador;
        }
        System.out.println("O resultado da potenciacao e: " + x);
    }
}