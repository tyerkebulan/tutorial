public class Main {
    public static void main(String[] args) {
        User user = new User.BuilderUser()
                .withId(1)
                .withLogin("user")
                .withName("User")
                .build();
        System.out.println(user);
    }
}