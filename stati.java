package firsttime;
class board{
	static String board;
	String examclass;
	String year;
	public void rohan(){
		System.out.println("The BOARD IS " + board);
		System.out.println("The NAME OF CLASS " + examclass);
		System.out.println("The YEAR IN WHICH EXAM APPEAR" + year);

	}
}

public class stati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board sorav=new board();
		board.board="PUNJAB-BOARD";//directly give value to static variable without object create
		sorav.examclass="5th";
		sorav.year="78";
		sorav.rohan();
		
		
	}

}
