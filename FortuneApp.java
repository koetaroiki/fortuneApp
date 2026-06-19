package fortuneApp;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
// 文字や画像を表示するためにJLabelクラスをimport
import javax.swing.JLabel;

// おみくじアプリの画面を管理する子クラス（サブクラス）
public class FortuneApp extends JFrame {

  // Mainから受け取った運勢情報を画面に表示するためのコンストラクタ
  public FortuneApp(Fortune fortune) {
    // ウィンドウのタイトルを設定
    setTitle("Fortune App");
    // ウィンドウのサイズを設定
    setSize(600, 600);
    // ウィンドウを閉じたときにプログラムを終了
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // 選ばれた運勢名を表示するラベルを作成
    JLabel label = new JLabel("運勢: " + fortune.getName());
    // ラベルをウィンドウに追加
    add(label);
  }
}