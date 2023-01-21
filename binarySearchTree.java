package Tree;

public class binarySearchTree extends binaryTree{




    public void insertion(int value){
        Node newestNode = new Node(value);
       root =  BSTInsert(root,newestNode);
    }
    private Node  BSTInsert( Node node, Node newNode){

        if(node == null) {
            node = newNode;
        } else if (newNode.key < node.key){
            node.left = BSTInsert(node.left, newNode);
        } else if(newNode.key > node.key) {
            node.right = BSTInsert(node.right, newNode);
        }
        return node;
    }


    @Override
    public Node search(int value) {

        return searched(root,value);
    }

    private Node searched(Node node,int value) {
       while(node!=null){
           if (node.key == value) {
               return node;
           }else if(node.key>value){
               node = node.left;
           }else{
               node = node.right;
           }
       }
       return node ;
    }
}
