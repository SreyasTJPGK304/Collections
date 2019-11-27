package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		list.add("Welcome");
		list.add("to");
		list.add("Face");
		ArrayList list1=new ArrayList();
		list1.add("Java");
		list1.add("Program");
		list.addAll(list1);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
