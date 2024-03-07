import java.util.Scanner;
import java.text.DecimalFormat;

public class TP01Ex18 {

    /* 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
    valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
    que deverá ser devolvido. 
    Desenvolvedores: Beatriz Bastos Borges e Miguel Luizatto Alves
    */
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double[]  produto = new double[5];

        for(int i = 0; i < 5; i ++)
        {
            System.out.println("Digite o valor do produto numero " + (i + 1) + ": ");
            produto[i] = scan.nextDouble();
        }

        double somaProdutos = produto[0] + produto[1] + produto[2] + produto[3] + produto[4];

        System.out.println("O valor a ser pago e: " + somaProdutos + " reais");
        double pagamento, troco;

        System.out.println("\nDigite o valor do pagamento: ");
        pagamento = scan.nextDouble();
            
            while(pagamento <  somaProdutos)
            {
                System.out.println("Pagamento insuficiente. Informe outro valor.");
                pagamento = scan.nextDouble();
            }

        troco = pagamento - somaProdutos;

        System.out.println("Pagamento efetuado com sucesso. O troco e de: " + df.format(troco) + " reais");
    }
}
