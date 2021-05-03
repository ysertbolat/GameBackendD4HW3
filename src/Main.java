import Abstract.Validator;
import Concrete.*;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("123456789", "yusuf", "sertbolat", "28/02/2001");
        Gamer gamer1 = new Gamer(1,"123456789", "yusuf", "sertbolat", "28/02/2001","y.sertbolat@gmail.com");
        Game game1 = new Game(1,1,"Age of Empires III DE",30);
        Campaign campaign1 = new Campaign(1,"Gamer İndirimi",10);


        ValidatorManager validatorManager = new ValidatorManager();
        validatorManager.validate(user1,gamer1);

        GamerManager gamerManager = new GamerManager();
        gamerManager.register(gamer1);

        GameManager gameManager = new GameManager();
        gameManager.add(game1);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.applyCampaign(campaign1,game1);

        SalesManager salesManager = new SalesManager();
        salesManager.sell(gamer1,game1,campaign1);
    }
}
