package week1.day1;

public class Mobile {

	String mobileModel = "Oneplus";
	int mobileWeight = 127;
	boolean isFullCharge = true;
	double mobileCost = 69.500;

	public void makeCall() {

		System.out.println("To my mom");

	}

	public void sendMsg() {

		System.out.println("To my dad");

	}

	public void mobileModel() {
		System.out.println("Oneplus");

	}

	public void mobileWeight() {
		System.out.println("127");

	}

	public void isFullCharge() {
		System.out.println("true");

	}

	public void mobileCost() {
		System.out.println("69.500");

	}

	public static void main(String[] args) {

		Mobile myMobile = new Mobile();

		myMobile.makeCall();
		myMobile.sendMsg();
		myMobile.mobileModel();
		myMobile.mobileWeight();
		myMobile.isFullCharge();
		myMobile.mobileCost();

	}
}
