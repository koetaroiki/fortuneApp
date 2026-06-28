package fortuneApp;

// おみくじをランダムに選ぶためにRandomクラスをimport
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    // Fortune型の配列に各運勢オブジェクトを格納する
    Fortune[] fortunes = {
      new Daikichi(),
      new Chukichi(),
      new Shokichi(),
      new Kichi(),
      new Suekichi(),
      new Kyo()
    };

    // Randomオブジェクトを生成し、random変数に代入する
    Random random = new Random();
    // fortunes配列の添字(0～5)をランダムに取得する
    int index = random.nextInt(fortunes.length);
    // ランダムに選ばれたおみくじを取り出す
    Fortune fortune = fortunes[index];

    // 選ばれた運勢情報を引数として渡し、FortuneAppオブジェクトを生成してapp変数に代入する
    FortuneApp app = new FortuneApp(fortune, fortunes);
    // FortuneAppのウィンドウを表示する
    app.setVisible(true);
  }
}