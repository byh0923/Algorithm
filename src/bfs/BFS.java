package bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
너비우선탐색
 레벨에 있는 버텍스를 먼저 탐색한다
        a
    b       c
 d      g   h   i
 e      f       j

 a
 ->b->c
 -> d -> g ->h ->i
 -> e -> f -> j
 
 자바로 표현하는 법
 Hashmap과 ArrayList활용

 키와 벨류로 나눔
 value를 인접한 노드

 큐 두개 만듦
 visited 없으면 넣는다
 needVisit 시작노드에 넣어

 1회
 visited A
 needVisit B C
 2회
 visited A B
 needVisit C A D
 3회
 visited A B C
 needVisit A D A G H I
 4회
 visited A B C (A가 이미 있으면 그냥 다음 반복) D
 needVisit A G H I B E F

 시간 복잡도

 O(노드 수 + 간선 수)
 * */
public class BFS {
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

    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();

        needVisit.add(startNode);

        while (needVisit.size() > 0) {
            String node = needVisit.remove(0);

            // 방문을 안했으면 넣어라
            if(!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.inputGraph();
        ArrayList<String> result = bfs.bfsFunc(graph, "A");
        Stream<String> stream =  result.stream();
        stream.forEach(value -> System.out.print(value+" "));

    }
}
