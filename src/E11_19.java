import java.util.ArrayList;
import java.util.Scanner;

public class E11_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfObjects;
        do {
            System.out.print("输入物品个数：");
            numberOfObjects = input.nextInt();
        } while (numberOfObjects <= 0);
        System.out.println("输入这" + numberOfObjects + "件物品的体积：");
        ArrayList<Integer> volumeOfObjects = new ArrayList<>();
        for (int i = 0; i < numberOfObjects; i++) {
            int x = input.nextInt();
            volumeOfObjects.add(x);
        }
        ArrayList<Box> boxes = new ArrayList<>();
        outer:
        for (int i = 0; i < numberOfObjects; ) {
            for (Box box : boxes) {
                if (volumeOfObjects.get(i) <= box.getRemainingVolume()) {
                    box.add(volumeOfObjects.get(i), volumeOfObjects.get(i));
                    i++;
                    continue outer;
                }
            }
            boxes.add(new Box());
        }
        System.out.println("箱子个数为：" + boxes.size());
        for (Box box : boxes) {
            System.out.println(box.getContents());
        }
    }
}

class Box {
    final int capacity;
    private final ArrayList<Object> contents;
    private int x = 0;

    public Box(int capacity) {
        this.capacity = capacity;
        contents = new ArrayList<>();
    }

    public Box() {
        this(10);
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(int volume, Object object) {
        x += volume;
        contents.add(object);
    }

    public int getRemainingVolume() {
        return capacity - x;
    }

    public ArrayList<Object> getContents() {
        return contents;
    }
}