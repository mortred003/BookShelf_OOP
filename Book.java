package bookOOP;

public class Book {
	
	private String author, title;
	private int id;
	private static int identification = 0;
	
	public Book()
	{
		title=author="unknown";
		id=0;
		
	}
	public Book(String title)
	{
		this.title = title;
		author = "unknown";
		identification++;
		id=identification;
	}
	public Book(String title, String author)
	{
	this.title=title;
	this.author=author;
	identification++;
	id=identification;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getId()
	{
		return id;
	}
	public boolean equals(Book other)
	{
		boolean enough = true;
		  String otherAuthor = other.getAuthor();
		  String otherTitle = other.getTitle();

		  if(otherAuthor.equals(author) && otherTitle.equals(title))
			   enough = true;
		  else 
			   enough = false;
			   return enough;
	}
	public String getInitials()
	{
		String output ="";
		
		if(!(author.equals("")) && 
				!(author.equals("unknown")) && !(author.equals(null))) {
			output += author.charAt(0);
			output += ". ";
			
			if (author.indexOf(" ") != -1) {
				output += author.charAt(author.indexOf(" ") + 1);
				output += ". "; }
			
				if (author.indexOf(" ") != -1) {
					output += author.charAt((author.indexOf(" ") 
							+author.indexOf(" "))+4);
					output +=". "; }
		}
				return output;
			}
		public String toString()
		{
			return "Book No: " + id + " entitled \"" 
					+ title + "\"" + " writen by " + author;
		}
	
		
	}
	

