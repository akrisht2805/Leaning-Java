package TrieDS;

class TrieNode {
    TrieNode children[] = new TrieNode[26];
    Boolean isTerminalNode;

    TrieNode(){
        for( int i=0; i<26; i++ ){
            this.children[i] = null;
        }
        this.isTerminalNode = false;
    }
}

public class Trie {

    private TrieNode root;

    Trie(){
        root = new TrieNode();
    }

    public void insertWord(String word){
        TrieNode node = root;
        for( int i=0; i<word.length(); i++ ){
            int idx = word.charAt(i)-'a';
            if( node.children[idx] == null ){
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx]; 
        }
        node.isTerminalNode = true;
    }

    public Boolean searchWord(String word){
        TrieNode node = root;
        for(int i=0; i<word.length(); i++ ){
            int idx = word.charAt(i)-'a';
            if( node.children[idx] == null ){
                return false;
            }
            else{
                node = node.children[idx];
            }
        }
        return node.isTerminalNode;
    }

    public Boolean prefixWord(String word){
        TrieNode node = root;
        for( int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if( node.children[idx] == null ){
                return false;
            }
            else{
                node = node.children[idx];
            }
        }
        return true;
    }


    public static void main(String[] args) {
        
        Trie t = new Trie();
        t.insertWord("akri");
        t.insertWord("akrisht");
        t.insertWord("yadav");
        System.out.println(t.searchWord("akrisht"));
        System.out.println(t.searchWord("akris"));
        System.out.println(t.searchWord("akri"));
        System.out.println(t.prefixWord("akrishty"));
        System.out.println(t.prefixWord("yar"));
        System.out.println(t.prefixWord("yad"));

        Trie trie = new Trie();
        
        // Insert words into Trie
        trie.insertWord("apple");
        trie.insertWord("app");
        
        // Search words
        System.out.println(trie.searchWord("apple")); // true
        System.out.println(trie.searchWord("app"));   // true
        System.out.println(trie.searchWord("appl"));  // false

        // Check prefixes
        System.out.println(trie.prefixWord("app")); // true
        System.out.println(trie.prefixWord("apl")); // false
    }
}
