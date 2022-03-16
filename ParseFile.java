import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParseFile {

  private static List<RegistroDoTempo> registros;
  private static String nArq;
  private static boolean dadosCarregados;

  public ParseFile(){
    registros = new LinkedList<>();
    ParseFile.nArq = "poa_temps.txt";
    dadosCarregados = false;
    carregaDados();
  }

  public ParseFile(String nomeArquivo){
    registros = new LinkedList<>();
    ParseFile.nArq = nomeArquivo;
    dadosCarregados = false;
    carregaDados();
  }

  public List<RegistroDoTempo> getRegistros(){
    return registros;
  }

  public void setRegistros(List<RegistroDoTempo> registros) {
    ParseFile.registros = registros;
  }

  public String getNArq(){
    return nArq;
  }

  public void setNArq(String nome) {
    ParseFile.nArq = nome;
  }

  public boolean getDadosCarregados() {
    return dadosCarregados;
  }

  public void setDadosCarregados(boolean dadosCarregados) {
    ParseFile.dadosCarregados = dadosCarregados;
  }


  public void carregaDados(){
        String currDir = Paths.get("").toAbsolutePath().toString();
        // Monta o nome do arquivo
        String nomeCompleto = currDir+"/"+nArq;
        System.out.println(nomeCompleto);
        // Cria acesso ao "diretorio" da mídia (disco)
        Path path = Paths.get(nomeCompleto);

        String linha = "";
         // Usa a classe scanner para fazer a leitura do arquivo
         try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
            // Pula o cabecalho
            sc.nextLine();
            // Le os dados
            while(sc.hasNext()){
                linha = sc.nextLine();
                String dados[] = linha.split(" ");
                // Trata a data
                String data[] = dados[0].split("/");
                int dia = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int ano = Integer.parseInt(data[2]);
                // Trata demais dados
                double precipitacaoMaxima = Double.parseDouble(dados[1]);
                double precipitacaoMinima = Double.parseDouble(dados[2]);
                double horasInsolacao = Double.parseDouble(dados[3]);
                double temperaturaMedia = Double.parseDouble(dados[4]);
                double umidadeRelativaDoAr = Double.parseDouble(dados[5]);
                double velocidadeDoVento = Double.parseDouble(dados[6]);
                // Cria um registro e insere na lista
                RegistroDoTempo reg = new RegistroDoTempo(dia, mes, ano, precipitacaoMaxima, precipitacaoMinima, horasInsolacao, temperaturaMedia, umidadeRelativaDoAr, velocidadeDoVento);
                registros.add(reg);
            }
         }catch (IOException x){
             System.err.format("Erro de E/S: %s%n", x);
         }
         dadosCarregados = true;
    }
  
}
