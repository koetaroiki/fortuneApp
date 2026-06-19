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

      // 選ばれた運勢情報を引数として渡し、FortuneAppオブジェクトを生成してapp変数に代入する
      FortuneApp app = new FortuneApp(fortune);
      // FortuneAppのウィンドウを表示する
      app.setVisible(true);
  }
}

/*
Main.javaが実行される
↓
おみくじがランダムで選ばれ、Fortune型のfortune変数に代入される
↓
選ばれた運勢情報をFortuneAppに渡すため、fortuneを引数としてコンストラクタに渡す
↓
FortuneAppオブジェクトが生成され、app変数に代入される
*/