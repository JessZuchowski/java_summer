package data_structures.graph;

import java.util.*;

public class Graph {
    //define adjacency list using map
    public Map<VertexNode, List<VertexNode>> adjacent = new Map<VertexNode, List<VertexNode>>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public List<VertexNode> get(Object key) {
            return null;
        }

        @Override
        public List<VertexNode> put(VertexNode key, List<VertexNode> value) {
            return null;
        }

        @Override
        public List<VertexNode> remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends VertexNode, ? extends List<VertexNode>> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<VertexNode> keySet() {
            return null;
        }

        @Override
        public Collection<List<VertexNode>> values() {
            return null;
        }

        @Override
        public Set<Entry<VertexNode, List<VertexNode>>> entrySet() {
            return null;
        }
    };

    //ADD VERTEX METHOD
    public void addVertexNode(int vertex) {
        adjacent.putIfAbsent(new VertexNode(vertex), new ArrayList<>());
    }

    //ADD EDGE METHOD
    public void addEdge(int vertex1, int vertex2) {
        //create new vertices
        VertexNode vn1 = new VertexNode(vertex1);
        VertexNode vn2 = new VertexNode(vertex2);
        //get both vertices from the map and add the other vertex to it
        adjacent.get(vn1).add(vn2);
        adjacent.get(vn2).add(vn1);
    }

    //GET VERTICES METHODS
    //DEPTH-FIRST TRAVERSAL
    public Set<Integer> getVertexNodeDepthFirst(Graph graph, int root) {
        //create set of visited vertices
        Set<Integer> visited = new LinkedHashSet<>();
        //create stack, add root
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        //while stack is not empty, remove vertex
        while (!stack.isEmpty()) {
            int rootVertex = stack.pop();
            //if set does not contain vertex, add it
            if (!visited.contains(rootVertex)) {
                visited.add(rootVertex);
                //for each VertexNode in graph, get neighbor vertex and add to stack
                for (VertexNode vn : graph.getNeighbors(rootVertex)) {
                    stack.push(vn.vertex);
                }
            }
        }
        return visited;
    }

    //BREADTH-FIRST TRAVERSAL
    public Set<Integer> getVertexNodeBreadthFirst(Graph graph, int root) {
        //create set of visited vertices
        Set<Integer> visited = new LinkedHashSet<>();
        //create queue, add root
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        //while queue is not empty, remove vertex
        while (!queue.isEmpty()) {
            int rootVertex = queue.poll();
            //for each VertexNode in graph, get neighbor vertex and add to queue
            for (VertexNode vn : graph.getNeighbors(rootVertex)) {
                //if set does not contain vertex, add it
                if (!visited.contains(vn.vertex)) {
                    visited.add(vn.vertex);
                    queue.add(vn.vertex);
                }
            }
        }
        return visited;
    }

    //GET NEIGHBORS METHOD
    List<VertexNode> getNeighbors(int vertex) {
        return adjacent.get(new VertexNode(vertex));
    }

    //GET SIZE METHOD
    public int getSize() {
        return adjacent.size();
    }
}
