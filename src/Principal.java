public class Principal {

  public static void main(String[] args) {

    Impresora printer = new Impresora();
    printer.imprimirTiempoDeEnvio(CapturaDeEnvio());

  }

  private static Envio[] CapturaDeEnvio(){

    //Se realiza la captura de envios

    Envio[] envios = {
            new EnvioMunicipal("Municipal",5000),
            new EnvioIntermunicipal("Intermunicipal",15000),
            new EnvioInternacional("Internacional",25000)
    };


    return envios;
  }
}
