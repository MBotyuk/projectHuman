public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args){

        Array array = new Array();
        Enter enter = new Enter();
        boolean condition = true;

        while (true & condition){
            System.out.println("1 - Добавить в базу; 2 - Заключить брак; 3 - Расторгнуть брак; 4 - Выход");
            System.out.print("Ваш выбор: ");

            switch(enter.resultInt()) {
                case 1:
                    System.out.println("Введите имя:");
                    array.addArray(enter.resultSrt());
                    break;

                case 2:
                    System.out.println("Введите имя супруга:");
                    String nameM = enter.resultSrt();
                    int numberM = array.searchArray(nameM);

                    if (numberM >= 0){
                        System.out.println("Введите имя супруги:");
                        String nameW = enter.resultSrt();
                        int numberW = array.searchArray(nameW);

                            if (numberW >= 0){
                                array.love(numberM, numberW);
                            }
                    }
                    break;

                case 3:
                    System.out.println("Введите имя однго из супругов:");
                    String nameMW = enter.resultSrt();
                    array.noLove(nameMW);
                    break;

                case 4:
                    condition = false;
                    System.out.println(ANSI_RED + "Приложение закрыто" + ANSI_RESET);
                    break;

                default:
                    System.out.println(ANSI_RED + "Вы ввели не допустимое значение!" + ANSI_RESET);
                    break;
            }

        }
    }
}
