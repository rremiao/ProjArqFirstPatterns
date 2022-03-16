import java.time.LocalDateTime;
import java.util.List;

public interface ICarregadorDeTemperatura {
    public boolean isDadosCarregados();
    void carregaDados();    
    List<RegistroDoTempo> getDados();
    public String diaQueMaisChoveuNoAno(int ano);
    public RegistroDoTempoDTO getRegistro(LocalDateTime data);
    public void alterarRegistro(LocalDateTime data);
    public void removeReg(LocalDateTime data);
    public void addReg(RegistroDoTempo rg); 
    public void setNomeArquivo(String nomeArquivo);
}
