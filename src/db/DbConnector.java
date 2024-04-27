package db;

import Models.Task;

import java.sql.*;
import java.util.ArrayList;

public class DbConnector {
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            String login = "postgres";
            String password = "postgres";
            String url = "jdbc:postgresql://localhost:5432/db";
            connection = DriverManager.getConnection(url, login, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Task> getAllTasks() {
        ArrayList<Task> tasks = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tasks ORDER BY id");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setStatus(resultSet.getString("status"));
                task.setDeadlineDate(resultSet.getString("deadline_date"));

                tasks.add(task);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tasks;
    }
    public static void addTask(Task task){
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tasks (name, description, deadline, status) VALUES (?, ?, ?, ?, ?, ?)");
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getDeadlineDate());
            statement.setString(4, task.getStatus());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void deleteTask(int id) {
        try{

            PreparedStatement statement = connection.prepareStatement("DELETE FROM tasks WHERE id = ? ");
            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void updateTask(Task task) {

        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE tasks SET name = ?, description = ?, dedline = ?, status = ? WHERE id = ? ");
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(2, task.getDeadlineDate());
            statement.setString(3, task.getStatus());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Task getTaskById(int id){
        Task task = new Task();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tasks WHERE id = ? ");
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                task.setId(resultSet.getInt("id"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setDeadlineDate(resultSet.getString("deadline"));
                task.setStatus(resultSet.getString("status"));

                statement.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return task;
    }
}
