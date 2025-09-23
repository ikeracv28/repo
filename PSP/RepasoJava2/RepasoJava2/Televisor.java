package RepasoJava2;

public class Televisor extends DispositivoBase{

    public void cambiarCanal(int canal){
        System.out.println("Canal: "+canal);
    }

    @Override
    public void encender() {
        System.out.println("Encendendo televisor");
        this.estaEncendido = true;

    }

    @Override
    public void apagar() {
        System.out.println("Apagando televisor");
        this.estaEncendido = false;

    }

    @Override
    public void mostrarEstado() {
        if (this.estaEncendido == true) {
            System.out.println("televisor encendido");
        } else  {
            System.out.println("televisor apagado");
        }

    }
}
