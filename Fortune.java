package fortuneApp;

public abstract class Fortune {

  private String fortuneName;
  private String message;

  public Fortune(String fortuneName, String message) {
    this.fortuneName = fortuneName;
    this.message = message;
  }

  public String getName() {
    return fortuneName;
  }

  public String getMessage() {
    return message;
  }
}