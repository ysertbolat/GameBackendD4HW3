package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {
    @Override
    public void campaignAdd(Campaign campaign) {
        System.out.println("Kampanya oluşturuldu : " + campaign.campaingName);

    }

    @Override
    public void campaignUpdate(Campaign campaign) {
        System.out.println("Kampanya güncellendi : " + campaign.campaingName);
    }

    @Override
    public void campaignDelete(Campaign campaign) {
        System.out.println("Kampanya silindi : " + campaign.campaingName);
    }

    @Override
    public void applyCampaign(Campaign campaign, Game game) {
        int newPrice = (int) (game.getPrice() -((game.getPrice() * campaign.getCampaignDiscount()) / 100));
        game.setPrice(newPrice);
        System.out.println("Kampanyalı fiyat : " + game.getPrice());
    }
}
