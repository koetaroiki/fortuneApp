package fortuneApp.test;

// Fortuneを継承した凶のおみくじを表す子クラス（サブクラス）
public class Kyo extends Fortune {
  public Kyo() {
    super("凶", "もう一度おみくじを引いてください", "src/fortuneApp/asset/images/kyo.png");
  }
}
