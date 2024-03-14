import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

public class ExceptionTest {

     public static void main(String[] args) {
         test();
     }

     static void test() {
      Throwable t = new Throwable();
      StringWriter out = new StringWriter();

      t.printStackTrace(new PrintWriter(out));
      String descrption = out.toString();
      System.out.println(descrption);

      // Java 9
      //
      StackWalker walker = StackWalker.getInstance();
      walker.forEach(System.out::println);


      //
      ArrayList<String>  list = new ArrayList<String>();

      // 不能创建泛型数组
      // var t = new ArrayList<String>[];



     }
}
