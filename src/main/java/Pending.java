public class Pending extends TodoItemState{

    @Override
    public void start(TodoItem todoItem) {
        todoItem.setState(new InProgress());
    }

    @Override
    public void togglePause(TodoItem todoItem) {
        throw new RuntimeException("No puedo pausarme, estoy pendiente.");
    }

    @Override
    public void finish(TodoItem todoItem) {
        System.out.println("Mi estado es Pending, no hago nada en finish");
    }

}
