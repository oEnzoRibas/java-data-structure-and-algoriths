package Course.Classes.BinaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        this.root = null;
    }

    void insert(int x){
        this.root = insert(x, this.root);
    }

    Node insert(int x, Node i) {
        if (i == null) {
            i = new Node(x);
        } else if (i.getElement() < x) {
            i.setRight(insert(
                    x,
                    i.getRight()
            ));
        } else if (i.getElement() > x) {
            i.setLeft(insert(
                    x,
                    i.getLeft())
            );
        }
        return i;
    }

    boolean search(int x) {
        return search(x, this.root);
    }

    boolean search(int x, Node i) {
        if (i == null) return false;
        if (i.getElement() == x) return true;
        if (x < i.getElement()) return search(x, i.getLeft());
        return search(x, i.getRight());
    }
    void walkMiddle() {
        walkMiddle(this.root);
    }

    void walkMiddle(Node i) {
        if (i != null) {
            walkMiddle(i.getLeft());
            System.out.print(i.getElement() + " ");
            walkMiddle(i.getRight());
        }
    }
    void walkPre() {
        walkPre(this.root);
    }

    void walkPre(Node i) {
        if (i != null) {
            System.out.print(i.getElement() + " ");
            walkPre(i.getLeft());
            walkPre(i.getRight());
        }
    }
        void walkPos () {
            walkPos(this.root);
        }

        void walkPos(Node i){
            if (i != null){
                walkPos(i.getLeft());
                walkPos(i.getRight());
                System.out.println(i.getElement() + " ");
            }
        }
    void delete(int x) {
        this.root = delete(x, this.root);
    }

    Node delete(int x, Node i) {
        if (i == null) return null;

        if (x < i.getElement()) {
            i.setLeft(delete(x, i.getLeft()));
        } else if (x > i.getElement()) {
            i.setRight(delete(x, i.getRight()));
        } else {

            if (i.getLeft() == null && i.getRight() == null) {
                return null;
            }

            if (i.getLeft() == null) return i.getRight();
            if (i.getRight() == null) return i.getLeft();

            Node sucessor = smallest(i.getRight());
            i.setElement(sucessor.getElement());
            i.setRight(delete(sucessor.getElement(), i.getRight()));
        }

        return i;
    }

    Node smallest(Node i) {
        while (i.getLeft() != null) {
            i = i.getLeft();
        }
        return i;
    }

}