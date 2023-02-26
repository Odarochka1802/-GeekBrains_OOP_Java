package views;


import controllers.UserController;
import model.Fields;
import model.User;
import model.ValidateUser;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;
    private final ValidateUser validate;

    public ViewUser(UserController userController, ValidateUser validate) {
        this.userController = userController;
        this.validate = validate;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        caseCreate();
                        break;
                    case READ:
                        caseRead();
                        break;
                    case LIST:

                        caseList();
                        break;
                    case DELETE:
                        caseDeleted();
                        break;
                    case UPDATE:
                        caseUpdate();
                        break;
                }
            }
            catch  (Exception ee){
                System.out.printf("%s something wrong \n ", ee.getMessage());
            }
        }
    }

    private void caseUpdate() throws Exception {
        String userid = prompt("Идентификатор пользователя: ");
        String field_name = prompt("Какое поле (FIO,NAME,TELEPHONE): ");
        String param = null;
        if (Fields.valueOf(field_name) == Fields.TELEPHONE) {
            param = catchTelephone(param);
            if(param == null) {
                return;
            }
        }
        else {
            param = prompt("Введите на то что хотите изменить");
        }
        User _user = userController.readUser(userid);
        userController.updateUser(_user, Fields.valueOf(field_name.toUpperCase()), param);
    }
    public String catchTelephone(String telephone) throws Exception {
        while(true) {
            try {
                telephone = prompt("Введите номер телефона (Отказ введите 0): ");
                if(telephone.equals("0")) {
                    System.out.println("Вы отказались от ввода для изменения пользователя");
                    return null;
                }
                validate.checkPhone(telephone);
                return telephone;
            } catch(Exception ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }

    private void caseDeleted() {
        String id = prompt("Идентификатор пользователя: ");
        userController.deleteUser(id);
        System.out.println("user deleted");
    }

    private void caseCreate() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void caseRead() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseList() {
        List<User> usersList = userController.readUsers();
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}



