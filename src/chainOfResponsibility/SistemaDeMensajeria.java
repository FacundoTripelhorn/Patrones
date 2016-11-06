package chainOfResponsibility;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 6/11/2016.
 */
public class SistemaDeMensajeria implements IMedio{
    private IMedio next;
    @Override
    public void setNext(IMedio medioDeEnvio) {
        next=medioDeEnvio;
    }

    @Override
    public IMedio getNext() {
        return next;
    }

    @Override
    public void solicitudEnvio(int tamañoPaquete) {
        Moto moto=new Moto();
        this.setNext(moto);

        Auto auto=new Auto();
        moto.setNext(auto);

        Camion camion = new Camion();
        auto.setNext(camion);

        next.solicitudEnvio(tamañoPaquete);
    }
}
