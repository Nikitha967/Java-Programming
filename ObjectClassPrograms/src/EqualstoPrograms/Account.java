package EqualstoPrograms;

public class Account {
	public String accholdername;
	public int accno;
	public long ifsccode;
	public int accbalance;
	

public Account (String accholdername,int accno,long ifsccode,int accbalance ) 
{
	
	this.ifsccode=ifsccode;
	this.accno=accno;
	this.accholdername=accholdername;
	this.accbalance=accbalance;
	
}
@Override
public String toString() {
	return "accno: "+accno+"accbalance :"+accbalance;
}
public void accountDetails() {
	System.out.println("accholdername: "+accholdername);
	System.out.println("accno: "+accno);
	System.out.println("accbalance: "+accbalance);
	System.out.println("ifsccode: "+ifsccode);

}
}
