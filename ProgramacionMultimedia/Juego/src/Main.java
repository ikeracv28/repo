import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int palitos = 21;
        int jugada;

        while (palitos > 1) {
            // mostrar palitos
            for (int i = 0; i < palitos; i++) {
                System.out.print("|");
            }
            System.out.println("\nQuedan " + palitos + " palitos.");

            // turno del jugador
            System.out.print("¿Cuántos palitos quieres quitar (1-4)? ");
            jugada = scanner.nextInt();

            while (jugada < 1 || jugada > 4 || jugada >= palitos) {
                System.out.print("Número inválido, elige entre 1 y 4 (máximo " + (palitos - 1) + "): ");
                jugada = scanner.nextInt();
            }

            palitos -= jugada;

            if (palitos == 1) {
                System.out.println("|");
                System.out.println("Te toca el último palo. ¡Has perdido!");
                break;
            }

            // turno de la máquina
            int jugadaMaquina = 5 - jugada;
            palitos -= jugadaMaquina;
            System.out.println("La máquina quita " + jugadaMaquina + " palitos.");
        }
        System.out.println("¡Has perdido!");
    }
}

