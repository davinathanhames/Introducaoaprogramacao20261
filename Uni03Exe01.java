import java.util.Scanner;

public class Uni03Exe01 {

    // Análise: será considerado metros
    // Entradas: largura, comprimento
    // Saída: area
    // Processo: area = largura * comprimento
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a largura(m): ");
        float largura = leitor.nextFloat();
        System.out.println("Digite o comprimento(m): ");
        float comprimento = leitor.nextFloat();

        float area = largura * comprimento;
        
        System.out.println("Área = "+ area + "m²");

        leitor.close();
    }
}
