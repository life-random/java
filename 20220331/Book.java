
public class Book {
	String title, author;
	
	public Book(String title) {
		title = title;
		author = "�۰��̻�";
	}
	
	public Book(String title, String author) {
		this.author = "author";
		this.title = title;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�߶��㺣��");
		Book loveStory = new Book("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
