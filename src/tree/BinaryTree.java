package tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private Node root;

    private Node insertNode(Node current, int data){
        if(current == null){
            current = new Node(data);
        }
        else{
            if(current.getData() > data)
                current.lchild = insertNode(current.getLchild(),data);
            else
                current.rchild = insertNode(current.getRchild(),data);
        }
        return current;
    }

    public void add(int data){
        root = insertNode(root,data);
    }

    private void inoderTravesal(Node current){

        if(current != null){
            inoderTravesal(current.getLchild());
            System.out.println(current.getData());
            inoderTravesal(current.getRchild());
        }

    }

    public void inorder(){
        inoderTravesal(root);
    }

    private void postorderTravesal(Node current){
        if(current != null){
            postorderTravesal(current.getLchild());
            postorderTravesal(current.getRchild());
            System.out.println(current.getData());
        }
    }
    public void postorder(){
        System.out.println("Post order travasal:");
        postorderTravesal(root);
    }

    private int heightofTree(Node root){
        if(root == null)
            return 0;

        return 1+Math.max(heightofTree(root.lchild),heightofTree(root.rchild));
    }

    public void height(){
        System.out.println("Height of the tree = "+heightofTree(root));
    }

    private void levelorderTravesal(Node root){
        Deque<Node> queue = new ArrayDeque <Node>();
        Stack<Node> stack = new Stack <Node>();
        Node current;

        queue.add(root);

        while(!queue.isEmpty()){
            current = queue.poll();
            stack.push(current);

            if(current.rchild != null)
                queue.add(current.getRchild());

            if (current.lchild != null)
                queue.add(current.getLchild());
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop().getData());
        }
    }

    public void levelOrder(){
        System.out.println("Level order travasal:");
        levelorderTravesal(root);
    }

    private void inorderwithoutRecursion(Node root){
        Stack<Node> stack = new Stack <Node>();
        Node current = root;

        while (current != null || !stack.isEmpty()){

            if(current != null){
                stack.push(current);
                current = current.getLchild();
            }
            else {
                current = stack.pop();
                System.out.println(current.getData());
                current = current.getRchild();
            }
        }
    }

    public void inorderwithoutrecusion(){
        System.out.println("Inorder travasal:");
        inorderwithoutRecursion(root);
    }

}
