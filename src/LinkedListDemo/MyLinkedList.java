package LinkedListDemo;

public class MyLinkedList {
		public static Node head;
		public static void main(String[] args) {
			MyLinkedList list=new MyLinkedList();
			list.head=new Node(1);
			list.head.next =new Node(2);
			list.head.next.next =new Node(3);
			list.head.next.next.next =new Node(4);
			System.out.println("Display After Creation :");
			list.display(head);
			head=list.reverse(head);
			System.out.println("Display After Reversal :");
			list.display(head);
		}
		

		void display(Node temp)
		{
			while(temp!=null)
			{
				System.out.print(temp.data + "->"); //1->2->3->4->NULL
				temp=temp.next;
			}
			System.out.println("NULL");
		}
		
		
		private Node reverse(Node head) {
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
