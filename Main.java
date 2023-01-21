package Tree;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        binaryTree tree = new binaryTree();
//
//        tree.inorder();
//        System.out.println();
//        tree.preorder();
//        System.out.println();
//        tree.postorder();
//        System.out.println();
//
//        Node node = tree.search(36);
//        System.out.println(node +"    containing key   " +node.key );
//
//        System.out.println("Parent Method.");
//        System.out.println(tree.parent(36) +"   containing key   " + tree.parent(36).key );
//
//        System.out.println("Sibling Method.");
//        Node temp = tree.Sibling(36);
//        System.out.println(temp + "    containing key   " + temp.key );
//
//        Node n1=tree.Sibling(temp);
//        System.out.println(n1 + "   containing key    "+ n1.key);


        binarySearchTree tree1 = new binarySearchTree();
        Scanner input = new Scanner(System.in);
        System.out.println(" How much values you want to enter in your tree");
        int n = input.nextInt();
        System.out.println("Enter values");
        for(int i =0; i<n; i++){
            tree1.insertion(input.nextInt());
        }


//        tree1.preorder();
//        System.out.println();
//        tree1.inorder();
//        System.out.println();
//        tree1.postorder();


//        Node node1 = tree1.search(45);
//        System.out.println(node1 +"    containing key   " +node1.key );
//
//        System.out.println("Parent Method.");
//        System.out.println(tree1.parent(45) +"   containing key   " + tree1.parent(45).key );
////
////        System.out.println("Sibling Method.");
////        Node temp = tree.Sibling(45);
////        System.out.println(temp + "    containing key   " + temp.key );
////
////        Node n1=tree.Sibling(temp);
////        System.out.println(n1 + "   containing key    "+ n1.key);

        System.out.println(tree1.depth(tree1.root));


    }
}
