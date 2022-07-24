public class Envio_Intermunicipal extends Envio implements Metodos_Envio {
    public Envio_Intermunicipal(String tipo, Integer precio)
    {
        super(tipo, precio);
    }

    public Envio_Intermunicipal()
    {

    }

    @Override
    public String getTiempo() {
        return "Tiempo envio 36 horas";
    }
}
