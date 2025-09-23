package RepasoJava3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.comer();
        perro.ladrar();
        perro.moverse();

        Pez pez = new Pez();
        pez.comer();
        pez.moverse();

    }
}