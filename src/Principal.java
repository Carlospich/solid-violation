public class Principal {

  public static void main(String[] args) {

    Impresora printer = new Impresora();
    printer.imprimirTiempoDeEnvio(CapturaDeEnvio());

  }

  private static Envio[] CapturaDeEnvio(){

    //Se realiza la captura de envios

    Envio[] envios = {
            new Envio_Municipal("Municipal",5000),
            new Envio_Intermunicipal("Intermunicipal",15000),
            new Envio_Internacional("Internacional",25000)
    };


    return envios;
  }
}
