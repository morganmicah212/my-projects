//********************************************************************
//  NonFiction.java       Authors: Micah Morgan
//
//  Abstract Sedan vehicle type
//********************************************************************
package hw9;

public class NonFiction extends Book1
{
	private String type;
	private boolean selfHelp;
	
    //---------------------------------------------------------------------------------
    //  CTOR: uses the parent class (Book1) to instantiate variables
    //---------------------------------------------------------------------------------
    public NonFiction (String title, int pub_date, String author, int edition, String type, boolean selfHelp)
	{
		super (title, pub_date, author, edition);
		this.type = type;
		this.selfHelp = selfHelp;
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
    //  Getter for type
    //-----------------------------------------------------------------
	public String getType ()
	{
		return type;
	}
	
	//-----------------------------------------------------------------
    //  Setter for type
    //-----------------------------------------------------------------
	public void setType (String newType)
	{
		type = newType;
	}
	
    //-----------------------------------------------------------------
    // Prints out a string description
    //-----------------------------------------------------------------
	@Override
	public String toString()
	{
		
		if (selfHelp) {
            return " Title: \"" + title + "\" Year: " + pub_date + " Author: " + author +  "\n Edition: " + edition + " This nonfiction book's type is: " + type + ". It is a self-help book.";
        } else {
            return " Title: \"" + title + "\" Year: " + pub_date + " Author: " + author +  "\n Edition: " + edition + " This nonfiction book's type is: " + type + ". It is not a self-help book.";
        }
		
	}
}