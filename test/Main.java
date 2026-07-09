package fortuneApp.test;

public class Main {
  public static void main(String[] args) {

    // StartAppクラスをインスタンス化する
    StartApp app = new StartApp();
    // StartAppのウィンドウを表示する
    app.setVisible(true);

    // createFortunes()を呼び出し、おみくじ一覧をFortune型の配列としてfortuneList変数に代入する
    Fortune[] fortuneList = FortuneManager.createFortunes();

    // fortuneListを引数としてdrawFortune()を呼び出し、選ばれたおみくじを取得する
    Fortune resultFortune = FortuneManager.drawFortune(fortuneList);

    System.out.println(resultFortune.getName());
    System.out.println(resultFortune.getMessage());
  }
}