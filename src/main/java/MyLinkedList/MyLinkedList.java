package MyLinkedList;

public class MyLinkedList {


    private MyNode head = null;

    public MyLinkedList(String key) {
        head = new MyNode(key, null);

    }

    public MyNode getHead(){return head;
    }

    public void add(String key, Integer value) {
        MyNode currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }


    public Integer size(){
        MyNode currentNode = head;
        Integer counter = 1;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }
    public void delete(String key){

    }

    private void addToEnd(MyNode currentNode, MyNode n){

    }


}
