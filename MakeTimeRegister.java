public class MakeTimeRegister {

  public RegistroDoTempo criarRegistro(String registro) {

    String dados[] = registro.split(" ");
    String data[] = dados[0].split("/");
    int dia = Integer.parseInt(data[0]);
    int mes = Integer.parseInt(data[1]);
    int ano = Integer.parseInt(data[2]);
    double precipitacaoMaxima = Double.parseDouble(dados[1]);
    double precipitacaoMinima = Double.parseDouble(dados[2]);
    double horasInsolacao = Double.parseDouble(dados[3]);
    double temperaturaMedia = Double.parseDouble(dados[4]);
    double umidadeRelativaDoAr = Double.parseDouble(dados[5]);
    double velocidadeDoVento = Double.parseDouble(dados[6]);

    RegistroDoTempo newReg = new RegistroDoTempo(dia, mes, ano, precipitacaoMaxima, precipitacaoMinima, horasInsolacao, temperaturaMedia, umidadeRelativaDoAr, velocidadeDoVento);

    return newReg;
  }

  public String criarRegistro(RegistroDoTempo registro) {
    int dia = registro.getDia();
    int mes = registro.getMes();
    int ano = registro.getAno();
    double precipitacaoMaxima = registro.getPrecipitacaoMaxima();
    double precipitacaoMinima = registro.getPrecipitacaoMinima();
    double horasInsolacao = registro.getHorasInsolacao();
    double temperaturaMedia = registro.getTemperaturaMedia();
    double umidadeRelativaDoAr = registro.getUmidadeRelativaDoAr();
    double velocidadeDoVento = registro.getVelocidadeDoVento();

    String newReg = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano) + Double.toString(precipitacaoMaxima)
                    + Double.toString(precipitacaoMinima) + Double.toString(horasInsolacao) + Double.toString(temperaturaMedia)
                    + Double.toString(umidadeRelativaDoAr) + Double.toString(velocidadeDoVento);

    return newReg;
  }
}
