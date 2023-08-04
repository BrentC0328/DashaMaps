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

    public MyNode get(String key){
        MyNode currentNode = head;

        while(currentNode != null){
            String keyCheck = currentNode.getData().getKey();
            if(keyCheck.equals(key)){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public Integer delete(String key){

        MyNode currentNode = head.getNext();
        MyNode previousNode = head;
        String keyCheck = currentNode.getData().getKey();

        while(currentNode != null && !keyCheck.equals(key)){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode == null){
            return null;
        }
        previousNode.setNext(currentNode.getNext());

        return currentNode.getData().getValue();

    }

    private void addToEnd(MyNode currentNode, MyNode n){


    }

    public Boolean isEmpty(){
        return head.getNext() == null;

    }


}
