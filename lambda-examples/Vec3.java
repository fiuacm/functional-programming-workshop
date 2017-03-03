public class Main {
   public static void main(String[] args) {
     
     Vec3Math magnitude = (double x, double y, double z) -> Math.sqrt(x*x + y*y + z*z);
     Vec3Math getYComp = (double x, double y, double z) -> y;
     
     System.out.println(magnitude.calculate(1, 1, 1));
     System.out.println(getYComp.calculate(13.6, -5.5, 1.2));
     
  }
  
  interface Vec3Math {
    double calculate(double x, double y, double z);
  }
}
