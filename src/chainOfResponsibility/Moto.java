package chainOfResponsibility;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 6/11/2016.
 */
public class Moto implements IMedio{
    private IMedio next;

    @Override
    public void setNext(IMedio medioDeEnvio) {
        next= medioDeEnvio;
    }

    @Override
    public IMedio getNext() {
        return next;
    }

    @Override
    public void solicitudEnvio(int tamañoPaquete) {
        if (tamañoPaquete <=10){
            System.out.print("El paquete lo enviamos por moto\n");
        }else {
            next.solicitudEnvio(tamañoPaquete);
        }
    }
}
