import java.util.Queue;
import java.util.LinkedList;
public class Traverse{
	boolean []visited;
	public void bfs(Graph g,int startVertex){
		visited= new boolean[g.getVertex()];
		for(int i=0;i<g.getVertex();i++){
			visited[i]=false;
		}
		System.out.println("graph traversed with initial vertex "+startVertex+":");
		System.out.println();
		Queue<Integer> q = new LinkedList();
		q.add(startVertex);
		visited[startVertex]=true;

		
		int v;
		int [][]adj=g.getAdj();
		while(q.isEmpty()!=true){
			v=q.poll();
			System.out.println("  "+v);
			for(int j=0;j<g.getVertex();j++){
				if((adj[v][j]==1)&&(visited[j]==false)){
					q.add(j);
					visited[j]=true;
				}

			}
				
		}

	}
}


