package Lista01_arvore;
import java.util.*;

public class BinaryTree {

    private Node root;
    private int height;
    private int totalElements;

    public int totalElementos(){
        Scanner scan = new Scanner(System.in);
        totalElements = scan.nextInt();
        return totalElements;
    }

    public void insert(int _value, int j) {
        if (this.root == null) {
            this.root = new Node(_value);
            this.height++;
            totalElements--;
            System.out.println(totalElements);
        }else{
            Node currNode = this.root;
            this.height++;
            while(totalElements != 0){
                if(_value == currNode.getValue() || j == currNode.getValue()){
                    totalElements--; 
                    System.out.println(totalElements);
                    if(currNode.getLeft() == null){
                        currNode.setLeft(new Node(_value));
                        break;
                    }else{
                        System.out.println(totalElements + " CICLO FORMADO!");
                        currNode = currNode.getLeft();
                    }
                }else{
                    //totalElements--;
                    if(currNode.getRight() == null){
                        currNode.setRight(new Node(_value));
                        break;
                    }else{
                        currNode = currNode.getRight();
                    }
                }
            }
        }
    }
    /**
    public String inOrder(Node node){
        String arvore = "";
        if (node == null) {
            return arvore;
        } else {
            arvore += inOrder(node.getLeft()) + " ";
            arvore += node.getValue() + " ";
            arvore += inOrder(node.getRight()) + " ";
            totalElements++;
        }
        return arvore;
    }



    public void insert(int _value, int j) {
        if (this.root == null) {
            this.root = new Node(_value);
            this.height++;
            totalElements--;
            System.out.println(totalElements);
        }else{
            Node currNode = this.root;
            this.height++;
            while(totalElements != 0){
                if(_value == currNode.getValue()){
                    totalElements--; 
                    System.out.println(totalElements);
                    if(currNode.getLeft() == null){
                        currNode.setLeft(new Node(_value));
                        break;
                    }else if(j == currNode.getValue()){
                        System.out.println(totalElements + " CICLO FORMADO!");
                        currNode = currNode.getLeft();
                    }
                }else{
                    //totalElements--;
                    if(currNode.getRight() == null){
                        currNode.setRight(new Node(_value));
                        break;
                    }else{
                        currNode = currNode.getRight();
                    }
                }
            }
        }
    }
     */

    public void inOrder(Node node, int _value, int j){
        if (this.root == null) {
            this.root = new Node(_value);
            totalElements--;
        
        }else if (node.getValue() == _value){
            node.setLeft(new Node(j));
            if(j == node.getRight().getValue()){
                System.out.println(totalElements + " CICLO FORMADO!");
            }
        } else {
            totalElements++;
        }
    }



    public Node getRoot(){
        return this.root;
    }

    public int getHeight() {
        return height;
    }    
}