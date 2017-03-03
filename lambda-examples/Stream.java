import java.util.List;
import java.util.Arrays;

public class Main {
  
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("Haskell", "Frege", "foreach", ":", "open", "program", "int", "ACM", "in");
    strings.stream().filter(s -> s.length() > 4).sorted().forEach(System.out::println);
    System.out.println(strings.stream().filter(s -> s.startsWith("A")).count());
  }
}
