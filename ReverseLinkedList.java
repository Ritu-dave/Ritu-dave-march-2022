import java.util.Scanner;

class ReverseLinkedList{
	Node head;
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;
			return;
		}
		new_node.next = null;
		Node n = head;
		while(n.next!=null){
			n = n.next;
		}
		n.next = new_node;
		return;
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
		
	}
	
	Node reverse(Node curr,Node prev){
		if(curr.next == null){
			head = curr;
			curr.next = prev;
			return null;
		}
		Node next1 = curr.next;
		curr.next = prev;
		reverse(next1,curr);
		return head;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ReverseLinkedList RLL = new ReverseLinkedList();
		RLL.insert(3);
		RLL.insert(4);
		RLL.insert(2);
		RLL.insert(5);
		
		
		Node res = RLL.reverse(RLL.head,null);
		RLL.display();
	}
	
	
}