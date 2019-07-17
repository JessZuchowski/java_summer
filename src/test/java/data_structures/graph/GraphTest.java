package data_structures.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddVertexNode() {
        Graph test = new Graph();

        test.addVertexNode(1);
        test.addVertexNode(3);
        test.addVertexNode(5);

        assertFalse(test.adjacent.isEmpty());
    }

    @Test
    public void testAddEdge() {
        Graph test = new Graph();

        test.addEdge(1, 3);
        test.addEdge(3, 5);
        test.addEdge(5, 7);

    }

    @Test
    public void testGetVertexNodeDepthFirst() {
    }

    @Test
    public void testGetVertexNodeBreadthFirst() {
    }

    @Test
    public void testGetNeighbors() {
    }

    @Test
    public void testGetSize() {
    }
}