import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        String name = "Titanic";
        System.out.println("Olá, meu nome é "+name);
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInforme o seu sobrenome completo: ");
        String sobrenome = scanner.nextLine();
           
        System.out.printf("%s %s", name, sobrenome);

        scanner.close();
    }
}