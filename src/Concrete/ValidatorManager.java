package Concrete;

import Abstract.Validator;
import Entities.Gamer;
import Entities.User;

public class ValidatorManager implements Validator {
    @Override
    public boolean validate(User user, Gamer gamer) {
        if(user.getTckn() == gamer.getTckn()){
            System.out.println(gamer.getFirstName() + " kullanıcısı doğrulandı.");
            return true;
        }else{
            System.out.println(gamer.getFirstName() + " kullanıcısı doğrulanamadı.");
            return false;
        }
    }
}
