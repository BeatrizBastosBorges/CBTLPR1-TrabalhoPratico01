import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex14 {

    /* 14. Calcular e exibir o volume livre de um ambiente que contem uma esfera de raio
    'r' inscrita em um cubo perfeito de aresta 'a'. Os valores de 'r' e 'a' serao
    digitados. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double arestaQuadrado, raioEsfera;
        do{
            System.out.println("Digite o valor da aresta do quadrado: ");
            arestaQuadrado = scan.nextDouble();  

            System.out.println("Digite o valor do raio da esfera: ");
            raioEsfera = scan.nextDouble();
        }
        while(arestaQuadrado < (raioEsfera * 2));
        

        
        double volumeCubo = Math.pow(arestaQuadrado, 3);
        double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(raioEsfera, 3);
        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre dentro do cubo e: " + df.format(volumeLivre) + " metros cubicos");
    }
}
