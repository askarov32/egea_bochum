package db;

import Models.Event;
import Models.News;

import java.sql.*;
import java.util.ArrayList;

public class DbConnector {
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            String login = "postgres";
            String password = "postgres";
            String url = "jdbc:postgresql://localhost:5432/egea";
            connection = DriverManager.getConnection(url, login, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<News> getAllNews() {
        ArrayList<News> news = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM news ORDER BY id");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                News news1 = new News();
                news1.setId(resultSet.getInt("id"));
                news1.setName(resultSet.getString("name"));
                news1.setContent(resultSet.getString("content"));
                news.add(news1);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return news;
    }
    public static void addNews(News news){
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO news (name, content) VALUES (?, ?)");
            statement.setString(1, news.getName());
            statement.setString(2, news.getContent());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void deleteNews(int id) {
        try{

            PreparedStatement statement = connection.prepareStatement("DELETE FROM news WHERE id = ? ");
            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void updateNews(News news) {

        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE news SET name = ?, content = ? WHERE id = ? ");
            statement.setString(1, news.getName());
            statement.setString(2, news.getContent());
            statement.setInt(3, news.getId());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static News getNewsById(int id){
        News news = new News();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM news WHERE id = ? ");
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                news.setId(resultSet.getInt("id"));
                news.setName(resultSet.getString("name"));
                news.setContent(resultSet.getString("content"));

                statement.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return news;
    }

    public static ArrayList<Event> getAllEvents() {
        ArrayList<Event> events = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM events ORDER BY id ");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Event event = new Event();
                event.setId(resultSet.getInt("id"));
                event.setName(resultSet.getString("name"));
                event.setContent(resultSet.getString("content"));
                events.add(event);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return events;
    }
    public static void addEvent(Event event){
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO events (name, content) VALUES (?, ?) ");
            statement.setString(1, event.getName());
            statement.setString(2, event.getContent());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void deleteEvent(int id) {
        try{

            PreparedStatement statement = connection.prepareStatement("DELETE FROM events WHERE id = ? ");
            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void updateEvent(Event event) {

        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE events SET name = ?, content = ? WHERE id = ? ");
            statement.setString(1, event.getName());
            statement.setString(2, event.getContent());
            statement.setInt(3, event.getId());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Event  getEventById(int id){
        Event event = new Event();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM events WHERE id = ? ");
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                event.setId(resultSet.getInt("id"));
                event.setName(resultSet.getString("name"));
                event.setContent(resultSet.getString("content"));

                statement.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return event;
    }
}
