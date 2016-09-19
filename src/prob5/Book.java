package prob5;

public class Book {
	private int bookNo;
	String title;
	String author;
	int stateCode;
	
	public int getBookNo() {
		return bookNo;
	}
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	public void rent() {
		System.out.println(title + "이(가) 대여 됐습니다.");
		stateCode = 0;
	}
	
//	print() : void


}
