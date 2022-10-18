package ConsoleHome;

public class Main {

  RoomObject[][] roomObjects;
  static InputReader inputReader = InputReader.getInstance();

  public Main(RoomObject[][] roomObjects) {
    this.roomObjects = roomObjects;
  }

  public static void main(String[] args) {
    Main main = new Main(new RoomObject[][]{{new TV("LG"), new TV("SONY"), new TV("SHARP")},
        {new Door(201), new Door(203), new Door(205), new Door(207)},
        {new Window("Left"), new Window("Right")}});
    main.selectType();
  }

  private void selectType() {
    while (true) {
      System.out.println("Hi! In this room is:");
      for (int i = 0; i < roomObjects.length; i++) {
        System.out.println(
            i + 1 + "." + roomObjects[i][0].getType() + " - " + roomObjects[i].length);
      }
      System.out.println("Please, make your choice and input numb1er of type:");
      int selectTypeInput = inputReader.readBetweenMinAndMax(0, roomObjects.length);
      System.out.println("");
      System.out.println(roomObjects[selectTypeInput - 1][0].getType() + ":");
      System.out.println("");
      selectItem(selectTypeInput);
    }
  }

  private void selectItem(int selectTypeInput) {
    while (true) {
      for (int i = 0; i < roomObjects[selectTypeInput - 1].length; i++) {
        System.out.println(
            i + 1 + "." + roomObjects[selectTypeInput - 1][i].getID() + " state : " + roomObjects[
                selectTypeInput
                    - 1][i].state());
      }
      System.out.println("Make your choice, or input 0 for previous menu: ");
      int selectItemInput = inputReader.readBetweenMinAndMax(0,
          roomObjects[selectTypeInput - 1].length);
      if (selectItemInput == 0) {
        break;
      } else {
        selectAction(selectTypeInput, selectItemInput);
      }
    }
  }

  public void selectAction(int selectTypeInput, int selectItemInput) {
    while (true) {
      System.out.println("");
      System.out.println(
          roomObjects[selectTypeInput - 1][0].getType() + " \"" + roomObjects[selectTypeInput
              - 1][selectItemInput - 1].getID() + "\", state: " + roomObjects[selectTypeInput
              - 1][selectItemInput - 1].state());
      System.out.println("");
      System.out.println("For get info input: 1");
      System.out.println("For switch state input: 2");
      System.out.println("For exit input: 0");

      int selectActionInput = inputReader.readBetweenMinAndMax(0, 2);
      if (selectActionInput == 0) {
        break;
      } else if (selectActionInput == 1) {
        roomObjects[selectTypeInput - 1][selectItemInput - 1].getInfo();
      } else {
        roomObjects[selectTypeInput - 1][selectItemInput - 1].switchState();
      }
    }
  }
}


