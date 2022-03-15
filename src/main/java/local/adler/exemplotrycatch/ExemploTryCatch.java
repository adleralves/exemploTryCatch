package local.adler.exemplotrycatch;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        int[] matriz = new int[2];
        int i;
        boolean continuar = true;
        
        do {
            try { 
                System.out.println("Informe a posição do array que deseja selecionar: ");
                i = t.nextInt();

                System.out.println("Informe o valor: ");
                matriz[i] = t.nextInt();

                System.out.printf("Elemento %d: %d\n", i, matriz[i]);
                
                continuar = false;
            } catch (ArrayIndexOutOfBoundsException erro) {
                System.err.printf("%nException: %s%n", erro);
                t.nextLine();
                System.out.println("!ERRO! - você selecionou um elemento não existente da matriz | por favor selecione até o elemento de n° 1 \n\n");
            }
        } while (continuar);
    }
}
