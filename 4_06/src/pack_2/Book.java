package pack_2;

public class Book {
	String title;
	String author;
	void show() {System.out.println(title+" "+author);}
	
	public Book() {
		this("","");// book 생성자 중에 인자 가 2개짜리인거 호출
		System.out.println("생성자 호출됨");
	}
	public Book(String title) {
		this(title,"작가미상");
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public static void main(String[] args) {
		Book littlePrince=new Book("어린왕자","생텍쥐베리");
		Book loveStory=new Book("춘향전");
		Book emptyBook=new Book();
		loveStory.show();
	}

}
