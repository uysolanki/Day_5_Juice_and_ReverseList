import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTime {
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
	int seconds;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Mango Juices");
		int m=sc.nextInt();
		System.out.println("Enter number of Orange Juices");
		int o=sc.nextInt();
		System.out.println("Enter number of PineApple Juices");
		int p=sc.nextInt();
		pq.add(m);
		pq.add(o);
		pq.add(p);
	}

	public void calculate() {
		Iterator<Integer> list=pq.iterator();
		
		while(!pq.isEmpty())
		{
			
			int val1=0;
			int val2=0;
			
			if(list.hasNext())
				val1=pq.remove();
			
			if(list.hasNext())
				val2=pq.remove();
			
			if(val1>0  && val2>0)
			{
				seconds++;
				val1--;
				val2--;
			}
			
			if(val1>0 && val2==0)
			{
				seconds+=val1;
				break;
			}
			
			if(val1==0 && val2>0)
			{
				seconds+=val2;
				break;
			}
			
			if(val1>0)
				pq.add(val1);
			
			if(val2>0)
				pq.add(val2);
			
		}
		System.out.println("Minimum Time to prepare : " + seconds);
		
	}

}
