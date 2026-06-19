package fortuneApp;

// 部品を2行1列に配置するためにGridLayoutクラスをimport
import java.awt.GridLayout;
// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
// 文字や画像を表示するためにJLabelクラスをimport
import javax.swing.JLabel;
// 画像を表示するためにImageIconクラスをimport
import javax.swing.ImageIcon;


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
    JLabel fortuneNameLabel = new JLabel("運勢: " + fortune.getName());
    // ラベルをウィンドウに追加
    JLabel messageLabel = new JLabel("メッセージ: " + fortune.getMessage());
    // 部品を2行1列で配置する
    setLayout(new GridLayout(3, 1));
    // 選ばれたおみくじ画像を読み込む
    ImageIcon icon = new ImageIcon(fortune.getImagePath());
    // 画像を表示するラベルを作成
    JLabel imageLabel = new JLabel(icon);

    // ラベルをウィンドウに追加
    add(fortuneNameLabel);
    add(messageLabel);
    add(imageLabel);
  }
}
