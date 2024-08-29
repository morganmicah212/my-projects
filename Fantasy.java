//********************************************************************
//  Fantasy.java       Authors: Micah Morgan
//
//  Fantasy class for fiction
//********************************************************************
package hw9;

public class Fantasy extends Fiction
{
	private String magicalElement;
  
    //------------------------------------------------------------------------------
    //  Constructor--initializes the instance variables
    //-----------------------------------------------------------------------------
	public Fantasy(String title, int pub_date, String author, int edition, String magicalElement)
	{
		super (title, pub_date, author, edition, "Fantasy");
		this.magicalElement = magicalElement;
	}
	
	//-----------------------------------------------------------------
    //  Getter for magicalElement
    //-----------------------------------------------------------------
	public String getMagicalElement ()
	{
		return magicalElement;
	}
	
	//-----------------------------------------------------------------
    //  Setter for magicalElement
    //-----------------------------------------------------------------
	public void setMagicalElement (String newElement)
	{
		magicalElement = newElement;
	}
	
	//-----------------------------------------------------------------
    // Prints out a string description
    //-----------------------------------------------------------------
	@Override
	public String toString()
	{
		return super.toString() + " The book's magical element is: " + magicalElement + ".";
	}

}