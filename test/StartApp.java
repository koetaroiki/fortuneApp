package fortuneApp.test;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;

// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JButton;
// ボタンのクリックイベントを扱うためにActionEventクラスをimport
import java.awt.event.ActionEvent;
// ボタンのクリックイベントを処理するためにActionListenerインターフェースをimport
import java.awt.event.ActionListener;

// JFrame（ウィンドウを作るクラス）を継承したStartAppクラス
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

    // ボタンが押されたときに実行する処理を登録する
    drawButton.addActionListener(new ActionListener() {
      // ActionListenerのactionPerformed()メソッドをオーバーライド
      @Override
      // ボタンが押されたときに実行される処理
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
