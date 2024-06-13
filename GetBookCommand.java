public class GetBookCommand implements LibraryCommand {
    private Library library;
    private String title;

    public GetBookCommand(Library library, String title) {
        this.library = library;
        this.title = title;
    }

    @Override
    public void execute() {
        Book book = library.getBook(title);
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found!");
        }
    }
}