class Fragata implements VehiculoAgua{
    // Atributos necesarios
    private String nombre;
    private short maxPasajeros;
    private int maxVelocidad;

    // Constructores
    public Fragata(){
        this("El Holandés Errante", (short) 6, 100);
    }

    public Fragata(String nombre, short maxPasajeros, int maxVelocidad){
        this.nombre = nombre;
        this.maxPasajeros = maxPasajeros;
        this.maxVelocidad = maxVelocidad;
    }

    @Override
    public String soltarAmarras(){
        return "Soltando amarras";
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public int getMaxPasajeros(){
        return maxPasajeros;
    }

    @Override
    public int getMaxVelocidad(){
        return maxVelocidad;
    }
}