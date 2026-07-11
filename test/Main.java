package fortuneApp.test;

public class Main {
  public static void main(String[] args) {

    // StartAppクラスをインスタンス化する
    StartApp app = new StartApp();
    // StartAppのウィンドウを表示する
    app.setVisible(true);

    // fortuneListを引数としてdrawFortune()を呼び出し、選ばれたおみくじを取得する
    Fortune resultFortune = FortuneManager.drawFortune();

    System.out.println(resultFortune.getName());
    System.out.println(resultFortune.getMessage());
  }
}