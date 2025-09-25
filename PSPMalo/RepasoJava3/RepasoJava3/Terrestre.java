package RepasoJava3;

abstract class Terrestre implements Animal{
    int patas;

    public Terrestre(int patas) {
        this.patas = patas;
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve caminando con " + patas + " patas");
    }
}
