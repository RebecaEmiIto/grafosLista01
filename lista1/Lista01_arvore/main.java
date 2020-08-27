package Lista01_arvore;
import java.util.*;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println("___________Insira o total de componentes conexas:___________");
        tree.totalElementos();
        System.out.println("___________Output:___________");
        tree.insert(1,2);
        tree.insert(3,4);
        tree.insert(5,6);
        tree.insert(2,3);
        tree.insert(3,10);
        tree.insert(5, 6);
        tree.insert(6, 7);
        tree.insert(5, 7);
        tree.insert(6, 8);
        tree.insert(3, 7);
        tree.insert(4, 7);
        tree.insert(9, 10);
    }
}