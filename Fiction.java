//********************************************************************
//  Fiction.java       Authors: Micah Morgan
//
//  Fiction book class
//********************************************************************
package hw9;

public class Fiction extends Book1
{
	private String genre;
	
    //---------------------------------------------------------------------------------
    //  CTOR: uses the parent class (Book1) to instantiate variables
    //---------------------------------------------------------------------------------
    public Fiction (String title, int pub_date, String author, int edition, String genre)
	{
		super (title, pub_date, author, edition);
		this.genre = genre;
	}
	    
	//-----------------------------------------------------------------
    //  Getter for edition
    //-----------------------------------------------------------------
	public int getEdition ()
	{
		return edition;
	}
	
	//-----------------------------------------------------------------
    //  Setter for Edition
    //-----------------------------------------------------------------
	public void setEdition (int newEdition)
	{
		edition = newEdition;
	}
	
	//-----------------------------------------------------------------
    //  Getter for genre
    //-----------------------------------------------------------------
	public String getGenre ()
	{
		return genre;
	}
	
	//-----------------------------------------------------------------
    //  Setter for type
    //-----------------------------------------------------------------
	public void setGenre (String newGenre)
	{
		genre = newGenre;
	}
   
    //-----------------------------------------------------------------
    // Prints out a string description
    //-----------------------------------------------------------------
	@Override
	public String toString()
	{
		return " Title: \"" + title + "\" Year: " + pub_date + " Author: " + author +  "\n Edition: " + edition + " This fiction book's genre is: " + genre + ".";
	}
}