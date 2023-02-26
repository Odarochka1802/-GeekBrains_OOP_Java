package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {
    private Pattern patternName = Pattern.compile("^\\S*$");


    //Эта регулярка ориентирована на российские мобильные номера, а также на городские с кодом из трёх цифр
    private Pattern patternPhone = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");

    public void check(User user) throws Exception {
        if (!patternName.matcher(user.getFirstName()).find() && !patternName.matcher(user.getLastName()).find()) {
            throw new Exception("invalid first name or lastname");
        }
        if (!patternPhone.matcher(user.getPhone()).find()){
            throw new Exception("invalid phone");

    }}
    public boolean checkPhone(String phone){
        return patternPhone.matcher(phone).find();
    }


}
