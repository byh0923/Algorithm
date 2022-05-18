package bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * 깊이우선탐색
 *
 *         a
 *     b       c
 *  d      g   h   i
 *  e      f       j
 *  BFS는 두 개의 큐를 사용하는데 DFS는 스택과 큐를 활용
 *
 *  visited   A
 *  needVisit B C
 *
 *  visited   A C
 *  needVisit B A G H I
 *  visited   A C I
 *  needVisit B A G H C J
 *  visited   A C I J
 *  needVisit B A G H C I
 *
 *  시간복잡도 노드 수 + 간선 수
 * */
public class DFS {
    public static HashMap<String, ArrayList<String>> graph = new HashMap<>();
    public void inputGraph() {
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        graph.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));;
    }

    public ArrayList<String> dfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        while(needVisit.size() > 0) {
            String node = needVisit.remove(needVisit.size() - 1);
            if(!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.inputGraph();
        List<String> result = dfs.dfsFunc(graph, "A");
        Stream<String> stream = result.stream();
        stream.forEach(value -> System.out.print(value + " "));
    }
}
