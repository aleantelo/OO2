public class Finished extends TodoItemState{

    @Override
    public void togglePause(TodoItem todoItem) {
        throw new RuntimeException("No puedo pausarme, estoy finalizado.");
    }

    @Override
    public void addComment(TodoItem todoItem, String comment) {
        System.out.println("Mi estado es finished, no hago nada en addComment");
    }

}
