package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
    void campaignAdd(Campaign campaign);
    void campaignUpdate(Campaign campaign);
    void campaignDelete(Campaign campaign);
    void applyCampaign(Campaign campaign, Game game);
}
