package fortuneApp;

// 色を設定するためにColorクラスをimport
import java.awt.Color;
// 文字の種類やサイズを設定するためにFontクラスをimport
import java.awt.Font;
// 画像サイズを変更するためにImageクラスをimport
import java.awt.Image;
// ボタンのクリックイベントを扱うためにActionEventクラスをimport
import java.awt.event.ActionEvent;
// ボタンのクリックイベントを扱うためにActionListenerインターフェースをimport
import java.awt.event.ActionListener;
// 部品を上下左右中央に配置するためにBorderLayoutクラスをimport
import java.awt.BorderLayout;

// ウィンドウを作るためのJFrameクラスをimport
import javax.swing.JFrame;
// 文字や画像を表示するためにJLabelクラスをimport
import javax.swing.JLabel;
// 画像を表示するためにImageIconクラスをimport
import javax.swing.ImageIcon;
// ボタンを表示するためにJButtonクラスをimport
import javax.swing.JButton;
// 部品をグループ化するためにJPanelクラスをimport
import javax.swing.JPanel;
import javax.swing.BorderFactory;
// 部品を縦方向に並べるためにBoxLayoutクラスをimport
import javax.swing.BoxLayout;
// 乱数を生成するクラスをimport
import java.util.Random;

// おみくじアプリの画面を管理する子クラス（サブクラス）
public class FortuneApp extends JFrame {
  // ボタンが押されたときに運勢を書き換えるためのラベル
  private JLabel fortuneLabel;
  // ボタンが押されたときに画像を書き換えるためのラベル
  private JLabel imageLabel;


private Fortune[] fortunes;

// Mainから受け取った運勢情報を画面に表示するためのコンストラクタ
public FortuneApp(Fortune fortune, Fortune[] fortuneList){

    this.fortunes = fortuneList;

    // ウィンドウのタイトルを設定
    setTitle("Fortune App");
    // ウィンドウのサイズを設定
    setSize(600, 600);
    // ウィンドウを閉じたときにプログラムを終了
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // コンポーネントを縦方向に配置する
    setLayout(new BoxLayout(
        getContentPane(),
        BoxLayout.Y_AXIS
    ));

    // 画像表示用のパネルを作成
    JPanel imagePanel = new JPanel();
    // 運勢表示用のパネルを作成
    JPanel fortunePanel = new JPanel();
    // ボタン表示用のパネルを作成
    JPanel buttonPanel = new JPanel();

    // imageの余白を設定
    imagePanel.setBorder(
        BorderFactory.createEmptyBorder(
            50, 0, 0, 0
        )
    );

    // パネルの背景色を設定
    imagePanel.setBackground(
        new Color(176, 166, 237)
    );
    fortunePanel.setBackground(
        new Color(176, 166, 237)
    );
    buttonPanel.setBackground(
        new Color(176, 166, 237)
    );

    // 選ばれた運勢名とメッセージをを表示するラベルを作成
    fortuneLabel = new JLabel(
        fortune.getName()
        + " : "
        + fortune.getMessage()
    );
    // ラベルの文字サイズを24pxに設定
    fortuneLabel.setFont(new Font("MS Gothic", Font.BOLD, 24));
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
    imageLabel = new JLabel(resizeIcon);

    // 画像を中央に表示する
    imageLabel.setHorizontalAlignment(JLabel.CENTER);

    // おみくじを引き直すボタンを作成
    JButton drawButton = new JButton("もう一回引く");

    // 画像を画像用パネルに追加
    imagePanel.add(imageLabel);
    // 運勢を運勢用パネルに追加
    fortunePanel.add(fortuneLabel);
    // ボタンをボタン用パネルに追加
    buttonPanel.add(drawButton);

    // 画像パネルを上に配置
    add(imagePanel, BorderLayout.NORTH);
    // 運勢パネルを中央に配置
    add(fortunePanel, BorderLayout.CENTER);
    // ボタンパネルを下に配置
    add(buttonPanel, BorderLayout.SOUTH);

    drawButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        // ランダムなおみくじを選ぶためのRandomオブジェクトを生成
        Random random = new Random();

        // fortunes配列の添字をランダムに取得
        int index = random.nextInt(fortunes.length);

        // ランダムに選ばれたおみくじを取得
        Fortune fortune = fortunes[index];

          // 選ばれた運勢名とメッセージをラベルに表示
          // 選ばれたおみくじ画像を読み込む
          ImageIcon icon = new ImageIcon(fortune.getImagePath());

          // ImageIconからImageを取得する
          Image image = icon.getImage();

          // 300px x 300px にリサイズ
          Image resizeImage =
              image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);

          // リサイズ後のImageからImageIconを生成する
          ImageIcon resizeIcon = new ImageIcon(resizeImage);

          // 画像を更新する
          imageLabel.setIcon(resizeIcon);

          // 選ばれた運勢名とメッセージをラベルに表示
          fortuneLabel.setText(
              fortune.getName()
              + " : "
              + fortune.getMessage()
          );
      }
    });
  }
}
