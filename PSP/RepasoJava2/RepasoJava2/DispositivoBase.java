package RepasoJava2;

abstract class DispositivoBase implements Dispositivo {
    protected boolean estaEncendido;

    public boolean getEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
}
