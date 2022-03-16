import java.time.LocalDateTime;

public class Consultas{
    ICarregadorDeTemperatura carregadorTemp;

    public Consultas(){
        carregadorTemp = new Temperaturas();
    }

    public Consultas(String novoArq) {
        carregadorTemp = new Temperaturas();
        carregadorTemp.setNomeArquivo(novoArq);
    }

    public String diaQueMaisChoveuNoAno(int ano){
       return carregadorTemp.diaQueMaisChoveuNoAno(ano);
    }

    public RegistroDoTempoDTO getRegistro(LocalDateTime data) {
        return carregadorTemp.getRegistro(data);
    }

    public void setRegistro(LocalDateTime data){
        carregadorTemp.alterarRegistro(data);
    }

    public void removeReg(LocalDateTime data) {
        carregadorTemp.removeReg(data);
    }

    public void addReg(RegistroDoTempo rg) {
        carregadorTemp.addReg(rg);
    }

    public void setNomeArquivo(String nomeArquivo){
        carregadorTemp.setNomeArquivo(nomeArquivo);
    }
}
