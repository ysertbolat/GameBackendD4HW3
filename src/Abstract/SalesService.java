package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
    void sell(Gamer gamer, Game game, Campaign campaign);
    void sellWithoutCampaign(Gamer gamer, Game game);
    void returnOfSell(Gamer gamer, Game game);
}

