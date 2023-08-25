import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
    String frase;
    int qtdvogais=0;
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    frase = ler.nextLine();
    frase = frase.toUpperCase();
    for (int i=0; i<frase.length(); i++) {
        if (frase.charAt(i) =='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U')
            qtdvogais++;
    }
        System.out.printf("A quantidade de vogais presente na frase é: " + qtdvogais);
    }
}
