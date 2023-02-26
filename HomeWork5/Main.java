import controllers.UserController;
import model.*;
import views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ValidateUser validate = new ValidateUser();
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
