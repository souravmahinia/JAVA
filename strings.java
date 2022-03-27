package firsttime;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Tony";
		String secondName = "Stark";
		String fullName1 = firstName + secondName;
		String fullName2 = firstName + " " + secondName;
		
		System.out.println(fullName1.length());
		System.out.println(fullName2.length());//space take memory or count
//		for(int i=0; i<fullName2.length(); i++) {
//			System.out.println(fullName2.charAt(i));
//			}
		String name1 = "Tony";
		String name2 = "Tony";
		if(name1.equals(name2)) {
		System.out.println("They are the same string");
		} else {
		System.out.println("They are different strings");
		}
		//substring method
		String name = "TonyStark";
		System.out.println(name.substring(0, 4));//character from 0 to 3
		//parsint method to covert string into integer
//		String str = "1235";
//		int number = Integer.parseInt(str);
//		System.out.println(number);
		//ToString method to convert in string
		int number = 123;
		String str = Integer.toString(number);
		System.out.println(str.length());
		

	}

}
