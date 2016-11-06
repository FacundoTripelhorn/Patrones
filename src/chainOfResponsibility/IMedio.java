package chainOfResponsibility;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 6/11/2016.
 */
public interface IMedio {

    public void setNext(IMedio medioDeEnvio);
    public IMedio getNext();
    public void solicitudEnvio(int tamañoPaquete);
}
