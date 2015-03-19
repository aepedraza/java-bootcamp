package Excercise2;

/**
 *
 * @author apedraza
 */
public class TestBook {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Author anAuthor = new Author("Stephen King", "sking@maine.com", 'm');
    Book aBook = new Book("Pet's cementery", anAuthor, 19.95, 1000);
    // Use an anonymous instance of Author
    Book anotherBook = new Book("more Java for dummy", new Author("Jane Doe", "janedoe@somewhere.com", 'f'), 29.95, 888);
    
    System.out.println("aBook's author data: " + aBook.getAuthor().getName() + ", " + aBook.getAuthor().getEmail());
    
    System.out.println("New method's results: " + anotherBook.getAuthorName() + ", "
            + anotherBook.getAuthorEmail() + ", Gender: " + anotherBook.getAuthorGender());
  }

}
