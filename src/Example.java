@FunctionalInterface
public interface Example {
    public void m1();


}

class Test {
    public static void main(String[] args) {
        Example i = () -> System.out.println("sadoa");
        i.m1();
    }
}
