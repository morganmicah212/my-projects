//********************************************************************
//  Narrative.java       Authors: Micah Morgan
//
//  Narrative class for NonFiction
//********************************************************************
package hw9;

public class Narrative extends NonFiction
{
	private String topic;
  
    //------------------------------------------------------------------------------
    //  Constructor--initializes the instance variables
    //-----------------------------------------------------------------------------
	public Narrative(String title, int pub_date, String author, int edition, String type, boolean selfHelp, String topic)
	{
		super (title, pub_date, author, edition, type, selfHelp);
		this.topic = topic;
	}
	
	//-----------------------------------------------------------------
    //  Getter for topic
    //-----------------------------------------------------------------
	public String getTopic()
	{
		return topic;
	}
	
	//-----------------------------------------------------------------
    //  Setter for topic
    //-----------------------------------------------------------------
	public void setTopic(String newTopic)
	{
		topic = newTopic;
	}
	
	//-----------------------------------------------------------------
    // Prints out a string description
    //-----------------------------------------------------------------
	@Override
	public String toString()
	{
		return super.toString() + " The book's topic is: " + topic + ".";
	}

}