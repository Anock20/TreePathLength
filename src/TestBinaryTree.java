
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree treeB = new BinaryTree("B");
        BinaryTree treeD = new BinaryTree("D");
        BinaryTree treeE = new BinaryTree("E");
        BinaryTree treeC = new BinaryTree("C", treeD, treeE);
        BinaryTree treeA = new BinaryTree("A", treeB, treeC);
        BinaryTree treeX = new BinaryTree("X");
        BinaryTree treeY = new BinaryTree("Y", treeX, treeA);


        System.out.println("treeA.pathLength():" + treeA.pathLength());
        System.out.println("treeC.pathLength():" + treeC.pathLength());
        System.out.println("treeE.pathLength():" + treeE.pathLength());
        System.out.println("treeY.pathLength():" + treeY.pathLength());
    }
}