
public class BinaryTree{
	private Node root;
	private static class Node{
		Node left;
		Node right;
		int data;

		Node(int newData){
			left=null;
			right=null;
			data=newData;
		}

	}	
	public void BinaryTree(){
		root=null;
	}
	public boolean lookup(int data){
		return(lookup(root,data));
	}
	private boolean lookup(Node node, int data) { 
		if (node==null) { 
			return(false); 
		}
		if(data ==node.data){
			return true;
		}
		else if (data<node.data){
			return(lookup(node.left,data));
		}
		else{
			return(lookup(node.right,data));
		}
	}
	public void insert(int data){
		root=insert(root,data);
	}
	private Node insert(Node node,int data){
		if(node ==null){
			node=new Node(data);
		}
		else{
			if(data<=node.data){
				node.left=insert(node.left,data);
			}
			else{
				node.right=insert(node.right,data);
			}
		}return(node);
	}
	public int maxDepth() {
		return(maxDepth(root));
	}

	private int maxDepth(Node node) {
		if (node==null) {
			return(0);
		}
		else {
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			// use the larger + 1
			return(Math.max(lDepth, rDepth) + 1);
		}
	} 
	public void build123(){

		root=new Node(2);
		Node lchild=new Node(1);
		Node rchild=new Node(3);
		root.right=rchild;
		root.left=lchild;
	}
	
	public void build123a(){
		root=null;
		root=new Node(2);
		root.left=new Node(1);
		root.right=new Node(3);
	}

	/*
	Inorder : left,root.data,left
	Postorder: left,right, root.data
	Preorder: root.data, left,right
	 */
	public void inorder(){
		printtree(root);

	}
	public void postordertree(){
		postorder(root);

	}
	public void preordertree(){
		preorder(root);

	}
	public boolean hassum(int sum){
		return hassubsum(root,sum);
	}
	private static boolean hassubsum(Node node,int sum)
	{
		if( node == null){
			return (sum == 0);
		}
		else{
			int subsum=sum-node.data;
			return (hassubsum(node.left,subsum)|| hassubsum(node.right,subsum));
		}
	}
	private static void printtree(Node node){
		if(node == null) return;
		printtree(node.left);
		System.out.println(node.data);
		printtree(node.right);
	}
	private static void preorder(Node node){
		if(node == null) return;
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}
	private static void postorder(Node node){
		if(node == null) return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}
	
}
