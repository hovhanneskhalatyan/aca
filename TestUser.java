package lesson6;

public class TestUser {
	public static void main(String[] args) {
		
		User user1 = new User("Narek", 26, true, 'N', "Yerevan" );
		User user2 = new User("Gago", 10, false, 'G', "Abovyan");
		User user3 = new User("Narek", 26, true, 'N', "Yerevan" );
		User user4 = user1;
		
		System.out.println("-- user1 vs user2 --");
		if (user1.equals(user2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are NOT equal");
		}
		System.out.println(user1.hashCode() + " __ " + user2.hashCode());
		
		System.out.println("\n" + "-- user1 vs user3 --");
		if (user1.equals(user3)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are NOT equal");
		}
		System.out.println(user1.hashCode() + " __ " + user3.hashCode());
		
		System.out.println("\n" + "-- user1 vs user4 --");
		if (user1.equals(user4)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are NOT equal");
		}
		System.out.println(user1.hashCode() + " __ " + user4.hashCode());
		
		System.out.println("\n" + "-- user3 vs user4 --");
		if (user3.equals(user4)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are NOT equal");
		}
		System.out.println(user3.hashCode() + " __ " + user4.hashCode());
	}

}
