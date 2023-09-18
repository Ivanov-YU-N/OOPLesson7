public class Program {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgancy();
        Company google = new Company("Google", jobAgency, 95000);
        Company beeline = new Company("Beeline", jobAgency, 90000);
        Company motive = new Company("Motive", jobAgency, 88000);

        Student student = new Student("Student");
        Worker worker1 = new Worker("Worker1");
        Worker worker2 = new Worker("Worker2");
        Manager manager = new Manager("Manager");

        jobAgency.registerOfferServer(student);
        jobAgency.registerOfferServer(worker1);
        jobAgency.registerOfferServer(worker2);
        jobAgency.registerOfferServer((manager));

        for (int i = 0; i < 2; i++) {
            google.needEmployee();
            beeline.needEmployee();
            motive.needEmployee();

        }
    }
}
