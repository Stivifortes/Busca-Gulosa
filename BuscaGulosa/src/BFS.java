import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class BFS {

    No no_inicial, no_objetivo;


        public No bfs (No no_inicial){

        Queue <No> fila = new LinkedList<>();                  //Fila
        ArrayList<No> explorados = new ArrayList<>();          //Lista de Explorados
        No atual = null;
        if (this.no_inicial.equals(no_objetivo)) {
            System.out.println(no_inicial);
        }
        else {
            fila.add(this.no_inicial);
            explorados.add(no_inicial);

            while(!fila.isEmpty()){

                fila.add(atual);
                atual = fila.remove();
                if(atual.equals(this.no_objetivo)) {
                    System.out.println(explorados);
                }
                else{
                    if(atual.getVizinhos().isEmpty());
                    System.out.println("Nao ha vizinhos");
                }
                explorados.add(atual);
            }

        }


            return atual;
        }

}
