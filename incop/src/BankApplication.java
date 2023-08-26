public class BankApplication {
    private String name;
    private String country;
    private Worker[] workers = new Worker[100];
    private int sizeOfWorkers = 0;

    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public BankApplication(){

    }
    void addWorker(String name, String surname, String department, int salary){
        Worker worker = new Worker(sizeOfWorkers,name,surname,department,salary);
        workers[sizeOfWorkers] = worker;
        sizeOfWorkers++;
    }
    void listWorkers(){
        if(sizeOfWorkers==0){
            System.out.println("List is empty");
        }
        else{
            for (int i = 0; i<sizeOfWorkers;i++) {
                System.out.println(workers[i].toString());
                System.out.println("-----------------");
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
}
