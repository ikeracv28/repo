// clase que implementa runnable para ser ejecutada como un hilo
public class MiHilo implements Runnable {
    private String nombre;

    public MiHilo(String nombre){
        this.nombre = nombre;
    }


    @Override
    public void run() {
        for (int i= 0; i<5; i++){
            System.out.println(nombre + " esta en ejecucion: " + i);
            try{
                // Pausar el hilo por 500 milisegundos
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha terminado.");
    }

    public static void main(String[] args) {
        //Creacion de hilos usando la interfaz Runnable
        Thread hilo1= new Thread(new MiHilo("Hilo 1"));
        Thread hilo2= new Thread(new MiHilo("Hilo 2"));

        //Iniciar los hilos
        hilo1.start();
        hilo2.start();

        //Hilo principal espera a que los hilos secundarios terminen
        // el join lo que hace es que no continue hasta que termine el hilo
        try{
            hilo1.join();
            hilo2.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Todos los hilos han terminado.");
    }
}



