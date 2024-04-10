import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
      // ENTRADA
      Scanner scanner = new Scanner(System.in);

      // 1 - Pedir para o usuário o seu peso
      System.out.println("Informe o seu peso em quilogramas: ");
      double peso = scanner.nextDouble();
      
      // 2 - Pedir para o usuário a sua altura em metros
      System.out.println("Informe sua altura em metros: ");
      double altura = scanner.nextDouble();

      // PROCESSAMENTO
      // 3 - Calcular o imc
      double imc = peso / (altura*altura);
      
      // SAÍDA
      // 4 - Imprime o resultado do IMC
      System.out.println("\nSeu IMC é: "+ imc);

    System.out.print("\nTabela IMC:");
    System.out.print("\n Abaixo do peso     \" Menor que 18,5  \"");
    System.out.print("\n Peso normal        \"   18,5 a 24,9   \"");
    System.out.print("\n Sobrepeso          \"   25  a 29,9    \"");
    System.out.print("\n Obesidade grau I   \"   30  a 34,9    \"");
    System.out.print("\n Obesidade grau II  \"   35  a 39,9    \"");
    System.out.print("\n Obesidade grau III \"   40  a 49,9    \"");
    System.out.print("\n Obesidade grau IV  \"   50  a 59,9    \"");
    System.out.print("\n Obesidade grau V   \"  Acima de 60    \"");

    scanner.close();
    }
}
