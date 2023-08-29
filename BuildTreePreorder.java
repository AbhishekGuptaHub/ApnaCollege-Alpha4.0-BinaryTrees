import java.util.Scanner;

public class BuildTreePreorder
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

    static class BinaryTree
    {
        static int index = -1;

        public static Node buildTree(int [] arr)
        {
            index++;

            if (arr[index] == -1)
            {
                return null;
            }

            Node newNode = new Node(arr[index]);

            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in preorder sequence array of a binary tree: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter preorder sequence array of the binary tree below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);

        System.out.println("Binary tree has successfully build with root node data " + root.data + ".");
    }
}
