package Abstract;

import Entities.Gamer;
import Entities.User;

public interface Validator {
    boolean validate(User user, Gamer gamer);
}