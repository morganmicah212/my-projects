//********************************************************************
//  Science Fiction.java       Authors: Micah Morgan
//
//  Sci-Fi class for fiction
//********************************************************************
package hw9;

public class ScienceFiction extends Fiction
{
	private String newReality;
  
    //------------------------------------------------------------------------------
    //  Constructor--initializes the instance variables
    //-----------------------------------------------------------------------------
	public ScienceFiction(String title, int pub_date, String author, int edition, String newReality)
	{
		super (title, pub_date, author, edition, "Science Fiction");
		this.newReality = newReality;
	}
	
	//-----------------------------------------------------------------
    //  Getter for newReality
    //-----------------------------------------------------------------
	public String getNewReality ()
	{
		return newReality;
	}
	
	//-----------------------------------------------------------------
    //  Setter for newReality
    //-----------------------------------------------------------------
	public void setNewReality (String newReality2)
	{
		newReality = newReality2;
	}
	
	//-----------------------------------------------------------------
    // Prints out a string description
    //-----------------------------------------------------------------
	@Override
	public String toString()
	{
		return super.toString() + " The book's new reality is: " + newReality + ".";
	}

}