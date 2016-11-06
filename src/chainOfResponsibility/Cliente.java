package chainOfResponsibility;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 6/11/2016.
 */
public class Cliente {

    public static void main(String[] args){
        SistemaDeMensajeria sistemaDeMensajeria = new SistemaDeMensajeria();
        sistemaDeMensajeria.solicitudEnvio(2);
        sistemaDeMensajeria.solicitudEnvio(60);
        sistemaDeMensajeria.solicitudEnvio(25);
    }
}
