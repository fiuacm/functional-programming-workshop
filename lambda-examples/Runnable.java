public class Main {
   public static void main(String[] args) {
     
     // Anonymous Runnable
     Runnable r1 = new Runnable() {
       @Override
       public void run() {
         System.out.println("Running in Anonymous");
       }
     };
     
     // Lambda Runnable
     Runnable r2 = () -> System.out.println("Running in Lambda");
     
     new Thread(r1).start();
     new Thread(r2).start();
     
  }
}
