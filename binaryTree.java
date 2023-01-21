package Tree;

public class binaryTree {


    Node root;
    //insertion method to hardcode the binary tree
 public   void insertion(){
        root = new Node(54);

        Node n2  = new Node(55);
        Node n3  = new Node(36);
        Node n4  = new Node(30);
        Node n5  = new Node(60);

        root.left = n2;
        root.right = n5;
        n2.left = n3;
        n2.right = n4;

    }
    //method to print the node
    public void print(Node node){
        System.out.print(node.key + "   ");
    }
    public void inorder(){
        inorder1(root);
    }
    private void inorder1(Node node){
        if(node!=null){
            inorder1(node.left);
            print(node);
            inorder1(node.right);
        }

    }

    public void preorder(){
        preorder1(root);
    }
    private void preorder1(Node node){
        if(node!=null){
            print(node);
            preorder1(node.left);
            preorder1(node.right);
        }

    }
    public void postorder(){
        postorder1(root);
    }
    private void postorder1(Node node){
        if(node!=null){
            postorder1(node.left);
            postorder1(node.right);
            print(node);
        }

    }

    public Node left(Node node){
        return node.left;
    }
    public Node right(Node node){
        return node.right;
    }
    public boolean hasLeft(Node node){
        if(node.left!=null){
            return true;
        }
        return false;
    }
    public boolean hasRight(Node node){
        if(node.right!=null){
            return true;
        }
        return false;
    }

    public Node search(int value){
        Queue queue = new Queue();
        queue.enqueue(root);
        return BFS(root,queue,value);
    }
    //iterative solution of breadth first search
    private  Node BFS (Node node, Queue queue,int  value){
        if(node!=null){
            while(!queue.isEmpty()){
                Node temp = queue.dequeue();
                if( temp.key  == value ){
                    return temp;
                }
                if(hasLeft(temp)){
                   queue.enqueue(temp.left);
                }else if(hasRight(node)){
                    queue.enqueue(temp.right);
                }
            }
        }

        return null;
    }

    public Node parent(int value){

        if(root!=null){
            Queue queue = new Queue();
            Node parent = root;
            queue.enqueue(parent);
            while(!queue.isEmpty()){
                parent =queue.dequeue();
                if(parent.left.key == value
                        || parent.right.key == value){
                    return parent;
                }
                if(hasLeft(parent)){
                    queue.enqueue(parent.left);
                }else if(hasRight(parent)){
                    queue.enqueue(parent.right);
                }
            }

        }
        return null;
    }
    public Node Sibling(int value){

        if(root!=null) {
            Queue queue = new Queue();
            Node ptr = root;
            queue.enqueue(ptr);
            while (!queue.isEmpty()) {
                ptr = queue.dequeue();
                if (ptr.left.key == value) {
                    return ptr.right;
                } else if (ptr.right.key == value) {
                    return ptr.right;
                }
                if (hasLeft(ptr)) {
                    queue.enqueue(ptr.left);
                } else if (hasRight(ptr)) {
                    queue.enqueue(ptr.right);
                }
            }
        }
        return null;
    }

    public Node Sibling(Node node){

        if(root!=null){
            Queue queue = new Queue();
            Node ptr = root;
            queue.enqueue(ptr);
            while(!queue.isEmpty()){
                ptr = queue.dequeue();
                if (ptr.left == node) {
                    return ptr.right;
                } else if (ptr.right == node) {
                    return ptr.right;
                }
                if (hasLeft(ptr)) {
                    queue.enqueue(ptr.left);
                } else if (hasRight(ptr)) {
                    queue.enqueue(ptr.right);
                }

            }
        }
        return null;
    }

    public Node parent(Node node){

        if(root!=null){
            Queue  queue = new Queue();
            Node parent = root;
            queue.enqueue(parent);
            while(!queue.isEmpty()){
                parent =queue.dequeue();
                if(parent.left == node
                        || parent.right== node){
                    return parent;
                }
                if(hasLeft(parent)){
                    queue.enqueue(parent.left);
                }else if(hasRight(parent)){
                    queue.enqueue(parent.right);
                }
            }
        }
        return null;
    }

    public int depth( Node node) {
     int level =0;

     if(!hasLeft(node) && !hasRight(node)){
         System.out.println("enter base condition");
         return level;
     }
     if(hasLeft(node) || hasRight(node)){
         level++;
         level = depth(node.left);
         level = depth(node.right);
     }
     return level;
    }

    public int noOfNode(Node node){
        int leftTreeNode = 0;
        int rightTreeNode =0;

        if(node == null){
            return 0;
        }
        leftTreeNode = noOfNode(node.left);
        rightTreeNode = noOfNode(node.right);
        return 1 +leftTreeNode +rightTreeNode;
    }
}
