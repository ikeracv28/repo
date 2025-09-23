package RepasoJava2;

public class Ordenador extends DispositivoBase {

    public void ejecutarPrograma(String programa){
        System.out.println(programa);
    }

    @Override
    public void encender() {
        System.out.println("Encendendo ordenador");
        this.estaEncendido = true;

    }

    @Override
    public void apagar() {
        System.out.println("Apagando ordenador");
        this.estaEncendido = false;

    }

    @Override
    public void mostrarEstado() {
        if (this.estaEncendido == true) {
            System.out.println("ordenador encendido");
        } else  {
            System.out.println("ordenador apagado");
        }

    }
}
