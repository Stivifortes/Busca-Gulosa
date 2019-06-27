public class Main {
    public static void main(String[] args) {

        No no1 = new No("A");
        No no2 = new No("B");
        No no3 = new No("C");
        No no4 = new No("D");
        No no5 = new No("E");

        //vizinhos do no 1<<<>>>
        no2.adicionarVizinho(no1);

        System.out.println(no1.getNome());

        //Executar o Algoritmo
        BFS Blargura = new BFS();
        No resultado;
        resultado = Blargura.bfs(no3);
    }
}
