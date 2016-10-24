/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cword.counterWord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public class CW {

    private final HashMap<String, Integer> map;

    public CW() {
        map = new HashMap<>();
    }

    public void insertWord(String word) {
        word = word.trim();
        if (!"".equals(word)) {
            word = word.toLowerCase();
            if (map.isEmpty()) {
                map.put(word, 1);
            } else if (map.get(word) != null) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    }

    public void Searching(String word) {
        word = word.trim();
        if (!"".equals(word)) {
            word = word.toLowerCase();
            if (map.get(word) != null) {
                System.err.print("Word : [" + word + "] ");
                System.err.println("Count : " + map.get(word));
            }
        }
    }

    public void Traversal() {
        Set<String> string = map.keySet();
        System.err.println("Size : " + map.size());
        for (String str : string) {
            if (map.get(str) != null) {
                System.err.print("Word : [" + str + "] ");
                System.err.println("Count : " + map.get(str));
            }
        }

    }

    public void MaxFre() {
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.err.println("WORD : [" + entry.getKey() + "] COUNT : [" + entry.getValue() + "]");
        }
    }
}
