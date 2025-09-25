public class Bicicleta extends VehiculoTerrestre{

    @Override
    public void acelerar() {
        this.velocidad+=5;
    }

    @Override
    public void frenar() {
        this.velocidad-=2;
    }

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }
    boolean tieneTimbre;

    public void __constructor(int velocidad, int ruedas){
        this.velocidad=velocidad;
        this.ruedas=ruedas;
    }
    public void tocarTimbre(){
        this.tieneTimbre=true;
        System.out.println("Timbre tocado");
    }
}
