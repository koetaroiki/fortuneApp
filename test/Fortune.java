package fortuneApp.test;

// おみくじの共通情報を管理する抽象クラス 親クラス（スーパークラス）
public abstract class Fortune {

  // 運勢名（大吉、中吉、小吉、吉、末吉、凶）
  private String fortuneName;
  // 運勢ごとのメッセージ
  private String message;
  // おみくじ画像のファイルパス
  private String imagePath;

  // 運勢名とメッセージを受け取って初期化するコンストラクタ
  public Fortune(String fortuneName, String message, String imagePath) {
    this.fortuneName = fortuneName;
    this.message = message;
    this.imagePath = imagePath;
  }

  // 運勢名を取得する
  public String getName() {
    return fortuneName;
  }

  // メッセージを取得する
  public String getMessage() {
    return message;
  }

  // 画像を取得
  public String getImagePath() {
    return imagePath;
  }
}