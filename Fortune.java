package fortuneApp;

public abstract class Fortune {

  private String FortuneName;
  private String message;

  public Fortune(String FortuneName, String message) {
    this.FortuneName = FortuneName;
    this.message = message;
  }

  public String getName() {
    return FortuneName;
  }

  public String getMessage() {
    return message;
  }
}