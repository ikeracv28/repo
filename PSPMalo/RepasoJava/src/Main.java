//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Coche coche = new Coche(0,4);
        Moto moto = new Moto(0,2);
        coche.acelerar();
        coche.frenar();
        coche.activarAire();
    }
}