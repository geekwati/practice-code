public class Graph{
	private int vertex;
	private int [][] adj;
	public void setVertex(int v){
		vertex=v;
	}
	public int getVertex(){
		return vertex;
	}
	public int [][] getAdj(){
	return adj;
	}
	public void setAdj(int vertex){
		adj= new int[vertex][];//create v no. of rows
		for(int i=0;i<vertex;i++)
			adj[i]=new int[vertex];// create v no. of columns per row
		for(int u=0;u<vertex;u++){
			for(int v=0;v<vertex;v++){
				adj[u][v]=0;
			}
		}
	}
	public void addEdge(int u,int v){
		adj[u][v]=1;
	}
}
