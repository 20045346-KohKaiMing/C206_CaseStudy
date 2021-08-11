
public class Appointment {
	private String date;
	private String time;
	private String designerName;
	private String address;

	// Parameterised Constructor

	public Appointment(String custName, String date, String time, String designerName, String address) {
		this.date = date;
		this.time = time;
		this.designerName = designerName;
		this.address = address;
	}

	// Setter Methods

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getter methods

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getDesignerName() {
		return designerName;
	}

	public String getAddress() {
		return address;
	}

	public String getCustName() {
		return custName;
	}

}
