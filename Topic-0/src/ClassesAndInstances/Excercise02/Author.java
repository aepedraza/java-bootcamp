package ClassesAndInstances.Excercise02;

/**
 *
 * @author apedraza
 */
public class Author {
  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public char getGender() {
    return gender;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  @Override
  public String toString() {
    // returns "author-name (gender) at email", e.g., "Tan Ah Teck (m) at ahTeck@somewhere.com".
    return this.name + " (" + this.gender + ") at " + this.email;
  }
}
