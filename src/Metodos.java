import java.util.Scanner;

public class Metodos {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("== Calculadora ==");
        System.out.println("""
                1- Soma
                2- Subtração
                3- Multiplicar
                4- Dividir
                """);
        System.out.println("Informe a opção Desejada:");
        int opcao = sc.nextInt();


        System.out.println("Primeiro valor: ");
        int primeiroV = sc.nextInt();

        System.out.println("Segundo Valor:");
        int segundoV = sc.nextInt();


        if (opcao == 1) {
            System.out.println("Soma: " + primeiroV + "+" + segundoV + " = " + soma(primeiroV, segundoV));
        } else if (opcao == 2) {
            System.out.println("Subtrair: " + primeiroV + "-" + segundoV + " = " + subtracao(primeiroV, segundoV));
        } else if (opcao == 3) {
            System.out.println("Multiplicar: " + primeiroV + "*" + segundoV + " = " + multiplicar(primeiroV, segundoV));
        } else {
            System.out.println("Multiplicar: " + primeiroV + "/" + segundoV + " = " + dividir(primeiroV, segundoV));

        }


    }
}

