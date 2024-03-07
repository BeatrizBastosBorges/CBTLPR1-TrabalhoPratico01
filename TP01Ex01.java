import java.util.Scanner;

public class TP01Ex01 {

    /* 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */

    public static void main(String[] args){

        System.out.println("Digite a base do retangulo");
        Scanner scan = new Scanner(System.in);
        
        int base = scan.nextInt();
        
        System.out.println("Digite a altura do retangulo");
        int altura = scan.nextInt();

        int area = base * altura;

        System.out.println("A area total do retangulo: " + area + " metros quadrados");
    }
}
