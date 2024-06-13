
import java.util.*;

public class LibraryObserver {
    private List<User> users;

    public LibraryObserver() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void notifyUsers(Book book) {
        for (User user : users) {
            user.update(book);
        }
    }
}