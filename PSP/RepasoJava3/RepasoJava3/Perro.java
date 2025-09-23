package RepasoJava3;

public class Perro extends Terrestre{


    public Perro() {
        super(4);
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo pienso");
    }


    public void ladrar() {
        System.out.println("El perro ladra: guau guau");
    }
}

