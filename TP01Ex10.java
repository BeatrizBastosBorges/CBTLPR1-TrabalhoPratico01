import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex10 {

    /* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
    exibir sua temperatura equivalente em Fahrenheit. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite a temperatura em graus Celsius");
        double celsius = scan.nextDouble();

        double resultadoFahrenheit =  (celsius * 9/5) + 32;
        
        System.out.println("A temperatura em graus Fahrenheit e: " + resultadoFahrenheit);
    }
}
