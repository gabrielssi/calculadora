import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1 - Declaração de variáveis
        Integer num1 = 0, num2 = 0, opcao = 0;
        Double resultado = 0.0;
        Scanner teclado = new Scanner(System.in);

        // 2 - Entradas
        System.out.printf("Escolha uma opção: \nOpção 1: soma \n" +
                "Opção 2: subtração \n" + "Opção 3: multiplicação \n"
                + "Opção 4: divisão \n\n" + "Digite a opção escolhida: ");
        opcao = teclado.nextInt();

        if(opcao >=1 && opcao <= 4) {

            System.out.printf("Digite um número: ");
            num1 = teclado.nextInt();

            System.out.printf("Digite outro numero: ");
            num2 = teclado.nextInt();

            switch (opcao) {
                case 1:
                    resultado = Double.valueOf(somar(num1, num2));
                    break;
                case 2:
                    resultado = Double.valueOf(subtrair(num1, num2));
                    break;
                case 3:
                    resultado = Double.valueOf(multiplicar(num1, num2));
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            // 4 - Saída

            System.out.println("O resultado é: " + resultado);
        }else{
            System.out.println("Opção inválida");
        }

    }
    // 3 - Processamento dos dados
    public static Integer somar(Integer num1, Integer num2){
        return num1+num2;
    }
    public static Integer subtrair(Integer num1, Integer num2){
        return num1-num2;
    }
    public static Integer multiplicar(Integer num1, Integer num2){
        return num1*num2;
    }
    public static Double dividir(Integer num1, Integer num2){
        return Double.valueOf(num1/num2);
    }

}