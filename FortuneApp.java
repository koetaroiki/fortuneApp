package fortuneApp;

// 部品の位置を配置するためにGridLayoutクラスをimport
import java.awt.GridLayout;
// 画像サイズを変更するためにImageクラスをimport
import java.awt.Image;

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

    // 部品を2行1列で配置する
    setLayout(new GridLayout(2, 1));
  
    // 選ばれた運勢名とメッセージをを表示するラベルを作成
    JLabel fortuneLabel = new JLabel(
        "運勢: " + fortune.getName()
        + "メッセージ: "
        + fortune.getMessage()
    );
    // 運勢とメッセージを中央に表示させる
    fortuneLabel.setHorizontalAlignment(JLabel.CENTER);

    // 選ばれたおみくじ画像を読み込む
    ImageIcon icon = new ImageIcon(fortune.getImagePath());

    // ImageIconからImageを取得する
    Image image = icon.getImage();
    // 300px x 300px にリサイズ
    Image resizeImage =image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
    // リサイズ後のImageからImageIconを生成する
    ImageIcon resizeIcon = new ImageIcon(resizeImage);

    // 画像を表示するラベルを作成
    JLabel imageLabel = new JLabel(resizeIcon);
    // 画像を中央に表示する
    imageLabel.setHorizontalAlignment(JLabel.CENTER);


    // ラベルをウィンドウに追加
    add(imageLabel);
    add(fortuneLabel );
  }
}
