class QueueArray{
    Node front;
    Node rear;

    QueueArray(){
        this.front = null;
        this.rear = null;
    }

    boolean isEmpty(){
        return front == null;
    }

    void enqueue(int value){
        Node node = new Node(value);

        if(isEmpty()){
            front = rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is underflow!");
        }

        int data = front.value;
        front.next = node;

    }
}