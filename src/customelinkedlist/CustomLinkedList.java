package customelinkedlist;

import java.util.Scanner;


public class CustomLinkedList {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Node head=null;
		head=create(head);
		System.out.println("Display after creattion");
		display(head);
		
		head=addFirst(head);
		System.out.println("Display after adding at 1st Position");
		display(head);
		
		addLast(head);
		System.out.println("Display after adding at last Position");
		display(head);
		
		head=reverse(head);
		System.out.println("Display after Reversing");
		display(head);
	}

	private static void addLast(Node head) {
		Node temp=head;
		
		System.out.println("Please enter data for last Node");
		int data=sc.nextInt();
		Node nn=new Node(data);
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=nn;
	}

	private static Node addFirst(Node head) {
		System.out.println("Please enter data for 1st Node");
		int data=sc.nextInt();
		Node nn=new Node(data);
		nn.next=head;
		head=nn;
		return head;
	}

	public static Node create(Node head) {
		
		Node nn=null;
		Node temp=head;
		System.out.println("Enter length of the LL");
		int size=sc.nextInt(); //5
		
		for(int i=1;i<=size;i++)  //18,45,1,63,76
		{
			System.out.println("Please enter data for node : "+i);
			int data=sc.nextInt();
			nn=new Node(data); //1
			if(head==null)
			{
				head=nn;
				temp=nn;
			}
			else
			{
				temp.next=nn;
				temp=temp.next;
			}
		}
		return head;
	}

	static void display(Node temp)
	{
		while(temp!=null)
		{
			System.out.print(temp.data + "->"); //1->2->3->4->NULL
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	private static Node reverse(Node head) {
		Node current=head;
		Node left=null;
		Node right=null;
		
		while(current!=null)
		{
			right=current.next;
			current.next=left;
			left=current;
			current=right;
		}
		
		return left;
	}
}
