public abstract class TodoItemState {

    public void start(TodoItem todoItem){
        System.out.println("No hago nada");
    };

    public abstract void togglePause(TodoItem todoItem);

    public  void finish(TodoItem todoItem){
        System.out.println("No hago nada");
    };

    public void addComment(TodoItem todoItem, String comment) {
        todoItem.addComment(comment);
    }

}
