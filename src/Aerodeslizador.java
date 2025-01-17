class Aerodeslizador implements VehiculoTierra, VehiculoAgua{
    // Atributos necesarios
    private int numeroRuedas;
    private String nombre;
    private short maxPasajeros;
    private int maxVelocidad;

    // Constructores
    public Aerodeslizador(){
        this(0, "Monoplaza", (short) 6, 100);
    }

    public Aerodeslizador(int numeroRuedas, String nombre, short maxPasajeros, int maxVelocidad){
        this.numeroRuedas = numeroRuedas;
        this.nombre = nombre;
        this.maxPasajeros = maxPasajeros;
        this.maxVelocidad = maxVelocidad;
    }

    // Métodos Vehículo.
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

    // Métodos VehiculoTierra.
    @Override
    public int getNumeroRuedas(){
        return numeroRuedas;
    }
    
    @Override
    public void agregarRuedas(int numeroRuedas){
        this.numeroRuedas += numeroRuedas;
    }

    public String conducir(){
        return "Conduce al aerodeslizador: " + nombre;
    }

    // Método VehiculoAgua.
    @Override
    public String soltarAmarras(){
        return "Soltando amarras";
    }
}