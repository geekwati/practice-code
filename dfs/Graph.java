import java.util.List;
import java.util.LinkedList;
public class Graph{
	private int vertex;
	private LinkedList<Integer>[] adj ;
	public int getVertex(){
		return vertex;
	}
	public void setVertex(int v){
		vertex=v;

	}
	public LinkedList<Integer> [] getAdj(){
		return adj;
	}
	Graph(int v){
		vertex = v;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]= new LinkedList();
		}
	}
	public void addEdge(int u, int v){
		adj[u].add(v);
	}



}