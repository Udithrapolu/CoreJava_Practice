package Enum;

public class Testing {

	public static void main(String[] args) {

		PaymentType pt =  PaymentType.CASH;
		System.out.println(pt);
//		pt.setFee(40);
		pt.sum();
//		pt.i=20;
		PaymentType[] pt1 =  PaymentType.values();
		for(int i =0;i<pt1.length;i++)
		{
			System.out.println(pt1[i]);
		}
		for (PaymentType paymentType : pt1) {
			System.out.println(paymentType +":"+paymentType.getFee() );
		}
	}

}
