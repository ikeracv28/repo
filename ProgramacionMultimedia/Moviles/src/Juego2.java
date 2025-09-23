import java.util.Scanner;
public class Juego2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int palitos = 21;
                int jugada = 0;

                while (palitos > 1) {
                    // mostrar palitos
                    for (int i = 0; i < palitos; i++) {
                        System.out.print("|");
                    }
                    System.out.println();

                    boolean valido = false;

                    // pedir jugada hasta que sea válida
                    while (!valido) {
                        System.out.print("¿Cuántos palitos quieres quitar (1-4)? ");
                        try {
                            jugada = Integer.parseInt(scanner.nextLine()); // convierte lo que escribe el usuario a número

                            if (jugada < 1) {
                                System.out.println("No puedes quitar menos de 1.");
                            } else if (jugada > 4) {
                                System.out.println("No puedes quitar más de 4.");
                            } else if (jugada >= palitos) {
                                System.out.println("No puedes quitar todos los palos. Máximo: " + (palitos - 1));
                            } else {
                                valido = true; //  jugada correcta
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Eso no es un número válido.");
                        }
                    }

                    palitos -= jugada;

                    if (palitos == 1) {
                        break;
                    }

                    // turno de la máquina
                    int jugadaMaquina = 5 - jugada;
                    palitos -= jugadaMaquina;
                }

                System.out.println("¡Has perdido!!!");
            }
        }



