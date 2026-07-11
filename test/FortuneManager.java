package fortuneApp.test;

// おみくじをランダムに選ぶためにRandomクラスをimport
import java.util.Random;

// おみくじに関する処理をまとめるクラス
public class FortuneManager {
  // Fortune型の配列を受け取り、その中からランダムに1つ選んでFortune型として返すメソッド
  public static Fortune drawFortune() {
    // createFortunes()を呼び出し、おみくじ一覧をFortune型の配列としてfortuneList変数に代入する
    Fortune[] fortuneList = FortuneManager.createFortunes();
    // Randomオブジェクトを生成し、random変数に代入する
    Random random = new Random();
    // fortuneList配列の添字(0～5)をランダムに取得する
    int index = random.nextInt(fortuneList.length);
    // ランダムに選ばれたおみくじを取得する
    Fortune selectedFortune = fortuneList[index];
    // 選ばれたおみくじを呼び出し元へ返す
    return selectedFortune;
  }

  // おみくじ一覧を作成する
  public static Fortune[] createFortunes() {
    return new Fortune[] {
        new Daikichi(),
        new Chukichi(),
        new Shokichi(),
        new Kichi(),
        new Suekichi(),
        new Kyo()
    };
  }
}
