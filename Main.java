public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        Book fictionBook = new FictionBook("Harry Potter", "J.K. Rowling");
        Book nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari");

        // Create commands
        LibraryCommand addFictionBookCommand = new AddBookCommand(library, fictionBook);
        LibraryCommand addNonFictionBookCommand = new AddBookCommand(library, nonFictionBook);
        LibraryCommand getBookCommand = new GetBookCommand(library, "Harry Potter");

        // Execute commands
        library.executeCommand(addFictionBookCommand);
        library.executeCommand(addNonFictionBookCommand);
        library.executeCommand(getBookCommand);
    }
}
