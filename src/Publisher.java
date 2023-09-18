public interface Publisher {

    void sendOffer(String companyName, int salary);
    void registerOfferServer(OfferServer offerServer);
    void removeOfferSerrver(OfferServer offerServer);
}
