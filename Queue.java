package Tree;

public class Queue {

    Node front;
    Node rear;
    int n;

    public boolean enqueue(Node node ){

        if(front == null){
            front = node ;
        }else{
            rear.next = node;
        }
        rear = node ;
        n++;
        return true;
    }
    public Node dequeue(){
        if(front == null){
            return null;
        }else{
            Node b = front;
            front = front.next;
            n--;
            return  b;
        }
    }

    public void print(){
        Node ptr = front;
        while(ptr!= rear.next ){
            System.out.print(ptr.key);
            System.out.print("    ");
            ptr = ptr.next;
        }
    }
    public boolean isEmpty() {

        if(front  == null){
            return true;
        }
        return false;
    }

    public int front() {
        return front.key;
    }
    public boolean isFull(){
        return false;
    }
    public int size(){
        return n;
    }
}
