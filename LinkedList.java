import java.util.Scanner;

class LinkedList{

	Node head;
	public static class Node{
	
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void display(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void insertFirst(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	
	}
	
	public static int enter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		return n;
	    	
	}
	
	public void insertLast(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;
			return;
		}
		Node n = head;
		new_node.next = null;
		while(n.next!=null){
			n = n.next;
		}
		n.next = new_node;
		return;
			
		
	}
	
	public void insertBetween(Node prev,int new_data){
		if(prev == null)
		{
			System.out.println("Insertion not possible..");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;
		
	}
	
	public void deleteFirst(){
		Node n = head;
		if(head == null){
			return;
		}
		head = head.next;
		
	}
	
	public void deleteLast(){
		Node n = head;
		Node prev = head;
		
		if(head == null){
			return;
		}
		while(n.next!=null){
			prev = n;
			n = n.next;
		}
		prev.next = null;
		
	}
	
	public void deleteBetween(Node key){
		if(head == null){
			return;
		}
		Node n = head;
		Node prev = head;
		while(n.next!=key){
			prev = n;
			n = n.next;
		}
		prev.next = null;
		
		
	}
	
	public static void main(String args[]){
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter any number : ");
		// int n = sc.nextInt();		
		LinkedList ll = new LinkedList();
		int value = ll.enter();
		ll.insertFirst(value);
		System.out.println(".........................");
		int v = ll.enter();
		ll.insertLast(v);
		System.out.println(".........................");
		ll.display();
		System.out.println(".........................");
		int q = ll.enter();
		ll.insertBetween(ll.head,q);
		ll.display();
		System.out.println(".........................");
		// ll.deleteFirst();
		// ll.display();
		//System.out.println(".........................");
		// ll.deleteLast();
		// ll.display();
		ll.deleteBetween(ll.head.next);
		ll.display();
	}
}