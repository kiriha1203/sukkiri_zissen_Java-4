public class Ex6 implements Comparable<Account> {
  int number;

  public int compareTo(Account obj) {
    if(this.number < obj.number) {
      return -1;
    }
    if(this.number > obj.number) {
      return 1;
    }
    return 0;
  }
}