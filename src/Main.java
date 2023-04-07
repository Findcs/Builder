public class Main {
    public static void main(String[] args) {

        User a = User.builder().role(2).password("dsadasds").build();
        System.out.println(a);
    }
}