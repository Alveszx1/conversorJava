import java.util.Scanner;

public class Calc {
    String moedaOrigem;
    String moedaDestino;
    double valorDaCotacao;
    double valorDeConversao;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Moeda de origem: ");
        moedaOrigem = leitor.nextLine();

        System.out.println("Moeda de destino: ");
        moedaDestino = leitor.nextLine();

        System.out.println("Quanto custa 1 "+ moedaDestino +" em " +moedaOrigem+ "?");
        valorDaCotacao = leitor.nextDouble();

        calcDados();
    }
    public void calcDados(){

        valorDeConversao = 1/valorDaCotacao;
        exibirResult();

    }
    public void exibirResult(){
        System.out.println("1 "+moedaOrigem+ " equivale a " +valorDeConversao+" "+moedaDestino+ "!");
    }

}
