import java.util.List;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
     
      List<String> words = new ArrayList<String>();
      
      words.add("Lambda");
      words.add("Currying");
      words.add("Monads");
      words.add("Pure");
      
      words.forEach(System.out::println);
      words.forEach(Main::print);
      
      List<Float> vals = new ArrayList<Float>();
      
      vals.add(25.0f);
      vals.add(53.2f);
      vals.add(64.1f);
      
      vals.forEach(Math::sqrt);
  }
  
  public static void print(String val) {
    System.out.println("Functional term: " + val);
  }
  
}
