import java.util.Scanner;

public class TP01Ex04 {

    /* 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base do triangulo: ");
        int b = scan.nextInt();

        System.out.println("Digite a altura do triangulo");
        int h = scan.nextInt();

        int area = b * h / 2;

        System.out.println("O valor da area e: " + area + " metros quadrados");
    }
}
