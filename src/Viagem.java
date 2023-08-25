import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        double velocidade, tempo, distancia, kml;
        double consumo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a velocidade:");
        velocidade = ler.nextDouble();

        System.out.println("Digite o tempo gasto:");
        tempo = ler.nextDouble();

        System.out.println("Digite quantos KMs o carro faz por Litro:");
        kml = ler.nextDouble();

        distancia = velocidade * tempo;

        consumo = distancia / kml;

        System.out.println("O consumo médio foi: "+ String.format("%.2f", consumo));

    }
}
