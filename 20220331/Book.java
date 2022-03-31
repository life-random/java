
public class Book {
	String title, author;
	
	public Book(String title) {
		title = title;
		author = "¿€∞°πÃªÛ";
	}
	
	public Book(String title, String author) {
		this.author = "author";
		this.title = title;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("æÓ∏∞ø’¿⁄", "Ωﬂ∂º¡„∫£∏Æ");
		Book loveStory = new Book("√·«‚¿¸");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
