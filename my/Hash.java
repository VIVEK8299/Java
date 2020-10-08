import java.util.HashMap;
class Hash
{
 public static void main(String[]R)
 {
  HashMap<String, String> capitalCities = new HashMap<String, String>();

  capitalCities.put("England", "London");
  capitalCities.put("Germany", "Berlin");
  capitalCities.put("Normay", "Oslo");
  capitalCities.put("USA", "Washington DC");
  System.out.println(capitalCities);

  for(String i : capitalCities.keySet())
  {
   System.out.println(i);
  }
  System.out.println(capitalCities.get("England"));
  capitalCities.remove("England");
  System.out.println(capitalCities);
  for(String i : capitalCities.keySet())
  {
   System.out.println("key : " + i + " value : " + capitalCities.get(i));
  }
 }
}