package data_structures.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testSize() {
        HashTable<String, Integer> test = new HashTable<>();

        assertEquals(0, test.size());

        test.addKeyValuePair("june", 1);
        assertEquals(1, test.size());
    }

    @Test
    public void testIsEmpty() {
        HashTable<String, Integer> test = new HashTable<>();

        assertTrue(test.isEmpty());

        test.addKeyValuePair("bee", 5);
        assertFalse(test.isEmpty());
    }

    @Test
    public void testRemoveKey() {
        HashTable<String, Integer> test = new HashTable<>();

        test.addKeyValuePair("mantis", 3);
        assertSame(3, test.getValue("mantis"));

        test.removeKey("mantis");
        assertEquals(null, test.getValue("mantis"));
    }

    @Test
    public void testGetValue() {
        HashTable<String, Integer> test = new HashTable<>();

        test.addKeyValuePair("june", 1);
        test.addKeyValuePair("mantis", 3);
        test.addKeyValuePair("bee", 5);

        assertSame(1, test.getValue("june"));
        assertSame(3, test.getValue("mantis"));
        assertSame(5, test.getValue("bee"));
    }

    @Test
    public void testAddKeyValuePair() {
        HashTable<String, Integer> test = new HashTable<>();

        test.addKeyValuePair("june", 1);
        test.addKeyValuePair("mantis", 3);

        assertEquals(2, test.size());

        test.addKeyValuePair("bee", 5);
        test.addKeyValuePair("may", 7);

        assertEquals(4, test.size());
    }
}