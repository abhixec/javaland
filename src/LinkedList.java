import java.util.Stack;


public class LinkedList {

	Node head;
	public class Node{
	int data;
	Node next;
	public Node(int newData){
		next=null;
		data=newData;
	}
	}
	public LinkedList(){
		head=null;
	}
	public void insert(int data){
		head=insert(head,data);
	}
	private Node insert(Node node,int data){
		if (node == null){
			node=new Node(data);
		}
		else{
			node.next=insert(node.next,data);
		}
		return(node);		
	}
	public void print(){
		printRecur(head);
	}
	private void printRecur(Node node){
		if(node == null){
			return;
		}
		else{
			System.out.println(node.data);
			printRecur(node.next);
		}
	}
	
	public void reverseIter(){
		reverseIter2(head);
		//reverseIter1(head);
	}
	private void reverseIter1(Node node){
		Stack<Integer> s = new Stack<Integer>();
		Node temp=null;
		while(node!=null){
			s.push(node.data);
			node=node.next;
		}
		System.out.println(s);
		temp=new Node(s.pop());
		head=temp;
		while(!s.isEmpty()){	
			temp=new Node(s.pop());
			
			System.out.println("temp " + temp.data);
			temp=temp.next;
		}
		
	}
	

	private void reverseIter2(Node node){
		Node next=null,prev=null;
		if (node == null)return;
		while(true){
			next=node.next;
			node.next=prev;
			prev=node;
			if(next==null)return;
			node=next;
				
		}		
	}
	public void remove(int data){
		remove(head,data);
	}
	private void remove(Node node,int data){
		Node temp;
/*		while(node!=null){
			if(node.next.data==data){
				temp=node.next;
				node.next.next=temp.next;
				temp=null;
			}
		}
*/	
		if(node.data == data){
			
		}
	}
}

