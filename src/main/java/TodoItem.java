import java.util.ArrayList;
import java.util.List;

public class TodoItem {

    private String name;

    private List<String> comments;

    private TodoItemState state;

    public TodoItem(String name) {
        this.name = name;
        state = new Pending();
        comments = new ArrayList<>();
    }

    public void start() {
        state.start(this);
    }

    public void togglePause() {
        state.togglePause(this);
    }

    ;

    public void finish(TodoItem todoItem) {
        state.finish(this);
    }

    ;

    public void addComment(TodoItem todoItem, String comment) {
        state.addComment(this, comment);
    }

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public void setState(TodoItemState state) {
        this.state = state;
    }
}
