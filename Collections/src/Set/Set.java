package Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		
		set.add("fdd");
		set.add("gdgd");
		set.add("dfsd");
		set.add("fdd");
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
