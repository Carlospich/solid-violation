public class Envio_Municipal extends Envio implements Metodos_Envio {

    public Envio_Municipal(String tipo, Integer precio)
    {
        super(tipo, precio);
    }

    public Envio_Municipal()
    {

    }

    @Override
    public String getTiempo()
    {
        return "Tiempo envio 12 horas";
    }
}
