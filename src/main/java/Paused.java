public class Paused extends TodoItemState{

    @Override
    public void togglePause(TodoItem todoItem) {
        todoItem.setState(new InProgress());
    }

    @Override
    public void finish(TodoItem todoItem) {
        todoItem.setState(new Finished());
    }


}
