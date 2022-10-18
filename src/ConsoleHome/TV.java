package ConsoleHome;

public class TV extends RoomObject {
  private String type = "TV";
  private String brandName;
  private boolean state = false;

  public TV(String brandName) {
    this.brandName = brandName;
  }

  public int switchState() {
    int result = 1;
    if (isState()) {
      System.out.println(
          "TV is ON! Are you want to power OFF TV \"" + brandName + "\"?");
      System.out.println("Type YES or NO:");
      String in = scanner.nextLine();
      if (in.equalsIgnoreCase("yes")) {
        System.out.println("TV \"" + brandName + "\" is OFF");
        setState(false);
      } else if (in.equalsIgnoreCase("no")) {
        result = 0;
      } else {
        invalidInput();
      }
    } else {
      System.out.println(
          "TV is OFF! Are you want to power ON TV \"" + brandName + "\"?");
      System.out.println("Type YES or NO:");
      String in = scanner.nextLine();
      if (in.equalsIgnoreCase("yes")) {
        System.out.println("TV \"" + brandName + "\" is ON");
        setState(true);
      } else if (in.equalsIgnoreCase("no")) {
        result = 0;
      } else {
        invalidInput();
      }
    }
    return result;
  }

  public String state() {
    if (!isState()) {
      return "OFF";
    } else {
      return "ON";
    }
  }

  public void getInfo() {
    System.out.println("*******************************");
    System.out.println("Brandname this TV :" + brandName);
    System.out.println("Status: " + state());
    System.out.println("*******************************");
  }

  public String getID() {
    return brandName;
  }

  public String getType() {
    return type;
  }

}
