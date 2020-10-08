import java.util.ArrayList;
public class MyClass {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.size());
    for(int i=0;i<cars.size();i++)
{   System.out.println(cars.get(i));
 }	


    System.out.println(cars.get(0));
    cars.set(0, "honda");
    System.out.println(cars.get(0));
    cars.remove(2);
    System.out.println(cars);
    cars.clear();
    System.out.println(cars);
  }
}