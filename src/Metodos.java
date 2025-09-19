import java.util.Scanner;

public class Metodos {

    //Classes para cada opção selecionada

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


    public static void main(String[] args) {   //entrada princial

        Scanner sc = new Scanner(System.in);

        //Pega opção com int (1, 2, 3, 4)
        System.out.println("== Calculadora ==");
        System.out.println("""
                1- Somar
                2- Subtração
                3- Multiplicação
                4- Divisão
                =================
                """);
        //Guarda a opção desejada na variável (opcao)
        System.out.println("Informe a opção Desejada:");
        int opcao = sc.nextInt();

        //Guarda o primeiro valor
        System.out.println("Primeiro valor: ");
        int primeiroV = sc.nextInt();

        //Guarda o segundo valor
        System.out.println("Segundo Valor:");
        int segundoV = sc.nextInt();

        //Lógica para opção selecionada
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

