package fortuneApp.test;

// Fortuneを継承した大吉のおみくじを表す子クラス（サブクラス）
public class Daikichi extends Fortune {
  public Daikichi() {
    super("大吉", "友達ができた", "src/fortuneApp/asset/images/daikichi.png");
  }

  @Override
  public String getName() {
    return "スーパー大吉";
  }
}
