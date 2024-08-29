//********************************************************************
//  Book1.java       Authors: Micah Morgan
//
//  Library Superclass
//********************************************************************
package hw9;

public abstract class Book1
{
	protected String title;
	protected int pub_date;
	protected String author;
	protected int edition;
	public static int nrBooks = 0;
    //-----------------------------------------------------------------
    //  Constructor--initializes instance variables
    //-----------------------------------------------------------------
   public Book1 (String title, int pub_date, String author, int edition)
	{
		this.title = title;
		this.pub_date = pub_date;
		this.author = author;
		this.edition = 1;
		nrBooks++;
	}

    //-----------------------------------------------------------------
    //  Getter for edition
    //-----------------------------------------------------------------
    public abstract int getEdition();
	
	//-----------------------------------------------------------------
    //  Setter for Edition
    //-----------------------------------------------------------------
    public abstract void setEdition(int edition);
    
    //-----------------------------------------------------------------
    // to String method
    //-----------------------------------------------------------------
	public abstract String toString();
	
    //-----------------------------------------------------------------
    //  Count number of cars we have method
    //-----------------------------------------------------------------
	public static int nrBooks ()
	{
		return nrBooks;
	}
}