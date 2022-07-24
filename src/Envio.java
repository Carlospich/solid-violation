public class Envio implements Metodos_Envio {
  private Integer precio;
  private String tipo;
  public Envio(String tipo, Integer precio) {
    this.precio = precio;
    this.tipo=tipo;
  }

  public Envio( ) {

  }

  @Override //implements
  public String getTiempo() {
    return null;
  }
}