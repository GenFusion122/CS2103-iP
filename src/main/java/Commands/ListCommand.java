package Commands;
import Models.Todo;
import Duck.TaskList;
import Duck.Storage;

public class ListCommand extends Commands{
    public ListCommand() {}

    @Override
    public void execute(TaskList<Todo> list, Storage storage) throws IndexOutOfBoundsException {
        list.printList();
    }

    @Override
    public boolean isExit() {
        return false;
    }
}