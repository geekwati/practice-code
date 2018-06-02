//DFS way of graph traversing using Adjcancy list
import java.util.LinkedList;
public class GraphTraversing{
	public static void main(String... args){
		test1();
		test2();
		
	}
	public static void test1(){
		Graph g = new Graph(5);
		//assume naming of vertex is from 0 to 5-1
		//undirected graph
		g.addEdge(0,1);
		g.addEdge(0,3);
		g.addEdge(0,4);
		g.addEdge(1,3);
		g.addEdge(1,0);
		g.addEdge(3,2);
		g.addEdge(3,0);
		g.addEdge(3,1);
		g.addEdge(2,3);
		g.addEdge(2,4);
		g.addEdge(4,0);
		g.addEdge(4,2);
		LinkedList<Integer>[] l =g.getAdj();
		for(int i=0;i<5;i++){
			System.out.println("adjacent of vertex "+i+" "+l[i]);

		}
		Traverse t = new Traverse();
		t.dfs(g,0);//answer is 0,1,3,2,4
		t.dfs(g,2);// 2,3,0,1,4
	}
	public static void test2(){
		Graph g = new Graph(4);
		//assume naming of vertex is from 0 to 4-1
		//directed graph
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		LinkedList<Integer>[] l =g.getAdj();
		for(int i=0;i<4;i++){
			System.out.println("adjacent of vertex "+i+" "+l[i]);

		}
		Traverse t = new Traverse();
		t.dfs(g,0);//0,1,2,3
		t.dfs(g,2);//2,0,1,3
	}
}