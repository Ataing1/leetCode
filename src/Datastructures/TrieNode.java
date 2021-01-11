package Datastructures;

import java.util.Arrays;

public class TrieNode {

    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode(){
        children = new TrieNode[26];
        Arrays.fill(children, null);
    }

    public boolean addString(String s){
        return false;
    }
}


