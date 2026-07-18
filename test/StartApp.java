package fortuneApp.test;

// 部品を細かく配置するためにGridBagLayoutをimport
import java.awt.GridBagLayout;
// GridBagLayoutの配置設定をするためにGridBagConstraintsをimport
import java.awt.GridBagConstraints;
// 余白や配置位置を設定するためにInsetsをimport
import java.awt.Insets;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;

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

// 文字の種類やサイズを設定するためにFontクラスをimport
import java.awt.Font;

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

    // GridBagLayoutで自由に配置する
    setLayout(new GridBagLayout());
    // 配置設定用のオブジェクトを作成
    GridBagConstraints gbc = new GridBagConstraints();
    // 部品同士の余白を設定
    gbc.insets = new Insets(10, 10, 10, 10);
    // 横方向中央寄せ
    gbc.anchor = GridBagConstraints.CENTER;

    // おみくじを引くボタンを作成
    JButton drawButton = new JButton("おみくじを引く");
    // おみくじボタンを横中央にする
    drawButton.setAlignmentX(CENTER_ALIGNMENT);
    // おみくじ画像を表示するラベル
    JLabel imageLabel = new JLabel();
    // 起動時に表示する初期画像を読み込む
    imageLabel.setIcon(createResizeIcon("src/fortuneApp/asset/images/start.png"));
    // 画像を横中央にする
    imageLabel.setAlignmentX(CENTER_ALIGNMENT);
    // おみくじを表示するラベル（初期値は何も表示しない）
    JLabel resultLabel = new JLabel(" ");
    // おみくじ結果の文字サイズを変更
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));

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
        imageLabel.setIcon(
            createResizeIcon(resultFortune.getImagePath()));
        // 画像を横中央にする
        imageLabel.setAlignmentX(CENTER_ALIGNMENT);

        // 選ばれた運勢名とメッセージを画面に表示
        resultLabel.setText(
            resultFortune.getName()
                + "："
                + resultFortune.getMessage());
        // 運勢名を横中央にする
        resultLabel.setAlignmentX(CENTER_ALIGNMENT);
      }
    });

    // 画像を1行目に配置
    gbc.gridy = 0;
    add(imageLabel, gbc);

    // 運勢名とメッセージを2行目に配置
    gbc.gridy = 1;
    add(resultLabel, gbc);
    // メッセージを3行目に配置
    // ボタンを3行目に配置
    gbc.gridy = 2;
    add(drawButton, gbc);

    // 画面を表示
    setVisible(true);
  }

  // 画像を読み込み、300×300にリサイズして返すメソッド
  public ImageIcon createResizeIcon(String path) {
    // 画像を読み込む
    ImageIcon icon = new ImageIcon(path);

    // ImageIconからImageを取得
    Image image = icon.getImage();

    // 300×300にリサイズ
    Image resizeImage = image.getScaledInstance(
        300,
        300,
        Image.SCALE_SMOOTH);

    // リサイズした画像をImageIconにして返す
    return new ImageIcon(resizeImage);
  }

}
