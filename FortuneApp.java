package fortuneApp;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
// 文字や画像を表示するためにJLabelクラスをimport
import javax.swing.JLabel;

// おみくじアプリの画面を管理する子クラス（サブクラス）
public class FortuneApp extends JFrame {

  // FortuneAppのコンストラクタ
  public FortuneApp() {
    // ウィンドウのタイトルを設定
    setTitle("Fortune App");
    // ウィンドウのサイズを設定
    setSize(600, 600);
    // ウィンドウを閉じたときにプログラムを終了
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // 「こんにちは」という文字を表示するラベルを作成
    JLabel label = new JLabel("こんにちは");
    // ラベルをウィンドウに追加
    add(label);
  }
}