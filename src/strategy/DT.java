package strategy;

/**
 * Created by Facu on 6/11/2016.
 */
public class DT {

   private Equipo equipo;

    public DT() {
        equipo = new Equipo();
    }

    public void ataque(){
        IEstrategia ataque = new Ataque();
        equipo.setEstrategia(ataque);
    }

    public void defensa(){
        IEstrategia defensa = new Defensa();
        equipo.setEstrategia(defensa);
    }

    public void tiroLibre(){
        IEstrategia tiroLibre = new TiroLibre();
        equipo.setEstrategia(tiroLibre);
    }

    public void tiroDeEsquina(){
        IEstrategia tiroDeEsquina = new TiroDeEsquina();
        equipo.setEstrategia(tiroDeEsquina);
    }

    public void cambiarEstrategia(){
        System.out.print(equipo.setEstrategia() + "\n");
    }
}
