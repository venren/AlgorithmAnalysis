package DesignPatterns;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/**
 * https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries/
 */
public class Examples {
    public static void main(String[] args) throws FileNotFoundException {
        ConcurrentHashMap cHashMap = new ConcurrentHashMap();
        cHashMap.put("key1","value1");
    }

}
