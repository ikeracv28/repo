package RepasoJava2;

public class Telefono extends DispositivoBase{


    public void realizarLLamada() {
        System.out.println("Realizando LLamada");
    }

    @Override
    public void encender() {
        System.out.println("Encendendo telefono");
        this.estaEncendido = true;

    }

    @Override
    public void apagar() {
        System.out.println("Apagando telefono");
        this.estaEncendido = false;

    }

    @Override
    public void mostrarEstado() {

        if (this.estaEncendido == true) {
            System.out.println("telefono encendido");
        } else  {
            System.out.println("telefono apagado");
        }
    }
}
