import java.time.LocalDate;

public class QuotationRequest {

	private String propertyType;
	private double areaSize;
	private String requestName;
	private int contactNumber;
	private String email;
	private double budget;
	private LocalDate completionDate;
	private String renoType;
	private int noRenoRoom;
	private int noRenoToilet;
	private String renoStyle;

	public QuotationRequest(String propertyType, double areaSize, String requestName, int contactNumber, String email,
			double budget, LocalDate completionDate, String renoType, int noRenoRoom, int noRenoToilet,
			String renoStyle) {
		this.propertyType = propertyType;
		this.areaSize = areaSize;
		this.requestName = requestName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.budget = budget;
		this.completionDate = completionDate;
		this.renoType = renoType;
		this.noRenoRoom = noRenoRoom;
		this.noRenoToilet = noRenoToilet;
		this.renoStyle = renoStyle;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public double getAreaSize() {
		return areaSize;
	}

	public void setAreaSize(double areaSize) {
		this.areaSize = areaSize;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}

	public String getRenoType() {
		return renoType;
	}

	public void setRenoType(String renoType) {
		this.renoType = renoType;
	}

	public int getNoRenoRoom() {
		return noRenoRoom;
	}

	public void setNoRenoRoom(int noRenoRoom) {
		this.noRenoRoom = noRenoRoom;
	}

	public int getNoRenoToilet() {
		return noRenoToilet;
	}

	public void setNoRenoToilet(int noRenoToilet) {
		this.noRenoToilet = noRenoToilet;
	}

	public String getRenoStyle() {
		return renoStyle;
	}

	public void setRenoStyle(String renoStyle) {
		this.renoStyle = renoStyle;
	}

}
