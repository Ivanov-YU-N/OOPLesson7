import java.util.ArrayList;
import java.util.List;

public class JobAgancy implements Publisher {

    private List<OfferServer> offerServers = new ArrayList<>();


    @Override
    public void sendOffer(String companyName, int salary) {
        for (OfferServer offerServer: offerServers){
            offerServer.receiveOffer(companyName, salary);
        }
    }

    @Override
    public void registerOfferServer(OfferServer offerServer) {
        offerServers.add(offerServer);
    }

    @Override
    public void removeOfferSerrver(OfferServer offerServer) {
        offerServers.remove(offerServer);
    }
}
