package tree;

public class BinaryTreeDemo {

    public static void main(String args[]){

        BinaryTree bt = new BinaryTree();

        bt.add(50);
        bt.add(100);
        bt.add(20);
        bt.add(80);
        bt.add(30);
        bt.add(70);
        bt.add(10);

        bt.inorder();
        bt.postorder();
        bt.height();

        bt.levelOrder();

        bt.inorderwithoutrecusion();
    }
}
