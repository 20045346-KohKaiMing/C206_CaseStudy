import java.util.Date;

public class Package {

    private String Code;
    private String description;
    private Date startDate;
    private Date endDate;
    private int Amount;
    
    
	public Package(String code, String description, Date startDate, Date endDate, int amount) {
		Code = code;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		Amount = amount;
	}
	
	
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}

}
