public class Pending extends TodoItemState{

    @Override
    public void start(TodoItem todoItem) {
        todoItem.setState(new InProgress());
    }

    @Override
    public void togglePause(TodoItem todoItem) {
        throw new RuntimeException("No puedo pausarme, estoy pendiente.");
    }


}
