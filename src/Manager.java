public class Manager implements OfferServer{

    private String name;

    private int salary = 30000;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if(this.salary <= salary){
            System.out.printf("Менеджер: %s: Мне нужна эта работа в этой компании %s  c зарплатой %d, от добра добра не ищут\n",
                    name, companyName, salary);
                this.salary = salary*10;
        }
    }
}

