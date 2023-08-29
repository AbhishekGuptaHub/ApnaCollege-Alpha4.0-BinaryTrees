import java.util.Queue;
import java.util.LinkedList;

public class LevelorderTraversal
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void levelorderTraversal(Node root)
    {
        if (root == null)
        {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty())
        {
            Node curr = queue.peek();
            queue.remove();

            if (curr.left != null)
            {
                queue.add(curr.left);
            }

            if (curr.right != null)
            {
                queue.add(curr.right);
            }

            System.out.print(curr.data + " ");
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("\nLevelorder Traversal of the binary tree is given below:");
        levelorderTraversal(root);

        System.out.print("\n");
    }
}
