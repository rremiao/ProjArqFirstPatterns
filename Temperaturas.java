import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class Temperaturas implements ICarregadorDeTemperatura{

    private List<RegistroDoTempo> registros;
    private String nArq;
    private boolean dadosCarregados;

    public Temperaturas() {
        carregaDados();
    }
    
    public boolean isDadosCarregados(){
        return dadosCarregados;
    }

    public RegistroDoTempoDTO getRegistro(LocalDateTime data) {
        RegistroDoTempoDTO dto = new RegistroDoTempoDTO();

        RegistroDoTempo newReg = registros
        .stream()
        .filter(reg->reg.getAno() == data.getYear() 
                    && reg.getMes() == data.getMonthValue()
                    && reg.getDia() == data.getDayOfMonth())
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
    
        System.out.println(newReg);

        dto.withDia(newReg.getDia())
           .withMes(newReg.getMes())
           .withAno(newReg.getAno())
           .withPrecipitacaoMaxima(newReg.getPrecipitacaoMaxima())
           .withPrecipitacaoMinima(newReg.getPrecipitacaoMinima())
           .withHorasInsolacao(newReg.getHorasInsolacao())
           .withTemperaturaMedia(newReg.getTemperaturaMedia())
           .withUmidadeRelativaDoAr(newReg.getUmidadeRelativaDoAr())
           .withVelocidadeDoVento(newReg.getVelocidadeDoVento());
        

        return dto;
    } 

    public void alterarRegistro(LocalDateTime data) {
        RegistroDoTempo newReg = registros
        .stream()
        .filter(reg->reg.getAno() == data.getYear() 
                    && reg.getMes() == data.getMonthValue()
                    && reg.getDia() == data.getDayOfMonth())
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);

        newReg.setAno(data.getYear());
        newReg.setDia(data.getDayOfMonth());
        newReg.setMes(data.getMonthValue());

        System.out.println(newReg);
    }

    public void removeReg(LocalDateTime data){
        RegistroDoTempo newReg = registros
        .stream()
        .filter(reg->reg.getAno() == data.getYear() 
                    && reg.getMes() == data.getMonthValue()
                    && reg.getDia() == data.getDayOfMonth())
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);

        registros.remove(newReg);

        for(RegistroDoTempo rg : registros) {
            System.out.println(rg);
        }
    }

    public void addReg(RegistroDoTempo rg){
        registros.add(rg);
    }

    public String diaQueMaisChoveuNoAno(int ano){
        System.out.println(registros);
        RegistroDoTempo registro = registros
        .stream()
        .filter(reg->reg.getAno() == ano)
        .max(Comparator.comparing(RegistroDoTempo::getPrecipitacaoMaxima))
        .orElseThrow(IllegalArgumentException::new);
        String resp = registro.getDia()+"/"+registro.getMes()+"/"+registro.getAno()+", "+registro.getPrecipitacaoMaxima();
        return resp;
    }

    public void setNomeArquivo(String arquivo) {
        this.nArq = arquivo;
        this.nArq.trim();
    }       

    public List<RegistroDoTempo> getDados(){
        if (!isDadosCarregados()){
            throw new IllegalStateException("Dados nao carregados");
        }
        return registros;
    }

    public void carregaDados(){
        System.out.println("aqui dados");
        ParseFile parseFile = new ParseFile();
        try{
            parseFile.carregaDados();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
         this.nArq = parseFile.getNArq();
         this.registros = parseFile.getRegistros();
         this.dadosCarregados = parseFile.getDadosCarregados();
    }

    public void carregaDados(String nome){
        System.out.println("aqui");
        ParseFile parseFile = new ParseFile();
        try{
            parseFile.setNArq(nome);
            parseFile.carregaDados();
        } catch(Exception e) {
            e.printStackTrace();
        }        
        this.nArq = parseFile.getNArq();
        this.registros = parseFile.getRegistros();
        this.dadosCarregados = parseFile.getDadosCarregados();
    }
}
