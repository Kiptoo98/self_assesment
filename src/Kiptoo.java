public class Kiptoo {
    protected String name;
    protected int age;
    protected float salary;

    public Kiptoo(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Kiptoo Brian = new Kiptoo("Brian Kiptoo", 24, 300000F);
        System.out.println("My name is " + Brian.name + " aged " + Brian.age + " earning " +Brian.salary);
    }
}
