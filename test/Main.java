package fortuneApp.test;

// おみくじをランダムに選ぶためにRandomクラスをimport
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    // createFortunes()を呼び出し、おみくじ一覧をFortune型の配列としてfortunes変数に代入する
    Fortune[] fortunes = createFortunes();

    // Fortune型の配列を作り、その配列をfortunesという変数に代入している
    // Fortune[] fortunes = {
    // new Daikichi(),
    // new Chukichi(),
    // new Shokichi(),
    // new Kichi(),
    // new Suekichi(),
    // new Kyo()
    // };

    // Randomオブジェクトを生成し、random変数に代入する
    Random random = new Random();
    // fortunes配列の添字(0～5)をランダムに取得する
    int index = random.nextInt(fortunes.length);
    // ランダムに選ばれたおみくじを取り出す
    Fortune selectedFortune = fortunes[index];

    System.out.println(selectedFortune.getName());
    System.out.println(selectedFortune.getMessage());

    // System.out.println("index = " + index);
    // System.out.println("class = " + fortune.getClass().getSimpleName());
    // System.out.println("name = " + fortune.getName());
    // System.out.println("message = " + fortune.getMessage());

    // 選ばれた運勢情報を引数として渡し、FortuneAppオブジェクトを生成してapp変数に代入する
    // FortuneApp app = new FortuneApp(fortune, fortunes);
    // FortuneAppのウィンドウを表示する
    // app.setVisible(true);
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

  // Fortune型の配列を受け取って、その中から1つのFortuneを返すメソッド
  // private static Fortune drawFortune(Fortune[] fortunes){

  // }
}