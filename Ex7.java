public class Ex7 {
  public static void main(String[] args) {
    var h1 = new Hero("ミナト");
    Sword s = new Sword("鋼の剣");
    h1.setSwords(s);
    System.out.println("装備:" + h1.getSword().getName());
    System.out.println("clone()で複製します");
    Hero h2 = h1.colne();
    System.out.println("コピー元の勇者の剣の名前を変えます");
    h1.getSword().setName("檜の棒");
    System.out.println("コピー元とコピー先の勇者の装備を表示します");
    System.out.println("コピー元" + h1.getSword().getName() + "/コピー先:" + h2.getSword().getName());
  }
}