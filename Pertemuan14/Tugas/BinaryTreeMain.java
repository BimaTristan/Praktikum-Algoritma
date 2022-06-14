package Tugas;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Nilai Minimal");
        bt.minimal();
        System.out.println("");
        System.out.println("Nilai Maximal");
        bt.maksimal();
        System.out.println("");
        System.out.println("Print Leaf");
        bt.printLeaf(bt.root);
        System.out.println("");
        System.out.println("");
        System.out.println("Jumlah leaf");
        System.out.println(" " + bt.jumlahLeaf());
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
