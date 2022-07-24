public class Envio_Internacional extends Envio implements Metodos_Envio {
    public Envio_Internacional(String tipo, Integer precio)
    {
        super(tipo, precio);
    }

    public Envio_Internacional()
    {

    }

    @Override
    public String getTiempo()
    {
        return "Tiempo envio 90 horas";
    }
}
