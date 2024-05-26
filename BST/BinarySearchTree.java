package BST;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    static Node buildTree(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=buildTree(root.left, key);
        }
        else{
            root.right=buildTree(root.right, key);
        }
        return root;
    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    static Node delete(Node root,int key){
        if(key<root.data){
            root.left=delete(root.left, key);
        }
        else if(key>root.data){
            root.right=delete(root.right, key);
        }
        else{
            //case 1 
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            Node isSuccessorInorder=searchInorderSuccesor(root.right);
            System.out.println("succesor = "+isSuccessorInorder.data);
            root.data=isSuccessorInorder.data;
            root.right=delete(root.right,isSuccessorInorder.data);
        }
        return root;
    }
    static Node searchInorderSuccesor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i:values){
            root = buildTree(root, i);
        }
        inOrder(root);
        System.out.println();
        delete(root, 8);
        inOrder(root);
    }
}
