//********************************************************************
//  ConwayLibrary.java       Authors: Micah Morgan
//
//  Driver class
//********************************************************************
package hw9;

public class ConwayLibrary
{

	public static void main (String[] args) 
	{
		Book1 book1 = new Fantasy("Harry Potter and the Sorcerer's Stone", 1997, "J. K. Rowling", 1, "Wand");
		Book1 book2 = new ScienceFiction("Farenheit 451", 1953, "Ray Bradbury", 1, "Technology gone wrong");
		Book1 book3 = new NonFiction("Innocents Abroad", 1869, "Mark Twain",1, "Travel", false);
        Book1 book4 = new Fiction("Da Vinci Code", 2003, "Dan Brown",2, "Historical fiction");
        Book1 book5 = new Narrative("Diary of a Young Girl", 1947, "Anne Frank",1, "Story", false, "Isolation");
        Book1 book6 = new NonFiction("How to Win Friends and Influence People", 1936, "Dale Carnegie",1, "Influence", true);
        Book1 book7 = new Fantasy("Fellowship of the Ring", 1954, "J. R. R. Tolkien",1, "Ring");
		
        book4.setEdition(2);
        ((NonFiction) book5).setType("Autobiography");
        ((Fiction) book7).setGenre("Adventure");
        
		System.out.println(book1);
		System.out.println("\n" + book2);
		System.out.println("\n" + book3);
		System.out.println("\n" + book4);
		System.out.println("\n" + book5);
		System.out.println("\n" + book6);
		System.out.println("\n" + book7);
		
		System.out.println("\n There are: " + Book1.nrBooks() + " books in our library. That isn't many...");
	}
}