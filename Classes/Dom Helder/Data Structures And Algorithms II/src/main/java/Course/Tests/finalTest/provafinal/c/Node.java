package Course.Tests.finalTest.provafinal.c;

public class Node {

    private Node left;
    private Node right;

    private int element;

    Node(int x){
        this.element = x;
    }

    Node(){
        this(0);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
