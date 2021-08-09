package assignment13;

public class Customer  implements Comparable<Customer>{
	private int custId;
	private long custMobNo;
	private String custName;
	public Customer() {
	}
	public Customer(int custId, long custMobNo, String custName) {
		super();
		this.custId = custId;
		this.custMobNo = custMobNo;
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public long getCustMobNo() {
		return custMobNo;
	}
	public void setCustMobNo(long custMobNo) {
		this.custMobNo = custMobNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custMobNo=" + custMobNo + ", custName=" + custName + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		 
				if(this.getCustName().equals(o.getCustName()))
					{
						return o.getCustId()-this.getCustId();
					}
				else 
				{
				return this.getCustName().compareTo(o.getCustName());	
				}
				
	}
	

}


