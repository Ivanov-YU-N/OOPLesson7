public class Worker implements OfferServer{

    private String name;

    private int salary = 80000;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {

        if(this.salary <= salary){
            System.out.printf("Специалист: %s: Мне нужна эта работа в этой компании %s  c зарплатой %d\n",
                    name, companyName, salary);
            this.salary = salary;
        }else{
            System.out.printf("Специалист: %s: Я найду работу получше, чем в %s за  %d\n",
                    name, companyName, salary);
        }
    }
}
