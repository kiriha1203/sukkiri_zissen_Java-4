import java.util.*;

class Hero {
  public String name;
}

public class Ex3 {
  public static void main(String[] args) {
    List<Hero> list = new ArrayList<>();
    var h1 = new Hero();
    h1.name = "ミナト";
    list.add(h1);
    System.out.println("要素=" + list.size());
    h1 = new Hero();
    h1.name = "ミナト";
    list.remove(h1);
    System.out.println("要素数=" + list.size());
  }
  
}