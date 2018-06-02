import java.util.List;
import java.util.LinkedList;
public class Traverse{
	boolean []visited;
	public void dfs(Graph g, int startVertex){
		visited = new boolean[g.getVertex()];
		for (int i=0; i<g.getVertex(); i++){
			visited[i]=false;
		}
		System.out.println("graph traversed with initial vertex "+startVertex+":");
		System.out.println();
		LinkedList<Integer> []adj=g.getAdj();
		dfsTraverse(startVertex,adj);
	}
	public void dfsTraverse(int startVertex, LinkedList<Integer> []adjecent){
		System.out.println("  "+startVertex);
		visited[startVertex]=true;
		LinkedList<Integer> adj = adjecent[startVertex];
		for(Integer v: adj){
			if(visited[v]==false){
				dfsTraverse(v,adjecent);
			}
		}


	}
}