package fortuneApp.test;

import javax.swing.JFrame;

public class StartApp extends JFrame {

  public StartApp() {

    // ウィンドウのタイトルを設定
    setTitle("Fortune App");

    // ウィンドウのサイズを設定
    setSize(600, 600);

    // ウィンドウを閉じたときにプログラムを終了
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
