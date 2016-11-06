package strategy;

/**
 * Created by Facu on 6/11/2016.
 */
public class Juego {

    public static void main(String[] args){
        DT dt=new DT();

        dt.defensa();
        dt.cambiarEstrategia();

        dt.ataque();
        dt.cambiarEstrategia();

        dt.tiroDeEsquina();
        dt.cambiarEstrategia();

        dt.tiroLibre();
        dt.cambiarEstrategia();
    }
}
