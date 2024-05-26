package BST;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    static Node buildTree(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
         root.left=buildTree(root.left, data);
        }
        else{
            root.right=buildTree(root.right, data);
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
    static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(key<root.data){
            return search(root.left, key);

        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int key){
        if(key<root.data){
            root.left=delete(root.left, key);
        }
        else if(key>root.data){
            root.right=delete(root.right, key);
        }
        else{
            //case1
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
            //case 3
            Node inorderSuNode=inOrderSuccessor(root.right);
            root.data=inorderSuNode.data;
            root.right=delete(root.right, inorderSuNode.data);
        }
        return root;
    }
    static Node inOrderSuccessor(Node root){
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }
   public static void main(String[] args) {
    int values[] = {8,5,3,1,4,6,10,11,14};
    Node root=null;
    for(int i:values){
        root=buildTree(root, i);
    }
    //inOrder(root);
    System.out.println();
    // if(search(root,11)){
    //     System.out.println("Found");
    // }
    
    delete(root, 8);
    inOrder(root);
    System.out.println();
   }
   
}
