import java.util.ArrayList;
import java.util.Scanner;

public class Main {

// docker run --entrypoint "java" prod Main 1 "sadsad" 2 4
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("необходимо передать значения");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();

        boolean running = true;
        int index = 0;
        while (running) {
            int chois = Integer.parseInt(args[index]);
            index++;
            switch (chois) {
                case 1:
                    if (index < args.length) {
                        String task = args[index];
                        arrayList.add(task);
                        System.out.println("задача добавлена");
                        index++;
                    } else {
                        System.out.println("Отсутсвует описание задачи");

                    }
                    break;
                case 2:
                    if (arrayList.isEmpty()) {
                        System.out.println("Список Пуст ");

                    } else {
                        System.out.println("список задач");
                        for (int i = 0; i < arrayList.size(); i++) {
                            System.out.println((i + 1) + " . " + arrayList.get(i));
                        }
                    }
                    break;
                case 3:
                    if (index < args.length) {
                        int task = Integer.parseInt(args[index]);
                        if (task > 0 && task <arrayList.size()){
                            arrayList.remove(task-1);
                            System.out.println("задача удалена");
                            index++;
                        }else {
                            System.out.println("Некоретный номер задачи");
                        }
                    }else {
                        System.out.println("Отсутствует номер задачи");
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы");
                    running=false;
                break;
                default:
                    System.out.println("Некоретный выбор");
            }


        }

    }
}
