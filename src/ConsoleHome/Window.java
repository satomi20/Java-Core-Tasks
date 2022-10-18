package ConsoleHome;

public class Window extends RoomObject{
  private String type = "Windows";
  private String location;

  public Window(String location) {
    this.location = location;
  }

  public int switchState() {
    int s = 1;
    if (isState()) {
      System.out.println(
          "Window is closed! Are you want to open the \"" + location + "\" window?");
      System.out.println("Type YES or NO:");
      String in = scanner.nextLine();
      if (in.equalsIgnoreCase("yes")) {
        System.out.println("Room \"" + location + "\" is opened...");
        setState(false);
      } else if (in.equalsIgnoreCase("no")) {
        s = 0;
      } else {
        invalidInput();
      }
    } else {
      System.out.println(
          "Window is opened! Are you want to close the \"" + location + "\" window?");
      System.out.println("Type YES or NO:");
      String yesOrNoInput = scanner.nextLine();
      if (yesOrNoInput.equalsIgnoreCase("yes")) {
        System.out.println("Room \"" + location + "\" is closed...");
        setState(true);
      } else if (yesOrNoInput.equalsIgnoreCase("no")) {
        s = 0;
      } else {
        invalidInput();
      }
    }
    return s;
  }

  public String state() {
    if (!isState()) {
      return "OPEN";
    } else {
      return "CLOSE";
    }
  }

  public void getInfo() {
    System.out.println("*******************************");
    System.out.println("Window location:" + location);
    System.out.println("Status: " + state());
    System.out.println("*******************************");
  }

  public String getID() {
    return location;
  }
  public String getType() {
    return type;
  }

}
