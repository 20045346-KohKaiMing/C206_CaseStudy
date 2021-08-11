import java.util.ArrayList;

import java.util.Date;


public class C206_CaseStudy {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Package> PackageList = new ArrayList<Package>();


		ArrayList<RequestQuotation> rqList = new ArrayList<RequestQuotation>();

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
	
	//=================================View All Packages ============================================
	
	public static String retrivePackages(ArrayList<Package> PackageList) {
		
		
		String output =  "";
		for (int i = 0; i < PackageList.size(); i++) {
			 output += String.format("%-10s %-10s %-10s %-10s %-10d \n", PackageList.get(i).getCode()
					,PackageList.get(i).getDescription(), PackageList.get(i).getStartDate().toString(),
					PackageList.get(i).getEndDate().toString(),PackageList.get(i).getAmount());
			
		}
		return output;
		
	}
	public static void viewPackages(ArrayList<Package> PackageList) {
		
		String output =  "";
		output += ("==PackageList==\n");
		output += String.format("%-10s %-10s %-10s $-10s $-10s \n", "Code", "Description","Start date","End Date","Amount");
		output += retrivePackages(PackageList);	
		System.out.println(output);
	}
	
	//===============================Delete a Package====================================
	
	public static boolean doDeletePackage(ArrayList<Package> PackageList,String code) {
		boolean isdeleted = false;

		for (int i = 0; i < PackageList.size(); i++) {
			
			String assetTag = PackageList.get(i).getCode();
			
			if (code.equalsIgnoreCase(code)	) {
				
				
				PackageList.set(i, null);
				
				
				isdeleted = true;
				
			}
		}
		return isdeleted;
	}
	
	
	public static void deletePackage(ArrayList<Package> PackageList) {
		C206_CaseStudy.viewPackages(PackageList);
		String code = Helper.readString("Enter Package code > ");
		
		Boolean isLoaned =doDeletePackage(PackageList,code);
		
		if (isLoaned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Camcorder " + code + " loaned out");
		}
	}
	
}
