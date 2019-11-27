package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import List.Employee;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name;
		int age;
		int n=s.nextInt();
		Map<Integer,Employee>map=new HashMap<Integer,Employee>();
		Employee[] emp=new Employee[n];
		for(int i=0;i<n;i++) {
			name=s.next();
			age=s.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i, emp[i]);
		}
		for(Map.Entry<Integer,Employee>em:map.entrySet())
		{
			int key=em.getKey();
			Employee e=em.getValue();
			System.out.println(key+e.getName()+e.getAge());
		}
		s.close();
			
			
			
		
		

	}

}
