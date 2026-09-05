package Course.Tests.finalTest.provafinal.b;

public class NodeD {
    private NodeD next = null;
    private NodeD prev = null;
    private float element;


    NodeD(){
        this(-1);
    }

    NodeD(float x){
        this.element = x;
    }


    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPrev() {
        return prev;
    }

    public void setPrev(NodeD prev) {
        this.prev = prev;
    }

    public float getElement() {
        return element;
    }

    public void setElement(float element) {
        this.element = element;
    }
}
