package Course.Classes.BinaryTree;

import javax.swing.*;
import java.util.Scanner;

public class BST {
    Node root;

    BST() {
        root = null;
    }


    void insert(int x) {
        this.root = insert(this.root, x);
    }

    Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        } else {
            if (x < root.getElement()) {
                root.setLeft(insert(root.getLeft(), x));
            } else if (x > root.getElement()) {
                root.setRight(insert(root.getRight(), x));
            }
        }
        return root;
    }

    Boolean search(int x) {
        return search(this.root, x);
    }

    Boolean search(Node root, int x) {

        if (x == root.getElement()) {
            return true;
        }

        if (x < this.root.getElement()) {
            search(root.getLeft(), x);
        }

        if (x > this.root.getElement()) {
            search(root.getRight(), x);
        }
        return false;
    }


    int getMin(Node root) {
        if (root.getLeft() == null) {
            return root.getElement();
        }
        return getMin(root.getLeft());
    }

    void remove(int x) {
        this.root = (remove(this.root, x));
    }


    Node remove(Node root, int x) {
        if (root == null) return null;

        if (x < root.getElement()){
            root.setLeft(remove(root.getLeft(),x));
        }else if (x > root.getElement()){
            root.setRight(remove(root.getRight(),x));
        }
        else {

            if (root.getLeft() == null && root.getRight() == null){
                return null;
            }

            if (root.getLeft() == null) return root.getRight();
            if (root.getRight() == null) return root.getLeft();

            int min = getMin(root.getRight());
            root.setElement(min);
            root.setRight(remove(root.getRight(), min));
        }

        return root;
    }

    public void show() {
        System.out.println("\n==================== BST ====================");
        show(this.root, 0);
        System.out.println("============================================\n");
    }

    private void show(Node root, int level) {
        if (root == null) return;

        show(root.getRight(), level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(root.getElement());

        show(root.getLeft(), level + 1);
    }

    void preOrder(){
        preOrder(this.root);
    }

    void preOrder(Node root){
        if (root == null) return;
        System.out.print(" " + root.getElement());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    void posOrder(){
        posOrder(this.root);
    }

    void posOrder(Node root){
        if (root == null) return;
        posOrder(root.getLeft());
        posOrder(root.getRight());
        System.out.print(" " + root.getElement());
    }

    void inOrder(){
        inOrder(this.root);
    }

    void inOrder(Node root){
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.print(" " + root.getElement());
        inOrder(root.getRight());
    }







    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(6);
        bst.insert(3);
        bst.insert(9);
        bst.insert(1);
        bst.insert(5);
        bst.insert(2);
        bst.insert(4);
        bst.insert(8);
        bst.insert(10);
        bst.insert(7);
        bst.insert(11);
        bst.insert(0);
        bst.show();


        System.out.println("Pre : ");
        bst.preOrder();
        System.out.println();
        System.out.println("Pos");
        bst.posOrder();
        System.out.println();
        System.out.println("In");
        bst.inOrder();





        //       Scanner kIn = new Scanner(System.in);

//        while (true){
//            bst.show();
//            System.out.println("Do Something");
//            System.out.println("1 - Insert");
//            System.out.println("2 - Remove");
//            System.out.print("> ");
//
//            int selection = kIn.nextInt();
//
//            switch (selection){
//                case 1 -> {
//                    System.out.print("Digit the value to insert: ");
//                    int value = kIn.nextInt();
//                    bst.insert(value);
//                }
//                case 2 -> {
//                    System.out.print("Digit the value to remove: ");
//                    int value = kIn.nextInt();
//                    bst.remove(value);
//                }
//            }
//        }
    }
}

