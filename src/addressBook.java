import java.util.ArrayList;
public class addressBook {
	private ArrayList<buddyInfo> list;
	
	public addressBook() {
		this.list= new ArrayList<buddyInfo>();
	}
	public boolean addBuddy(buddyInfo data) {
		
		this.list.add(data);
		
		return true;
	}
	
	public boolean removeBuddy(buddyInfo data) {
		
		this.list.remove(data);
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello world ");
		buddyInfo friend2=new buddyInfo("Beshr");
		addressBook book1= new addressBook();
		book1.addBuddy(friend2);
		book1.removeBuddy(friend2);
	}
}
