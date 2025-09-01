import java.util.Scanner;

public class Calc {
    String moedaOrigem;
    String moedaDestino;
    double valorDest;
    double result;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Moeda de origem: ");
        moedaOrigem = leitor.nextLine();

        System.out.println("Moeda de destino: ");
        moedaDestino = leitor.nextLine();

        System.out.println("Quanto custa 1 "+ moedaDestino +" em " +moedaOrigem);
        valorDest = leitor.nextDouble();

        calcDados();
    }
    public void calcDados(){

        result = 1/valorDest;
        exibirResult();

    }
    public void exibirResult(){
        System.out.println("1 "+moedaOrigem+ " equivale a " +result+" "+moedaDestino);
    }

}
