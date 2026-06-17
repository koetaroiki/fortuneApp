package fortuneApp;

// Fortuneを継承した凶のおみくじを表す子クラス（サブクラス）
public class Kyo extends Fortune {
  public Kyo() {
    super("凶", "もう一度おみくじを引く", "asset/images/kyo.png");
  }
}
