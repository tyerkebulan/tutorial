public class ERPSystem {
    private User[] memory = new User[1000];
    private int sizeOfUsers = 0;

    public ERPSystem(){

    }
    void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }
    void printAllUsers(){
        for (int i=0;i<sizeOfUsers;i++){
            System.out.println(memory[i].getUserData());
        }
    }
    void printAllStudents(){
        for (int i=0;i<sizeOfUsers;i++){
            if(memory[i] instanceof Student){
                System.out.println(memory[i].getUserData());
            }

        }
    }
    void printAllTeacters(){
        for (int i=0;i<sizeOfUsers;i++){
            if(memory[i] instanceof Teacher){
                System.out.println(memory[i].getUserData());
            }

        }
    }
    void printUser(int index){
        for (int i=0;i<sizeOfUsers;i++){
            if(index==i){
                System.out.println(memory[i].getUserData());
            }
            else{
                System.out.println("No user in this index");
            }
        }
    }
}
