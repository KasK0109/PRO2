package binartreestuderende;

public class MainApp {
    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree15 = new BinaryTree<>(15);
        BinaryTree<Integer> binaryTree25 = new BinaryTree<>(25);
        BinaryTree<Integer> binaryTree11 = new BinaryTree<>(11, null,binaryTree15);
        BinaryTree<Integer> binaryTree30 = new BinaryTree<>(30,binaryTree25, null);
        BinaryTree<Integer> binaryTree22 = new BinaryTree<>(22, binaryTree11, binaryTree30);


        BinaryTree<Integer> binaryTree88 = new BinaryTree<>(88);
        BinaryTree<Integer> binaryTree90 = new BinaryTree<>(90, binaryTree88, null);
        BinaryTree<Integer> binaryTree77 = new BinaryTree<>(77, null, binaryTree90);

        BinaryTree<Integer> binaryTree45 = new BinaryTree<>(45, binaryTree22, binaryTree77);

//        System.out.println("Size of the tree: " + binaryTree45.size());
//        System.out.println("Height of the tree: " + binaryTree45.height());
//
//        System.out.print("Pre order: ");
//        binaryTree45.preOrder();
//        System.out.println();
//        System.out.print("In order: ");
//        binaryTree45.inOrder();
//        System.out.println();
//        System.out.print("Post order: ");
//        binaryTree45.postOrder();
//        System.out.println();
        System.out.print("Sum of the nodes in the tree: ");
        System.out.println(binaryTree45.sum());
    }
}
