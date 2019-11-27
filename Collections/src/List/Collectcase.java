package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Collectcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name;
		String address;
		String contact;
		String email;
		String proofType;
		String proofId;
		String proc="";
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		Customer[] cust=new Customer[n];
		int i;
		int k=1;
		for(i=0;i<n;i++) {
			cust[i]=new Customer();
			System.out.println("Enter your name");
			name=s.next();
			System.out.println("Enter your address");
			address=s.next();
			System.out.println("Contact Number");
			contact=s.next();
			System.out.println("E-Mail ID");
			email=s.next();
			System.out.println("Enter proof type");
			 proofType=s.next();
			System.out.println("Enter proof id");
			proofId=s.next();
			System.out.println("Thank you for registering.Your id is"+k);
			k++;
			System.out.println("Do you want to update the email id?(yes/no)");
			proc=s.next();
			String m=proc.toLowerCase();
			
			if(m.equals("yes")) {
				System.out.println("Update Email:");
				System.out.println("Enter new Email id");
				String mail=s.next();
				System.out.println("Email updated");
				System.out.println();
				
				cust[i].setName(name);
				cust[i].setAddress(address);
				cust[i].setContact(contact);
				cust[i].setEmail(mail);
				cust[i].setProofType(proofType);
				cust[i].setProofId(proofId);
				
			}
			else {
				
			
			
			
			
			//cust[i]=new Customer();
			cust[i].setName(name);
			cust[i].setAddress(address);
			cust[i].setContact(contact);
			cust[i].setEmail(email);
			cust[i].setProofType(proofType);
			cust[i].setProofId(proofId);
			}
		list.add(cust[i]);
			
		}
		
		Iterator itr=list.iterator();
		int j=1;
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Customer c=(Customer) itr.next();
			System.out.println("Customer Details"+j);
			//System.out.println(c.getName()+" "+c.getAddress()+" "+c.getContact()+" "+c.getEmail()+" "+c.getProofType()+" "+c.getProofId());
			System.out.println("Name -> "+c.getName());
			System.out.println("Address -> "+c.getAddress());
			System.out.println("Contact Number -> "+c.getContact());
			System.out.println("Email ID -> "+c.getEmail());
			System.out.println("Proof Type -> "+c.getProofType());
			System.out.println("Proof Id -> "+c.getProofId());
			
			System.out.println("************************************");
			j++;
		}
		
		Iterator itr1=list.iterator();
		int d=0;
		while(itr1.hasNext()) {
			
			Customer c=(Customer) itr1.next();
			System.out.println(d+" "+c.getName());
		
			d++;
		}
		System.out.println("Do you want to delete(yes/no)");
		String pr=s.next();
		if(pr.equals("yes")) {
		System.out.println("Enter the index you want to delete");
		int index=s.nextInt();
		list.remove(index);
		Iterator itr3=list.iterator();
		while(itr3.hasNext()) {
			
			Customer c=(Customer) itr3.next();
			//System.out.println(c.getName()+" "+c.getAddress()+" "+c.getContact()+" "+c.getEmail()+" "+c.getProofType()+" "+c.getProofId());
			System.out.println("Name -> "+c.getName());
			System.out.println("Address -> "+c.getAddress());
			System.out.println("Contact Number -> "+c.getContact());
			System.out.println("Email ID -> "+c.getEmail());
			System.out.println("Proof Type -> "+c.getProofType());
			System.out.println("Proof Id -> "+c.getProofId());
			
		}
		
		}
		

	}

}
class Customer{
	String name;
	String address;
	String contact;
	String email;
	String proofType;
	String proofId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	
	
	
}
