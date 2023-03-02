package Notes;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        Controller controller = new Controller(repository);
        View view = new View(controller);
        view.run();
    }
}
