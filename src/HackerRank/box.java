package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'order' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. UNWEIGHTED_INTEGER_GRAPH city
     *  2. INTEGER company
     */

    /*
     * For the unweighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] and <name>To[i].
     *
     */

    public static List<Integer> order(int cityNodes, List<Integer> cityFrom, List<Integer> cityTo, int company) {
        HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<>(); //adjacency list
        LinkedList<Integer> queue = new LinkedList<>(); // queue for a bfs like search
        ArrayList<Integer> visited = new ArrayList<>(); // so we don't have loops
        for(int i = 0;i<cityFrom.size();i++){ // put everything into the adjacency list (O(n))
            if(adjacencyList.containsKey(cityFrom.get(i))){
                adjacencyList.get(cityFrom.get(i)).add(cityTo.get(i));
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(cityTo.get(i));
                adjacencyList.put(cityFrom.get(i), temp);
            }

            if(adjacencyList.containsKey(cityTo.get(i))){
                adjacencyList.get(cityTo.get(i)).add(cityFrom.get(i));
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(cityFrom.get(i));
                adjacencyList.put(cityTo.get(i), temp);
            }
        }
        System.out.println(adjacencyList);
        visited.add(company);
        Collections.sort(adjacencyList.get(company)); // sort just in case inputs werent sorted
        for(int x: adjacencyList.get(company)){//start with cities closest to company
            if(!visited.contains(x)){ //mark them visited
                visited.add(x);
                queue.add(x);
            }
        }
        while(!queue.isEmpty()){
            System.out.println(queue);
            int current = queue.remove();

            if(adjacencyList.containsKey(current)){
                Collections.sort(adjacencyList.get(current)); // sort just in case inputs werent sorted
                for(int x: adjacencyList.get(current)){//start with cities closest to company
                    if(!visited.contains(x)){ //mark them visited
                        visited.add(x);
                        queue.add(x);
                    }
                }
            }

        }
        visited.remove(new Integer(company));
        return visited;



    }

}
public class box {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Andrew\\Downloads\\input004.txt"));


        String[] cityNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int cityNodes = Integer.parseInt(cityNodesEdges[0]);
        int cityEdges = Integer.parseInt(cityNodesEdges[1]);

        List<Integer> cityFrom = new ArrayList<>();
        List<Integer> cityTo = new ArrayList<>();

        IntStream.range(0, cityEdges).forEach(i -> {
            try {
                String[] cityFromTo = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                cityFrom.add(Integer.parseInt(cityFromTo[0]));
                cityTo.add(Integer.parseInt(cityFromTo[1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int company = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.order(cityNodes, cityFrom, cityTo, company);
        System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
                + "\n");


        bufferedReader.close();

    }
}
