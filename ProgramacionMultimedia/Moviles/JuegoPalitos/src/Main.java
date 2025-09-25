import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int opciones = 0;

//While para que el menu se repita hasta que el usuario le de al 3 para salir
                while (opciones != 3) {
menu();
                    System.out.println("Elige una opción: ");
                    try {
opciones = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
opciones = 0;
        }

        // Switch para las opciones del menu
        switch (opciones) {
        case 1:
Juego2 juego = new Juego2();
                        juego.jugar(scanner);
                        break;
                                case 2:
                                System.out.println("Controles / Ayuda:");
                        System.out.println("El objetivo del juego es no ser el jugador que se quede con el último palito.");
                        System.out.println("En cada turno, puedes quitar entre 1 y 4 palitos.");
                        System.out.println("Después de tu turno, la máquina quitará entre 1 y 4 palitos, de manera que la suma de los palitos que quitan ambos jugadores sea 5.");
                        System.out.println("Si te quedas con el último palito, pierdes.");
                        break;
                                case 3:
                                System.out.println("Saliendo del juego. ¡Hasta luego!");
                        break;
default:
        System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                }
                        }
                        }//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}