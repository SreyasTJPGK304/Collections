package Set;

import java.util.*;
import java.util.Set;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.TreeSet;
public class Setcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,count=0;
		String symbol;
		
		Set<NewCard> s=new TreeSet<NewCard>(new Symbol1());
		NewCard[] nc=new NewCard[40];
		System.out.println("Enter limit");
		int n=sc.nextInt();
		
		while(s.size()<n) {
			symbol=sc.next();
			num=sc.nextInt();
			nc[count]=new NewCard();
			nc[count].setSymbol(symbol);
			nc[count].setNum(num);
			s.add(nc[count]);
			count++;
			
			
			
		}
		
			System.out.println(n+"symbols gathered in"+count+" cards.");
			System.out.println("Cards are ");
			Iterator itr=s.iterator();
			while(itr.hasNext()) {
				NewCard ca=(NewCard)itr.next();
				System.out.println(ca.getSymbol()+" "+ca.getNum());
				
			}
			
		}

	

}
class NewCard{
	String symbol;
	int num;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}

class Symbol1 implements Comparator<NewCard>{
	public int compare(NewCard c1, NewCard c2) {
		return c1.getSymbol().compareTo(c2.getSymbol());

	}
}
