package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		ArrayList list=new ArrayList();
		System.out.println("Enter String 1");
		String str1=s.next();
		System.out.println("Enter String 2");
		String str2=s.next();
		System.out.println("Enter String 3");
		String str3=s.next();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		ArrayList list1=new ArrayList();
		System.out.println("Enter String 4");
		String str4=s.next();
		System.out.println("Enter String 5");
		String str5=s.next();
		list1.add(str4);
		list1.add(str5);
		list.addAll(list1);
		list.clear();
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
