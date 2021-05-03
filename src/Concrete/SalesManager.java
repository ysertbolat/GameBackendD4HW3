package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService {
    @Override
    public void sell(Gamer gamer, Game game, Campaign campaign) {
        System.out.println(gamer.getFirstName() + " isimli kullanıcıya " + game.gameName + " adlı oyunda yüzde " + campaign.campaignDiscount + " kadar indirim gerçekleştirilerek satış yapıldı.");
    }

    @Override
    public void sellWithoutCampaign(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " isimli kullanıcıya " + game.gameName + " oyununun satışı yapıldı.");
    }

    @Override
    public void returnOfSell(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " isimli kullanıcı " + game.gameName + " adlı oyunu iade etti.");
    }
}