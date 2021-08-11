import java.util.ArrayList;
import java.util.Date;

public class C206_CaseStudy {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> PackageList = new ArrayList<Package>();

	}
	
	//================================ Add Package ==================================================
	public static Package inputPackage() {
		String Code = Helper.readString("Enter package code :");
		String description = Helper.readString("Enter description :");
		Date startDate = Helper.readDate("Enter Start Date :");
		Date endDate = Helper.readDate("Enter End Date :");
		int amount = Helper.readInt("Enter package amount :");
		
		Package X = new Package(Code, description,  startDate, endDate, amount);
		return X;
	}
	public static void addPackage(ArrayList<Package> PackageList, Package X) {
		
		PackageList.add(X);
		
	}
	
}
