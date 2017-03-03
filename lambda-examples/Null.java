import java.util.Optional;
import java.util.Random;
public class Main {
  
  public static class Person {
    int id;
    String name;
    public Person(int id) {
      this.id = id;
    }
    
    public void loadDataFromServer() {
      if(this.id == 1) {
        name = "Jeff";
      }
    }
  }
  
  public static void main(String args[]){
    Person p1 = new Person(1);
    Person p2 = new Person(-2);
    
    p1.loadDataFromServer();
    p2.loadDataFromServer();
    
    String name1 = p1.name.toLowerCase();
    String name2 = p2.name.toLowerCase();
    
    //String name1 = Optional.ofNullable(p1.name).orElse("N/A").toLowerCase();
    //String name2 = Optional.ofNullable(p2.name).orElse("N/A").toLowerCase();
    
    System.out.println(name1);
    System.out.println(name2);
  }

}
