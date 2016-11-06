package strategy;

/**
 * Created by Facu on 6/11/2016.
 */
public class Equipo {

private IEstrategia estrategia;

    public IEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public String setEstrategia(){
        return estrategia.setEtrategia();
    }
}
