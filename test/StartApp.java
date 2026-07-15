package fortuneApp.test;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
// 部品を縦方向に並べるためにBoxLayoutクラスをimport
import javax.swing.BoxLayout;
// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JButton;
// 文字や画像を表示するためにJLabelクラスをimport
import javax.swing.JLabel;

// ボタンのクリックイベントを扱うためにActionEventクラスをimport
import java.awt.event.ActionEvent;
// ボタンのクリックイベントを処理するためにActionListenerインターフェースをimport
import java.awt.event.ActionListener;

// 画像を表示するためにImageIconクラスをimport
import javax.swing.ImageIcon;
// 画像サイズを変更するためにImageクラスをimport
import java.awt.Image;

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
    // おみくじ画像を表示するラベル
    JLabel imageLabel = new JLabel();
    // おみくじを表示するラベル（初期値は何も表示しない）
    JLabel resultLabel = new JLabel();
    // おみくじのメッセージを表示するラベル（初期値は何も表示しない）
    JLabel messageLabel = new JLabel();
    // ボタンが押されたときに実行する処理を登録する
    drawButton.addActionListener(new ActionListener() {
      // ActionListenerのactionPerformed()メソッドをオーバーライド
      @Override
      // ボタンが押されたときに実行される処理
      public void actionPerformed(ActionEvent e) {
        System.out.println("ボタンが押されました");
        // drawFortune()を呼び出し、選ばれたおみくじを取得する
        Fortune resultFortune = FortuneManager.drawFortune();

        // 選ばれたおみくじ画像を読み込む
        ImageIcon icon = new ImageIcon(resultFortune.getImagePath());
        // ImageIconからImageを取得する
        Image image = icon.getImage();
        // 300×300にリサイズする
        Image resizeImage = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        // リサイズ後のImageからImageIconを作成する
        ImageIcon resizeIcon = new ImageIcon(resizeImage);
        // imageLabelに画像を表示する
        imageLabel.setIcon(resizeIcon);

        // 選ばれた運勢名を画面に表示
        resultLabel.setText(resultFortune.getName());
        // 選ばれたメッセージを画面に表示
        messageLabel.setText(resultFortune.getMessage());
      }
    });

    // ボタンをウィンドウに追加

    add(imageLabel);
    add(resultLabel);
    add(messageLabel);
    add(drawButton);

    // 画面を表示
    setVisible(true);
  }

}
