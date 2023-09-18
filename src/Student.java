public class Student implements OfferServer {

    private String name;

    private int salary = 2000;

    public Student(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if(this.salary <= salary){
            System.out.printf("Студент: %s: Мне нухна эта работа в этой компании %s  c зарплатой %d\n",
                    name, companyName, salary);
            this.salary = salary;
        }else{
            System.out.printf("Студент: %s: Я наду работу получше, чем в %s за  %d\n",
                    name, companyName, salary);
        }
    }
}
