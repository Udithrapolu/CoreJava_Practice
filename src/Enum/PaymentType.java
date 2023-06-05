package Enum;

public enum PaymentType {
	
	DEBITCARD(5),CREDITCARD(10),CASH(3);

	int i;
	 PaymentType(int i) {

		this.i=i;
		System.out.println("hihih");
	}
	 
	 public void setFee(int i) {
		 this.i=i;
	 }
	public int getFee() {
		return i;
	}
	public void sum() {
		
		System.out.println(i*i);
		
	}
	

}
