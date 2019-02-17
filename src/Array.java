import java.util.ArrayList;

public class Array {
    private Human human;
    private ArrayList<Human> database;

    public Array () {
        database =  new ArrayList<Human>();
    }

    public void addArray (String name){
        human = new Human(name);
        database.add(human);
        human.setNumber(database.indexOf(human));
    }

    public int searchArray (String name){
        for (Human human : database) {
            if (human.getName().equals(name)) {
                if (human.getMarried() == -1) {
                    return database.indexOf(human);
                } else {
                    System.out.println(Main.ANSI_RED + name + " состоит в браке c " + database.get(human.getMarried()).getName() + Main.ANSI_RESET);
                    return -1;
                }
            }
        }
        System.out.println(Main.ANSI_RED + name + " нет в базе" + Main.ANSI_RESET);
        return -2;
    }

    public void love(int numberM, int numberW){
        database.get(numberM).setMarried(numberW);
        database.get(numberW).setMarried(numberM);
        System.out.println(Main.ANSI_RED + database.get(numberM).getName() + " и " + database.get(numberW).getName() + " теперь состоят в браке" + Main.ANSI_RESET);
    }

    public void noLove(String name){
        for (Human human : database) {
            if (human.getName().equals(name)) {
                if (human.getMarried() >= 0){
                    int number = database.get(human.getMarried()).getNumber();
                    System.out.println(Main.ANSI_RED + human.getName() + " и " + database.get(human.getMarried()).getName() + " теперь разведены" + Main.ANSI_RESET);
                    database.get(human.getMarried()).setMarried(-1);
                    human.setMarried(-1);
                    break;
                } else {
                    System.out.println(Main.ANSI_RED + name + " не состоит в браке" + Main.ANSI_RESET);
                    break;
                }
            }
        }
        System.out.println(Main.ANSI_RED + name + " нет в базе" + Main.ANSI_RESET);
    }
}
