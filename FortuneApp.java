package fortuneApp;

// JFrameクラスを使用するためにimport
import javax.swing.JFrame;

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
  }
}