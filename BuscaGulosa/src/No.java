
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No {
    private String nome;
    private List<No> vizinhos  = new ArrayList<>();
    private Boolean visitado = true;
    private No no_inicial;
    //Construtor


    public No() {
        this.vizinhos = new ArrayList<>();
    }

    public No(String nome) {
        this.nome = nome;
    }


    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public No getNo_inicial() {
        return no_inicial;
    }

    public void setNo_inicial(No no_inicial) {
        this.no_inicial = no_inicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<No> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<No> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public Boolean getVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }

    //Adicionar Vizinhos
    public void adicionarVizinho (No vizinho) {

        this.vizinhos.add(vizinho);
        System.out.println("Foi adicionado o Vizinho " + vizinho.nome);
    }


}
