import java.util.Random;

public class Company {
    private String name;
    private Publisher jobAgancy;
    private int maxSalary;

    private Random random = new Random();

    public Company(String name, Publisher jobAgancy, int maxSalary) {
        this.name = name;
        this.jobAgancy = jobAgancy;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgancy.sendOffer(name, salary);
    }
}
