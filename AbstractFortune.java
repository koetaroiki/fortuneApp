package fortuneApp;

public abstract class AbstractFortune {

  private String name;
  private String message;

  public AbstractFortune(String name, String message) {
    this.name = name;
    this.message = message;
  }

  public String getName() {
    return name;
  }

  public String getMessage() {
    return message;
  }
}