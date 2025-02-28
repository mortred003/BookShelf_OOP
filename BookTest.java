package bookOOP;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args)
	{
		Book firstBook = new Book();
		Book lastBook = new Book();
		Book aBook = new Book();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("End the input " + 
		"prcess question with ENTER key");
		System.out.println("Title of the book?- ");
		String title = scan.nextLine();
		System.out.println("Name of the author?- ");
		String author=scan.nextLine();
		
		aBook = new Book (title, author);
		
		if (!(title.equals("") && author.equals("")))
			System.out.println(aBook);
		
			while (!(title.equals("") && author.equals("")))
			{
				if (aBook.getId() == 1)
					firstBook = aBook;
					System.out.print("Title of the book?- ");
					title = scan.nextLine();
					System.out.print("Name of the author?-" );
					author = scan.nextLine();
					
						if (!(title.equals("") && author.equals(""))) {
							aBook = new Book(title, author);
							System.out.print(aBook);
							System.out.println(); }
						}
			lastBook = aBook;
				if (firstBook.equals(lastBook)) 
					System.out.println("First and last book are same");
					System.out.println(lastBook.getInitials());
				
			}
		
	}
	

