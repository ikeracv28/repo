public class Moto extends VehiculoTerrestre{
    boolean tieneCasco;

    @Override
    public void acelerar() {
        this.velocidad +=20;
    }

    @Override
    public void frenar() {
        this.velocidad -=10;
    }

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }

    public void Moto(int velocidad, int ruedas){
        this.velocidad= velocidad;
        this.ruedas= ruedas;
    }
    public void verificarCasco(){
        if(this.tieneCasco){
            System.out.println("Tiene el casco puesto");
        } else if (!this.tieneCasco) {
            System.out.println("No tiene el casco puesto");
        }
    }
}
