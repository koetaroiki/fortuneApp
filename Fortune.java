package fortuneApp;

// おみくじの共通情報を管理する抽象クラス
public abstract class Fortune {

  // 運勢名（大吉、中吉、吉、小吉、凶）
  private String fortuneName;
  // 運勢ごとのメッセージ
  private String message;

  // 運勢名とメッセージを受け取って初期化するコンストラクタ
  public Fortune(String fortuneName, String message) {
    this.fortuneName = fortuneName;
    this.message = message;
  }

  // 運勢名を取得する
  public String getName() {
    return fortuneName;
  }

  // メッセージを取得する
  public String getMessage() {
    return message;
  }
}