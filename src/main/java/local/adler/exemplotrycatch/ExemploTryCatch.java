package local.adler.exemplotrycatch;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        int[] matriz = new int[0];
        int i;
        
        System.out.println("Informe a posição do array que deseja selecionar: ");
        i = t.nextInt();
        
        System.out.println("Informe o valor: ");
        matriz[i] = t.nextInt();
        
        System.out.printf("Elemento %d: %d\n", i, matriz[i]);
    }
}
