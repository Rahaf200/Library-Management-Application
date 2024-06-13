public class LibraryUser implements User {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Book book) {
        System.out.println("Hello " + name + ", the book " + book.getTitle() + " is now available in the library.");
    }
}