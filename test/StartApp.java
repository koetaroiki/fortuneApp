package fortuneApp.test;

// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JFrame;
// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JButton;

// JFrameを継承したStartAppクラス
public class StartApp extends JFrame {

  // StartAppのコンストラクタ
  public StartApp() {
    // ウィンドウのタイトルを設定
    setTitle("Fortune App");
    // ウィンドウのサイズを設定
    setSize(600, 600);
    // ウィンドウを閉じたときにプログラムを終了
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // おみくじを引くボタンを作成
    JButton drawButton = new JButton("おみくじを引く");

    System.out.println("ボタンが押されました");
    // ボタンをウィンドウに追加
    add(drawButton);

    // 画面を表示
    setVisible(true);
  }
}
