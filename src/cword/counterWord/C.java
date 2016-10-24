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
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author User
 */
public class C {

    private final HashMap<String, Data> map;
    private Data wordCont;

    public C() {
        map = new HashMap<>();
    }

    public void insertWord(String word) {
        word = word.trim();
        if (!"".equals(word)) {
            word = word.toLowerCase();
            wordCont = new Data();
            if (map.isEmpty()) {
                wordCont.setCount(1);
                wordCont.setStr(word);
                map.put(word, wordCont);
            } else if (map.get(word) != null) {
                wordCont.setCount(map.get(word).getCount() + 1);
                wordCont.setStr(word);
                map.put(word, wordCont);
            } else {
                wordCont.setCount(1);
                wordCont.setStr(word);
                map.put(word, wordCont);
            }
        }
    }

    public void Searching(String word) {
        if (map.get(word) != null) {
            System.err.print("Word : [" + map.get(word).getStr() + "] ");
            System.err.println("Count : " + map.get(word).getCount());
        }
    }

    public void Travalsal() {
        Set<String> string = map.keySet();
        System.err.println("Size : " + map.size());
        for (String str : string) {
            if (map.get(str) != null) {
                System.err.print("Word : [" + map.get(str).getStr() + "] ");
                System.err.println("Count : " + map.get(str).getCount());
            }
        }

    }

    public void maxFre() {
        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> string = map.keySet();
        for (String str : string) {
            if (map.get(str) != null) {
                hm.put(map.get(str).getStr(), map.get(str).getCount());
            }
        }
        Set<Entry<String, Integer>> set = hm.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
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
