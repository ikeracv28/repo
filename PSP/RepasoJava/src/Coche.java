public class Coche extends VehiculoTerrestre{
    @Override
    public void acelerar() {
       this.velocidad +=10;
    }
    public void frenar(){
        this.velocidad -=5;
    }
    boolean tieneAireAcondicionado;

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }
    public Coche(int velocidad, int ruedas){
        this.velocidad= velocidad;
        this.ruedas=ruedas;
    }
    public void activarAire(){
        if(tieneAireAcondicionado==true){
            this.tieneAireAcondicionado =false;
        } else if (tieneAireAcondicionado==false) {
            this.tieneAireAcondicionado=true;
        }
    }
}



