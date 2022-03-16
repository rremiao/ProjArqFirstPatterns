public class RegistroDoTempoDTO {
    private int dia;
    private int mes;
    private int ano;
    private double precipitacaoMaxima;
    private double precipitacaoMinima;
    private double horasInsolacao;
    private double temperaturaMedia;
    private double umidadeRelativaDoAr;
    private double velocidadeDoVento;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public RegistroDoTempoDTO withDia(int dia) {
        this.dia = dia;
        return this;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public RegistroDoTempoDTO withMes(int mes) {
        this.mes = mes;
        return this;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public RegistroDoTempoDTO withAno(int ano) {
        this.ano = ano;
        return this;
    }

    public double getPrecipitacaoMaxima() {
        return precipitacaoMaxima;
    }

    public void setPrecipitacaoMaxima(double precipitacaoMaxima) {
        this.precipitacaoMaxima = precipitacaoMaxima;
    }

    public RegistroDoTempoDTO withPrecipitacaoMaxima(double precipitacaoMaxima) {
        this.precipitacaoMaxima = precipitacaoMaxima;
        return this;
    }

    public double getPrecipitacaoMinima() {
        return precipitacaoMinima;
    }

    public void setPrecipitacaoMinima(double precipitacaoMinima) {
        this.precipitacaoMinima = precipitacaoMinima;
    }

    public RegistroDoTempoDTO withPrecipitacaoMinima(double precipitacaoMinima) {
        this.precipitacaoMinima = precipitacaoMinima;
        return this;
    }

    public double getHorasInsolacao() {
        return horasInsolacao;
    }

    public void setHorasInsolacao(double horasInsolacao) {
        this.horasInsolacao = horasInsolacao;
    }

    public RegistroDoTempoDTO withHorasInsolacao(double horasInsolacao) {
        this.horasInsolacao = horasInsolacao;
        return this;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public RegistroDoTempoDTO withTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
        return this;
    }

    public double getUmidadeRelativaDoAr() {
        return umidadeRelativaDoAr;
    }

    public void setUmidadeRelativaDoAr(double umidadeRelativaDoAr) {
        this.umidadeRelativaDoAr = umidadeRelativaDoAr;
    }

    public RegistroDoTempoDTO withUmidadeRelativaDoAr(double umidadeRelativaDoAr) {
        this.umidadeRelativaDoAr = umidadeRelativaDoAr;
        return this;
    }

    public double getVelocidadeDoVento() {
        return velocidadeDoVento;
    }

    public void setVelocidadeDoVento(double velocidadeDoVento) {
        this.velocidadeDoVento = velocidadeDoVento;
    }

    public RegistroDoTempoDTO withVelocidadeDoVento(double velocidadeDoVento) {
        this.velocidadeDoVento = velocidadeDoVento;
        return this;
    }

    @Override
    public String toString() {
        return "RegistroDoTempo [ano=" + ano + ", dia=" + dia + ", horasInsolacao=" + horasInsolacao + ", mes=" + mes
                + ", precipitacaoMaxima=" + precipitacaoMaxima + ", precipitacaoMinima=" + precipitacaoMinima
                + ", temperaturaMedia=" + temperaturaMedia + ", umidadeRelativaDoAr=" + umidadeRelativaDoAr
                + ", velocidadeDoVento=" + velocidadeDoVento + "]";
    }  
}
