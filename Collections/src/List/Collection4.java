package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		//Student[] stud=new Student[n];
		int i;
		for(i=0;i<n;i++) {
			System.out.println("Enter the name ");
			String name=s.next();
			System.out.println("age");
			int age=s.nextInt();
		
			list.add(name);
			list.add(age);
		}
			
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
		
		

	}

}
