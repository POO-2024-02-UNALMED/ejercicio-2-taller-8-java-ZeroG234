import java.util.*;
    public class ObjTaller8 {
        public static void main (String[] args) {
            // Literal a.
            Vehiculo s = new Sedan();
            Vehiculo a = new Aerodeslizador();
            Vehiculo f = new Fragata();
            Vehiculo p = new PatrullaPolicia("Patrulla 001", 5, 200);

            // Literal b.
            ((Sedan) s).agregarRuedas(4);
            ((PatrullaPolicia) p).agregarRuedas(4);
            
            // Literal c.
            //Defina el operador diamante del siguiente arreglo.
            // Se debe poner Vehiculo, porque todos los objetos la heredan.
            ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        
            // Literal d.
            listaVehiculos.add(s);
            listaVehiculos.add(a);
            listaVehiculos.add(f);
            listaVehiculos.add(p);

        for (int i = 0; i < listaVehiculos.size(); i++) {
            // Literal e.
            //Obtiene cada elemento en el arreglo y lo almacena
            //en la variable v.
            Vehiculo v = listaVehiculos.get(i);
            // Es clase Vehiculo por el mismo motivo del literal b.

            // Literal f.
            System.out.println(v);

            // Métodos de Vehiculo.
            if(v instanceof Vehiculo){
                System.out.println(v.getNombre());
                System.out.println(v.getMaxPasajeros());
                System.out.println(v.getMaxVelocidad());
            }

            // Métodos VehiculoTierra,
            if(v instanceof VehiculoTierra){
                System.out.println(((VehiculoTierra) v).getNumeroRuedas());
                System.out.println(((VehiculoTierra) v).conducir());
            }

            // Métodos VehiculoAgua.
            if(v instanceof VehiculoAgua){
                System.out.println(((VehiculoAgua) v).soltarAmarras());
            }

            // Métodos Emergencia.
            if(v instanceof Emergencia){
                System.out.println(((Emergencia) v).sonarSirena());
                System.out.println(((Emergencia) v).getVolumen());
            }

            // Métodos Sedan.
            if(v instanceof Sedan){
                System.out.println(((Sedan) v).sonarClaxon());
            }
        }

        /*
         * Respuestas g. y h.
         *   g. Una solución sería definir un atributo volumen
         *      que sea el modificado en el método setVolumen.
         *   h. En la clase Object, la cual es padre de Sedan por default.
         */
    }
}