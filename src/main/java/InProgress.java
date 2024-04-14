public class InProgress extends TodoItemState{

    @Override
    public void togglePause(TodoItem todoItem) {
        todoItem.setState(new Paused());
    }

    @Override
    public void finish(TodoItem todoItem) {
        todoItem.setState(new Finished());
    }

}
