package Course.Lists.L9.A;

import java.util.ArrayList;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int x) {
        root = insert(x, root);
    }

    private Node insert(int x, Node r) {
        if (r == null) return new Node(x);

        if (x < r.value) r.left = insert(x, r.left);
        else if (x > r.value) r.right = insert(x, r.right);

        return r;
    }

    public int min() {
        if (root == null) throw new RuntimeException("Árvore vazia");
        return min(root).value;
    }

    private Node min(Node r) {
        while (r.left != null) r = r.left;
        return r;
    }


    public int max() {
        if (root == null) throw new RuntimeException("Árvore vazia");
        return max(root).value;
    }

    private Node max(Node r) {
        while (r.right != null) r = r.right;
        return r;
    }


    public Integer firstGreaterThan(int k) {
        Node r = root;
        Node candidate = null;

        while (r != null) {
            if (r.value > k) {
                candidate = r;
                r = r.left;
            } else {
                r = r.right;
            }
        }

        return (candidate != null) ? candidate.value : null;
    }


    public void buildBalanced(int[] v) {
        root = buildBalanced(v, 0, v.length - 1);
    }

    private Node buildBalanced(int[] v, int l, int r) {
        if (l > r) return null;

        int m = (l + r) / 2;
        Node node = new Node(v[m]);

        node.left = buildBalanced(v, l, m - 1);
        node.right = buildBalanced(v, m + 1, r);

        return node;
    }


    public int[] toArray() {
        ArrayList<Integer> list = new ArrayList<>();
        toList(root, list);

        int[] v = new int[list.size()];
        for (int i = 0; i < v.length; i++) v[i] = list.get(i);
        return v;
    }

    private void toList(Node r, ArrayList<Integer> list) {
        if (r != null) {
            toList(r.left, list);
            list.add(r.value);
            toList(r.right, list);
        }
    }
}
