
public class bstprobs extends BinaryTree  {
	
		
public static void main(String args[]){
	BinaryTree bt=new BinaryTree();
	bt.insert(4);
	bt.insert(3);
	bt.insert(2);
	bt.hassum(7);
	System.out.println(bt.lookup(4));
	BinaryTree bt1=new BinaryTree(); 
	bt1.build123();
	System.out.println("\nPreorder Traversal\n");
	bt.preordertree();
	System.out.println("\nPostOrder Traversal\n");
	bt.postordertree();
	System.out.println("\nInOrder Traversal\n");
	bt.inorder();
}
}
