import java.util.ArrayList;

public class GenericTest {

     static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100;
            salary += raise;
        }
     }

    static class Manager extends Employee {
        private double bonus;

        public Manager(String name, double salary) {
            super(name, salary);
            bonus = 0;
        }

        public double getSalary() {
            double baseSalary = super.getSalary();
            return baseSalary + bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }


    static class Pair<T extends Employee> {

        // 通过Pair<Manager> 和 Pair<Employee> 是两个完全不同的类，两个类型的Pair对象调用print方法
        // 使用通配符 ? extends Employee,可以接受任何Employee的子类
        public static void print(Pair<? super Employee> pair) {
            System.out.println(pair.getFirst() + " " + pair.getSecond());
        }

        // 不能创建静态变量的泛型
        //static T singleInstance;

        private T first;
        private T second;

        public Pair() {
            first = null;
            second = null;
        }

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public void setFirst(T newValue) {
            first = newValue;
        }

        public void setSecond(T newValue) {
            second = newValue;
        }
    }

    public static void main(String[] args) {

        Pair<Employee> p = new Pair<Employee>();

        //1、不能创建基础数据类型的泛型
        //Pair<int> p = new Pair<int>();

        //2、类型查询只能适用于原始类型
        if (p instanceof Pair) {
            System.out.println("p is a Pair");
        }

        //3、不能创建参数化类型的数组, 但是可以创建原始类型的数组
        //Pair<String>[] table = new Pair<String>[10];
        ArrayList<Pair<Employee>> list = new ArrayList<Pair<Employee>>();
     }
    }
}
