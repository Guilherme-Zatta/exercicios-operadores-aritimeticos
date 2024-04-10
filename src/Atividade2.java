public class Atividade2 {
    public static void main(String[] args) throws Exception {

        double  num1 = 5;
        double  num2 = 10.5;
 
        double calculo1 = num1+num2;
        double calculo2 = num1-num2;
        double calculo3 = num1/num2;
        double calculo4 = num1*num2;
 
        System.out.printf("valor da soma de %.2f + %.2f = %.2f\n", num1,num2,calculo1);
        System.out.printf("valor da subtração de %.2f - %.2f = %.2f\n", num1,num2,calculo2);
        System.out.printf("valor da  divisão de %.2f / %.2f = %.2f\n", num1,num2,calculo3);
        System.out.printf("valor da multiplicação de %.2f * %.2f = %.2f\n", num1,num2,calculo4);
    }
}
