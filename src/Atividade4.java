public class Atividade4 {
    public static void main(String[] args) {
        int largura = 10;
        int altura = 5;
        double area = largura * altura;
        double perimetro = 2 * (altura + largura);
        System.out.printf("A área do retangulo com largura %d e altura %d é: %.2f", 
        largura, altura, area);
        System.out.printf("\nO perimetro do retangulo com largura %d e altura %d é: %.2f", 
        largura, altura, perimetro);
    }
}