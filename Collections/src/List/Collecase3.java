package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Collecase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,n;
		ArrayList list=new ArrayList();
		do {
		System.out.println("1)Display installed applications\n2)Install an application\n3)Uninstall an application\n4)Quit");
		n=s.nextInt();
		switch(n)
		{

		case 1:{

		Iterator itt=list.iterator();
		if(list.isEmpty()) {
		System.out.println("There is no application installed");
		}
		else
		{
		int j=0;
		while(itt.hasNext()) {
		System.out.println(j+ " "+itt.next());
		j++;
		}
		}
		}
		break;
		case 2:{
		System.out.println("Enter the application");
		String app=s.next();
		int flag=0;
		list.add(app);
		}break;
		case 3:
		{
		Iterator it=list.iterator();
		for(i=0;i<list.size();i++) {
		System.out.println(i+" "+it.next());
		}
		System.out.println("Enter the index of application to be removed");
		int index=s.nextInt();
		list.remove(index);}
		break;
		case 4:{
		System.exit(0);
		}
		break;
		}
		}
		while(true) ;

}
	}