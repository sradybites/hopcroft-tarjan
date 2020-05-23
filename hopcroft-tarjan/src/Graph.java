import java.util.HashSet;
import java.util.Set;

/** General implementation of a graph.
 *
 * @author Brady Sites */
public class Graph {

    // Probably want to use HashMap but I'm very tired right now
    private Set<Node> V;

    public Graph() {
        V= new HashSet<>();
    }

    public void add(Node n) {
        V.add(n);
    }

    private class Node {
        private int id;

        public Node(int id) {
            this.id= id;
        }
    }
}
