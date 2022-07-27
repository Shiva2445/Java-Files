
public class customer {
	public int custId;
	public String custName;
	public int creditlimit;
private static int count=101;
public customer() {
	
}
	public customer(String custName, int creditlimit) {
	this.custId=count++;
	this.custName=custName;
	this.creditlimit=creditlimit;
	}
	
	public void showDetails() {
		System.out.println("ID: "+custId+ " " +"Name: "+custName+ " "+"Limit: "+creditlimit);
	}}


