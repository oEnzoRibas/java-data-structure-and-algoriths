package Course.Lists.L8.B;

public class TestDoublyList {

    private static <T> void runTest(String title, DoublyLinkedList<T> list, T... values) {

        System.out.println("\n==== " + title + " ====");

        System.out.println("List empty? " + list.isEmpty());

        System.out.println("\n-- insertStart --");
        list.insertStart(values[0]);
        list.show();

        System.out.println("\n-- insertEnd --");
        list.insertEnd(values[1]);
        list.insertEnd(values[2]);
        list.show();

        System.out.println("\n-- insertPosition(1) --");
        list.insertPosition(1, values[3]);
        list.show();

        System.out.println("\n-- removeStart --");
        System.out.println("Removed: " + list.removeStart());
        list.show();

        System.out.println("\n-- removeEnd --");
        System.out.println("Removed: " + list.removeEnd());
        list.show();

        list.insertEnd(values[4]);
        list.insertEnd(values[5]);
        list.show();

        System.out.println("\n-- removePosition(1) --");
        System.out.println("Removed: " + list.removePosition(1));
        list.show();

        System.out.println("\nFinal size: " + list.getSize());
        System.out.println("List empty? " + list.isEmpty());
        System.out.println("============================");
    }


    public static void main(String[] args) {

        runTest(
                "STRING TEST",
                new DoublyLinkedList<String>(),
                "A", "B", "C", "X", "Y", "Z"
        );

        runTest(
                "INTEGER TEST",
                new DoublyLinkedList<Integer>(),
                1, 2, 3, 99, 50, 100
        );

        runTest(
                "FLOAT TEST",
                new DoublyLinkedList<Float>(),
                1.1f, 2.2f, 3.3f, 9.9f, 5.5f, 7.7f
        );

        runTest(
                "CHARACTER TEST",
                new DoublyLinkedList<Character>(),
                'A', 'B', 'C', 'X', 'Y', 'Z'
        );
    }
}

