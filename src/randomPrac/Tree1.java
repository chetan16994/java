package randomPrac;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tree1 {
    class Node {
        Character data;
         List<Node> children;
        public Node(Character data){
            this.data=data;
            this.children=new LinkedList<>();
        }
        public void addChild(List<Character> children){

    }
    }
    public Node  getTree(Map<Character, List<Character>> edges, Character root1){
        Node root =new Node (root1);
//        edges.
        return root;
    }
}
