public class AddBookCommand implements LibraryCommand {
    private Library library;
    private Book book;

    public AddBookCommand(Library library, Book book) {
        this.library = library;
        this.book = book;
    }

    @Override
    public void execute() {
        library.addBook(book);
    }
}
