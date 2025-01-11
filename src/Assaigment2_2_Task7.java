public class Assaigment2_2_Task7 {
    public static void main(String[] args) {
        signIn("Alice");
        signIn("user");
    }

    public static void signIn(String username) {
        if ("user".equals(username)) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
