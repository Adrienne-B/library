public class Book {

	
	
    String title; //Declaring a variable
    boolean borrowed; //Declaring a variable

    // Creates a new Book
    public Book(String bookTitle) { //constructor ( you must have the name of the constructor the same as the class of the project.
        // Implement this method	//method returns the value.
 	title = bookTitle; //This is initiliazation which means assigning a value from the parameter.
    }
   
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    	borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
    	borrowed = false; 
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {  //this means what is the current status of borrowed or the specific element that you are looking for.
        // Implement this method
    	return borrowed; //return passes information to the specific function.
    }
   
    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    	return title; //return the title to let them know the name of the element(book).
    }
    
    public void rented() {
    	borrowed(); //we have parenthesis because we are calling the method
    	//borrowed; //this is like a filler, for the constructor but this wont call anything
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 