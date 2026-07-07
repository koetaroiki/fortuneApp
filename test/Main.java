package fortuneApp.test;

// おみくじをランダムに選ぶためにRandomクラスをimport
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    // StartAppクラスをインスタンス化する
    StartApp app = new StartApp();
    // StartAppのウィンドウを表示する
    app.setVisible(true);

    // createFortunes()を呼び出し、おみくじ一覧をFortune型の配列としてfortuneList変数に代入する
    Fortune[] fortuneList = createFortunes();

    // fortuneListを引数としてdrawFortune()を呼び出し、選ばれたおみくじを取得する
    Fortune resultFortune = drawFortune(fortuneList);

    System.out.println(resultFortune.getName());
    System.out.println(resultFortune.getMessage());
  }

  // おみくじ一覧を作成する
  private static Fortune[] createFortunes() {
    return new Fortune[] {
        new Daikichi(),
        new Chukichi(),
        new Shokichi(),
        new Kichi(),
        new Suekichi(),
        new Kyo()
    };
  }

  // Fortune型の配列を受け取り、その中からランダムに1つ選んでFortune型として返すメソッド
  private static Fortune drawFortune(Fortune[] fortuneList) {
    // Randomオブジェクトを生成し、random変数に代入する
    Random random = new Random();
    // fortuneList配列の添字(0～5)をランダムに取得する
    int index = random.nextInt(fortuneList.length);
    // ランダムに選ばれたおみくじを取得する
    Fortune selectedFortune = fortuneList[index];
    // 選ばれたおみくじを呼び出し元へ返す
    return selectedFortune;
  }
}