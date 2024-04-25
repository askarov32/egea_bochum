package db;

import Models.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DbManager {
    public static ArrayList<Task> tasks = new ArrayList<>();
    private static int id = 5;
    private static Connection connection;


//    static {
//        tasks.add(new Task(1, "Создать WEB приложение на JAVA EE", "Нужно создать собвстенное приложение на JavaEE", "23.10.2021", true));
//        tasks.add(new Task(2, "Убраться дома и купить продукты", "Купить молоко, масло, хлеб и овощи", "25.10.2021", true));
//        tasks.add(new Task(3, "Выполнить все домашние задания", "Решить 35 дифференциальных уравненйи", "30.10.2021", false));
//        tasks.add(new Task(4, "Записаться на качку", "Купить абонемент на 15 тренировок в месяц", "09.11.2021", false));
//        tasks.add(new Task(5, "Учить итальянский", "Закончить два курса в Duolingo", "23.01.2023", false));
//
//    }

    public static Task getTask(int id){
        return tasks.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public static ArrayList<Task> getAllTask(){
        return tasks;
    }

    public static void deleteTask(int id){
        tasks.remove(id);
    }
    public static void updateTask(Task task) {

        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE tasks SET " +
                    "name = ?, description = ?, status = ?, deadline = ?  WHERE id = ? ");

            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getStatus());
            statement.setString(4, task.getDeadlineDate());
            statement.setInt(5, task.getId());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
