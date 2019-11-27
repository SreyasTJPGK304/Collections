
package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age;
		String name;
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		Employee[] emp=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			name=s.next();
			System.out.println("Enter the age");
			age=s.nextInt();
			System.out.println("Enter department");
			String dep=s.next();
			emp[i]=new Employee();
			emp[i].setName(name);
			emp[i].setAge(age);
			emp[i].setDepartment(dep);
			
			list.add(emp[i]);
			//list.add(age);
			//list.add(dep);
		}
		
		//ArrayList list1=(ArrayList)list.clone();
		//System.out.println("Clone value"+list1.get(0));
		//System.out.println(list.get(0));
		//list.remove(0);
	    //System.out.println(list.get(0));
	    //System.out.println("Enter string");
		//String a=s.next();
		//list.set(0, a);
		//list.clear();
		//list.removeAll(list);
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()) 
		{
			//System.out.println(itr.next());
			Employee e=itr.next();
			System.out.println(e.getName()+" "+e.getAge()+" "+e.getDepartment());
			
		}
		

	}

	

}
