package fortuneApp;

// おみくじをランダムに選ぶためにRandomクラスをimport
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    // Fortune型の配列に各運勢オブジェクトを格納する
    Fortune[] fortunes = {
      new Daikichi(),
      new Chukichi(),
      new Kichi(),
      new Shokichi(),
      new Kyo()
    };

      // Randomオブジェクトを生成し、random変数に代入する
      Random random = new Random();
      // fortunes配列の添字(0～4)をランダムに取得する
      int index = random.nextInt(fortunes.length);
      // ランダムに選ばれたおみくじを取り出す
      Fortune fortune = fortunes[index];

      // 選ばれたおみくじの運勢名とメッセージと画像のパスをコンソールに表示
      System.out.println("運勢: " + fortune.getName());
      System.out.println("メッセージ: " + fortune.getMessage());
      System.out.println(fortune.getImagePath());

      // FortuneAppオブジェクトを生成し、app変数に代入する
      FortuneApp app = new FortuneApp();
      // FortuneAppのウィンドウを表示する
      app.setVisible(true);
  }
}