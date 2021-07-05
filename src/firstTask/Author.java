package firstTask;

public class Author {

    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printAuthorName() {
        System.out.println("Author: " + firstName + " " + lastName);
    }
}
