/**
 * 测试接口
 * 1. 接口中的方法是抽象的，不包含方法体
 * 2. 接口中的方法可以有默认实现
 * 3. 接口中的方法可以有静态方法
 * 4. 接口中的方法可以有私有方法
 * 5. 接口中的方法可以有私有静态方法

 */

public class interfaceTest {



    /**
     * InnerStudent
     */
    static interface Person {

        // 接口可以声明变量，但是变量默认是 public static final
        String NAME = "interfaceTest";

        default String getName() {
            return "Person";
        }

        /**
         * 默认方法
         */
        default void showAge() {
            System.out.println("Named");
        }
    }

    static interface Named {
        String getName();
    }


    static class Student implements Person, Named {

        /**
         * 如果一个类实现了两个接口，这两个接口有相同的方法签名，那么这个类必须实现这个方法
         * 只需要实现一次，不需要重复实现
         *
         */
        @Override
        public String getName() {
            return "Student";

            // 通过接口调用默认方法, 通过接口名.方法名
            //
            // return Person.super.getName();
        }
    }

    public static void main(String[] args) {

        Named student = new Student();

        System.out.println("Hello, World!" + student.getName());
    }
}

