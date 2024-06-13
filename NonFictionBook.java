public class NonFictionBook implements Book {
    private String title;
    private String author;

    public NonFictionBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getType() {
        return "Non-Fiction";
    }
}