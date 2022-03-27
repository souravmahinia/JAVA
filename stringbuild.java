package firsttime;

public class stringbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder("Apna College");
//		System.out.println(sb);
		//StringBuilder sb = new StringBuilder("Tony");
		//Get Char
		//System.out.println(sb.charAt(0));
		StringBuilder sb = new StringBuilder("Tony");
		//Set Char
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("tony");
		//Insert char
//		sb1.insert(0, 'S');
//		System.out.println(sb1);
//		//Delete
//		sb.delete(0, 1);
//		System.out.println(sb);
		//Append
		StringBuilder sb2= new StringBuilder("Tony");
		sb2.append(" Stark");//str=str+"e"; in string case
		System.out.println(sb2);
		//Reverse string
//		StringBuilder sb = new StringBuilder("HelloWorld");
//		for(int i=0; i<sb.length()/2; i++) {
//		int front = i;
//		int back = sb.length() - i - 1;
//		char frontChar = sb.charAt(front);
//		char backChar = sb.charAt(back);
//		sb.setCharAt(front, backChar);
//		sb.setCharAt(back, frontChar);
//		}
//		System.out.println(sb);

	}

}
