

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;
		
		while (option != 6) {
			C206_CaseStudy.menu();
			
			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				
			}
			else if(option == 2){
				
			}else if(option == 3) {
				
			}else if(option == 4) {
				
			}else if(option == 5) {
				
			}else if(option == 6){
				System.out.println("Bye!");
			}else {
				System.out.println("Invalid Option");
			}
			
		}
	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("RENOVATION ACE APP");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Package");
		System.out.println("3. Manage Request for Quotation ");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage Appointment");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}


}
