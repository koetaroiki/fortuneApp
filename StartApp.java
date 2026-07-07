package fortuneApp;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JButton;
// 部品を縦方向に配置するためにBoxLayoutクラスをimport
import javax.swing.BoxLayout;

public class StartApp extends JFrame {

  public StartApp() {
    // ウィンドウのタイトルを設定
    setTitle("Fortune App");
    // ウィンドウのサイズを設定
    setSize(600, 600);
    // ウィンドウを閉じたときにプログラムを終了
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // 画面を表示
    setVisible(true);
    // おみくじを引くボタンを作成
    JButton drawButton = new JButton("おみくじを引く");
    // ボタンをウィンドウに追加
    add(drawButton);
    // 部品を縦方向に配置する
    setLayout(new BoxLayout(
        getContentPane(),
        BoxLayout.Y_AXIS));
    drawButton.setAlignmentX(CENTER_ALIGNMENT);
  }
}
