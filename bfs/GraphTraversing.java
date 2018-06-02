// BFS way of groph traversing using Adjcanacy matrix
public class GraphTraversing{
	public static void main(String... args){
		test1();
		test2();

	}
	public static void test1(){
		Graph g =new Graph();
		//undirected graph with 5 vertex
		g.setVertex(5);
		g.setAdj(5);
		g.addEdge(0,1);
		g.addEdge(0,4);	
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(1,0);
		g.addEdge(3,2);
		g.addEdge(3,0);
		g.addEdge(3,1);
		g.addEdge(2,3);
		g.addEdge(2,4);
		g.addEdge(4,0);
		g.addEdge(4,2);
		int [][] adj=g.getAdj();
		System.out.println("Adjcanacy Matrix is:");
		for(int u=0;u<g.getVertex();u++){
			for(int v=0;v<g.getVertex();v++){
				System.out.print("   "+adj[u][v]);
			}
			System.out.println();
		}
		Traverse t = new Traverse();
		t.bfs(g,0);//0,1,3,4,2
		t.bfs(g,2);//2,3,4,0,1
	}
	public static void test2(){
		Graph g =new Graph();
		//directed graph with 4 vertex
		g.setVertex(4);
		g.setAdj(4);
		g.addEdge(0,1);
		g.addEdge(0,2);	
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		int [][] adj=g.getAdj();
		System.out.println("Adjcanacy Matrix is:");
		for(int u=0;u<g.getVertex();u++){
			for(int v=0;v<g.getVertex();v++){
				System.out.print("   "+adj[u][v]);
			}
			System.out.println();
		}
		Traverse t = new Traverse();
		t.bfs(g,0);//0,1,2,3
		t.bfs(g,2);//2,0,3,1
	}
}