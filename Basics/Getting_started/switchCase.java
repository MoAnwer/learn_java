public class switchCase {

public static void main(String[] a) {
	enum Option {
		BLUE_PILL,
		RED_PILL
	}
	takeOne(Option);
}
	public void takeOne(Option option) {
		switch(option) {
			case BLUE_PILL:
				System.out.println("Story ends, wake up, believe whatever you want.");
				break;
			case RED_PILL:
				System.out.println("I show you how deep the rabbit hole goes.");
				break;
		}
	}
}
