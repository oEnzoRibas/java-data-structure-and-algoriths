package Course.Tests.finalTest.provafinal.c;

public class BST {

    private Node root;


    BST(){
    }

    void insert( int x ){
        this.root = insert(this.root, x);
    }

    Node insert(Node root , int x){
        if (root == null){
            root = new Node(x);
        }else {
            if (x < this.root.getElement()){
                root.setLeft(insert(root.getLeft(),x));
            }else if (x > root.getElement()){
                root.setRight(insert(root.getRight(),x));
            }
        }

        return root;
    }

    int numFolhas(){
        int total =0;
        return total += numFolhas(this.root, total);
    }
    int numFolhas(Node root, int total){

        if (root == null){
            return total + 0;
        }

        System.out.println(root.getElement());

        if (root.getLeft() == null){
            if (root.getRight() == null) {
                return total + 1;
            }
            return numFolhas(root.getRight(),total);
        }
        return numFolhas(root.getLeft(),total );
    }

    int getLeafCount(){
        return getLeafCount(this.root);
    }

    int getLeafCount(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        return getLeafCount(root.getLeft()) + getLeafCount(root.getRight());
    }

    public static void main(String[] args) {
        BST a = new BST();

        a.insert(50);
        a.insert(30);
        a.insert(70);
        a.insert(72);
        System.out.println(a.getLeafCount());
    }


}
