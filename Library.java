import java.util.*;

public class Library {
    private static Library libraryInstance;
    private Map<String, Book> books;
    private List<LibraryCommand> commands;

    private Library() {
        books = new HashMap<>();
        commands = new ArrayList<>();
    }

    public static Library getInstance() {
        if (libraryInstance == null) {
            libraryInstance = new Library();
        }
        return libraryInstance;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void executeCommand(LibraryCommand command) {
        commands.add(command);
        command.execute();
    }
}