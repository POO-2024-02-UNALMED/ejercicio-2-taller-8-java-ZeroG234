public class PatrullaPolicia extends Sedan implements Emergencia{
    // Constructor
    public PatrullaPolicia(String nombre, int maxPasajeros, int maxVelocidad){
        super(nombre, (short) maxPasajeros, maxVelocidad);
    }

    // Métodos de Emergencia
    public String sonarSirena(){
        return "IUIUIUIUIUIUI";
    }

    public int getVolumen(){
        return VOLUMEN;
    }

    public void setVolumen(){
        //VOLUMEN++; Genera error porque al ser un atributo de
        // una interfase, este es constante.
    }

    // El siguiente método se hereda de la clase Sedan.
    // Así que se está sobreescribiendo sobre este.
    public String toString(){
        return "Esta es la patrulla " + super.getNombre() + " con capacidad" + super.getMaxPasajeros() + " y velocidad máxima " + super.getMaxVelocidad();
    }
}