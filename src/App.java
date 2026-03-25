import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Lado A: ");
        int ladoA = leitor.nextInt();

        System.out.print("Lado B: ");
        int ladoB = leitor.nextInt();

        System.out.print("Lado C: ");
        int ladoC = leitor.nextInt();

       
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triângulo Equilátero.");
        } 
        else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("Triângulo Isósceles.");
        } 
        else {
            System.out.println("Triângulo Escaleno.");
        }

        leitor.close();
    }
}