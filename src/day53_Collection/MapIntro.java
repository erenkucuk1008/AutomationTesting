package day53_Collection;

import java.util.*;

public class MapIntro {

    Map<String, String> credentials = new HashMap<>();// random, accepts null

    Map<String, String> credentials2 = new LinkedHashMap<>();// keeps the insertion order, accepts null

    Map<String, String> credentials3 = new TreeMap<>();// sorted, does not accept null

    Map<String, String> credentials4 = new Hashtable<>();//is synchronized, thread-safe
}
