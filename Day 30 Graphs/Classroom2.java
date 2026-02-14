import java.util.*;
public class Classroom2 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
     static void createGraph( ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));

         graph[2].add(new Edge(2,1,1));
         graph[2].add(new Edge(2,3,1));
         graph[2].add(new Edge(2,4,2));

         graph[3].add(new Edge(3,1,3));
         graph[3].add(new Edge(3,2,1)); 

         graph[4].add(new Edge(4, 2, 2));

    }
    public static boolean detectCycle(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                    //cycle exists in one of the parts
                }  
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>graph[],boolean vis[], int curr, int par){
       vis[curr] = true;

       for(int i=0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        //case -3 
        if(!vis[e.dest]){
            if(detectCycleUtil(graph , vis , e.dest, curr)){
                return true;
            }
        }
        // case 1
        else if(vis[e.dest] && e.dest != par){
             return true;
        }
        //case 2 -> do nothing -> continue
       }
       return false;
    }
    public static void bfs(ArrayList<Edge> graph[]){
          boolean vis[] = new boolean[graph.length];
          for(int i=0;i<graph.length;i++){
            if(vis[i]){
                 bfsUtil(graph, vis);
            }
          }
    }
    public static void bfsUtil(ArrayList<Edge> graph[],boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
       
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[] , int curr,boolean vis[] ){
         //visit 
         System.out.print(curr + " ");
         vis[curr] = true;

         for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[curr]){
                dfsUtil(graph, e.dest, vis);
            }
         }
    }
    public static boolean hasPath(ArrayList<Edge> graph[], int src , int dest, boolean vis[]){
        if(src == dest){
            return true;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbour
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static boolean isBiPartite(ArrayList<Edge>graph[]){
        int color[] = new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i] = -1;// no color
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){//bfs
                q.add(i);
                color[i]=0;//yellow
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0;j<graph[curr].size();i++){
                          Edge e = graph[curr].get(j);
                          // case -1 
                          if(color[e.dest] == -1){
                            int nextColor = color[curr] == 0 ? 1: 0;
                            color[e.dest] = nextColor;  
                            q.add(e.dest);
                          }else if(color[e.dest] == color[curr]){// case -2
                             return false;
                          }
                    }
                }
            }
        }
        return true;
    }
    public static boolean isCycle(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i , vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[] , boolean stack[]){
      vis[curr] = true;
      stack[curr] = true;

      for(int i=0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        if(stack[e.dest]){ //cycle
            return true;
        }
        if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
            return true;
        }
      }
      stack[curr] = false;
      return false;
    }
    public static void topSort(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer>s = new Stack<>();
        
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                   topSortUtil(graph,i,vis,s); //modified dfs
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void printAllPaths(ArrayList<Edge>graph[] , int src,int dest ,String path){
        if(src == dest){
            System.out.println()
        }
    }
    static class Pair implements Comparable<Pair>{
        int n ;
        int path;

         public Pair(int n , int path){
            this.n = n;
            this.path = path;
         }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;// path based sorting for my pairs
        }
    }
    public static void dijkstra(ArrayList<Edge>graph[], int src){
        int dist[] = new int[graph.length];//dist[i] -> src to i
        for(int i=0; i<graph.length;i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;// + infinity
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        //loop
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                //neighbours
                for
            }
        }
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge>graph[] = new ArrayList[V];
          createGraph(graph);
          dfs(graph, 0,new boolean[V]);
    }
}
