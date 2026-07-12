package fortuneApp.test;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
import javax.swing.BoxLayout;
// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JButton;

// 文字や画像を表示するためにJLabelクラスをimport
import javax.swing.JLabel;

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

    // コンポーネントを縦方向に配置する
    setLayout(new BoxLayout(
        getContentPane(),
        BoxLayout.Y_AXIS));

    // おみくじを引くボタンを作成
    JButton drawButton = new JButton("おみくじを引く");
    JLabel resultLabel = new JLabel("ここに結果が表示されます");

    // ボタンが押されたときに実行する処理を登録する
    drawButton.addActionListener(new ActionListener() {
      // ActionListenerのactionPerformed()メソッドをオーバーライド
      @Override
      // ボタンが押されたときに実行される処理
      public void actionPerformed(ActionEvent e) {
        System.out.println("ボタンが押されました");
        // drawFortune()を呼び出し、選ばれたおみくじを取得する
        Fortune resultFortune = FortuneManager.drawFortune();

        System.out.println(resultFortune.getName());
        System.out.println(resultFortune.getMessage());
      }
    });

    // ボタンをウィンドウに追加
    add(drawButton);
    add(resultLabel);

    // 画面を表示
    setVisible(true);
  }

}
