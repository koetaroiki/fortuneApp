package fortuneApp.test;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;

// import java.util.Random;
// import javax.swing.ImageIcon;

// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JButton;
// ボタンのクリックイベントを扱うためにActionEventクラスをimport
import java.awt.event.ActionEvent;
// ボタンのクリックイベントを処理するためにActionListenerインターフェースをimport
import java.awt.event.ActionListener;

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

    drawButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("ボタンが押されました");
      }
    });

    // ボタンをウィンドウに追加
    add(drawButton);

    // 画面を表示
    setVisible(true);
  }

}
