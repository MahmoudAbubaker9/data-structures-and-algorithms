package graph;

import java.util.*;

public class Graph<T> {
  private final Map<String, Node> nodes = new HashMap<>();
  List<Node<T>> graphList;

  Graph(){
    graphList = new ArrayList<>();
  }

  public void addNode(Node<T> node){
//        Node<T> newNode = new Node<T>(value);
    graphList.add(node);
  }

  public void addEdge(Node n1, Node n2){
    if(graphList.contains(n1) && graphList.contains(n2)) {
      Node current = n1;
      while (current.next != null) {
        current = current.next;
      }
      current.next = n2;
    }
  }

  public List<Node<T>> getNodes(){
    return graphList;
  }

  public List<Node<T>> getNeighbors(Node n){
    List<Node<T>> edgeList = new ArrayList<>();
    Node current = n;
    while(current != null){
      edgeList.add(current);
      current = current.next;
    }
    return edgeList;
  }

  public int size(){
    return graphList.size();
  }

  public List<T> breadthFirst(Node node){
    List<T> breadthList = new ArrayList<>();
    Queue breadth = new LinkedList<>();
    Set visited = new HashSet();

    breadth.add(node);
    visited.add(node);

    while(!breadth.isEmpty()){
      Node<T> front = (Node<T>)breadth.poll();
      breadthList.add(front.value);

      for (Node<T> value : getNeighbors(node)){
        if(!visited.contains(value)){
          visited.add(value);
          breadth.add(value);
        }
      }
    }
    return breadthList;
  }
/////////////////////////////////////////Code37

  public String graphBusinessTrip(Graph graph,List<String> cities){
    Integer cost=0;
    for (int i=0;i<cities.size()-1;i++){
      Node<String> vertex=new Node<>(cities.get(i));
      Node<String> vertex1=new Node<>(cities.get(i+1));
      if (((Map)graph.nodes.get(vertex)).get(vertex1)!=null){
        cost+=((Integer)((Map)graph.nodes.get(vertex)).get(vertex1));
        System.out.println(cost);
      }
    }
    return cost > 0 ? "True, $" + cost : "False, $" + cost;
  }
////////////////////////////////////////////////

  public List<Node> DepthFirst(Node root) {
    if (root == null) return null;

    List<Node> vertices = new ArrayList<>();
    Stack depth = new Stack();
    Set<Node> visited = new HashSet<>();

    depth.push(root);

    while (!depth.isEmpty()) {
      Node top = (Node) depth.pop();
      if (!visited.contains(top)) {
        visited.add(top);
        vertices.add(top);
        for (Node neighbor : getNeighbors(top.data)) {
          depth.push(neighbor);
        }
      }
    }
    return vertices;
  }


  @Override
  public String toString() {
    String result = "[";
    for (int i = 0 ; i < graphList.size() - 1 ; i++){
      result += graphList.get(i).value + ", ";
    }
    result += graphList.get(graphList.size()-1).value + "]";
    return result;
  }
}
