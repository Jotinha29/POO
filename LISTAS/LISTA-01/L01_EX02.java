import java.util.Scanner;

public class L01_EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 7: ");
        int diaDaSemana = scanner.nextInt();

        String dia;
        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
            break;
            case 2:
                dia = "Segunda-feira";
            break;
            case 3:
                dia = "Terça-feira";
            break;
            case 4:
                dia = "Quarta-feira";
            break;
            case 5:
                dia = "Quinta-feira";
            break;
            case 6:
                dia = "Sexta-feira";
           break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
            break;
        }

        System.out.println(dia);
        scanner.close();
    }
}
