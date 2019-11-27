package List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//import casestudy1.Bookng;
public class Collecase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		//Booking[] book=new Booking[50];
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int total,b=0,c,d,e,f,i=1;
		String pr="";
		while(true) {
		
		set.add("Menu");
		set.add("1.Book\n2.Check Status\n3.Exit");
		set.add("Enter your choice");
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		int n=s.nextInt();
		
		switch(n) {
		case 1:
		
			set.add("Booking:");
			set.add("Please choose the services required.");
			set.add("AC/non-AC(AC/nAC)");
			Iterator itr1=set.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			ac = s.next();
			if(ac.equals("AC")==true)
			{
			b=1000;
			}
			else
			{
			b=750;
			}
			
			System.out.println("single cot or double cot");
			cot = s.next();
			if(cot.equals("single")==true)
			{
			c=0;
			}
			else
			{
			c=350;
			}
			System.out.println("with cable connection/without cable connection(C/nC)");
			cable = s.next();
			if(cable.equals("C")==true)
			{
			d=50;
			}
			else
			{
			d=0;
			}
			System.out.println("wifi needed or not(W/nW)");
			wifi = s.next();
			if(wifi.equals("W")==true)
			{
			e=200;
			}
			else
			{
			e=0;
			}
			System.out.println("laundry servise needed or not(L/nL)");
			laundry = s.next();
			if(laundry.equals("L")==true)
			{
			f=100;
			}
			else
			{
			f=0;
			}
			total= b+c+d+e+f;
			System.out.println("The total charge is Rs:"+total);
			System.out.println("The services chosen are");
			if(b==1000)
			{
			System.out.println("AC");
			}
			else
			{
			System.out.println("non-AC");
			}
			if(c==0)
			{
			System.out.println("single cot");
			}
			else
			{
			System.out.println("double cot");
			}
			if(d!=0)
			{
			System.out.println("cable connection enabled");
			}
			else
			{
			System.out.println("cable connection not enabled");
			}
			if(e!=0)
			{
			System.out.println("wifi enabled");
			}
			else
			{
			System.out.println("wifi not enabled");
			}
			if(f!=0)
			{
			System.out.println("with laundry services");
			}
			else
			{
			System.out.println("without laundry services");
			}
			System.out.println("Do you want to proceed");
			pr = s.next();
		
		
		
			if(pr.equals("yes")==true)
			{
			//book[i]=1;
			System.out.println("Thank you for booking.Your room number is "+i);
			i=i+1;
			}
		
		
			break;
		case 2:
			System.out.println("Check Status");
			System.out.println("Enter room number");
			int r=s.nextInt();
			if(i==r) {
			System.out.printf("Room number %d is free\n",r);
			}
			else {
				System.out.printf("Room number %d is booked\n",r);
			}
			break;
		case 3:
			System.exit(0);
			
			
			
		}	
		}//while(pr.equals("no"));
		
				
				
		}
	}
			
		
		
	


	