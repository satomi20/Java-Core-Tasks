package CollectionSimpleTasks.src.ComputerAccessories;

public class Computer {
    public  String processor;
    public String ram;
    public String disk;

    public Computer(String processor, String ram, String disk){
        this.processor = processor;
        this.ram = ram;
        this.disk = disk;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Processor", "RAM", "HardDisk");
        System.out.println(computer.disk +" "+ computer.ram +" "+ computer.processor);
        Power power = new Power();
        power.switchOn();
    }
}
