package db;

import Models.Event;
import Models.News;
import Models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

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
                news1.setDate(resultSet.getString("date"));
                String imagesString = resultSet.getString("images");

                if(imagesString != null && !imagesString.isEmpty()) {
                    String[] imageUrls = imagesString.split(",");
                    ArrayList<String> images = new ArrayList<>(Arrays.asList(imageUrls));
                    news1.setImages(images);
                }
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
            PreparedStatement statement = connection.prepareStatement("INSERT INTO news (name, content, date, images) VALUES (?, ?, ?, ?)");
            statement.setString(1, news.getName());
            statement.setString(2, news.getContent());
            statement.setString(3, news.getDate());
            String imagesString = String.join(",", news.getImages());
            statement.setString(4, imagesString);
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
            PreparedStatement statement = connection.prepareStatement("UPDATE news SET name = ?, content = ?, date = ?, images = ? WHERE id = ? ");
            statement.setString(1, news.getName());
            statement.setString(2, news.getContent());
            statement.setString(3, news.getDate());
            String imagesString = String.join(",", news.getImages());
            statement.setString(4, imagesString);
            statement.setInt(5, news.getId());

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
                news.setDate(resultSet.getString("date"));
                String imagesString = resultSet.getString("images");
                if(imagesString != null && !imagesString.isEmpty()) {
                    String[] imageUrls = imagesString.split(",");
                    ArrayList<String> images = new ArrayList<>(Arrays.asList(imageUrls));

                    news.setImages(images);
                }
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
                event.setDate(resultSet.getString("date"));
                String imagesString = resultSet.getString("images");
                if(imagesString != null && !imagesString.isEmpty()) {
                    String[] imageUrls = imagesString.split(",");
                    ArrayList<String> images = new ArrayList<>(Arrays.asList(imageUrls));

                    event.setImages(images);
                }
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
            PreparedStatement statement = connection.prepareStatement("INSERT INTO events (name, content, date, images) VALUES (?, ?, ?, ?) ");
            statement.setString(1, event.getName());
            statement.setString(2, event.getContent());
            statement.setString(3, event.getDate());
            String imagesString = String.join(",", event.getImages());
            statement.setString(4, imagesString);

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
            PreparedStatement statement = connection.prepareStatement("UPDATE events SET name = ?, content = ?, date = ?, images = ? WHERE id = ? ");
            statement.setString(1, event.getName());
            statement.setString(2, event.getContent());
            statement.setString(3, event.getDate());
            String imagesString = String.join(",", event.getImages());
            statement.setString(4, imagesString);
            statement.setInt(5, event.getId());

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
                event.setDate(resultSet.getString("date"));
                String imagesString = resultSet.getString("images");
                if(imagesString != null && !imagesString.isEmpty()) {
                    String[] imageUrls = imagesString.split(",");
                    ArrayList<String> images = new ArrayList<>(Arrays.asList(imageUrls));

                    event.setImages(images);
                }

                statement.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return event;
    }
    public static void addUser(User user) {

        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (email, " +
                    "password, role_id) VALUES (?, ?, ?)");
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setInt(3, user.getRole_id());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                user.setEmail(resultSet.getString("email"));
                users.add(user);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
    public static User getUserById(int authorId) {
        User user = new User();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ? ");
            statement.setInt(1, authorId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFull_name(resultSet.getString("full_name"));
                user.setPassword(resultSet.getString("password"));

                statement.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    public static User getUserByEmail(String email) {
        User user = new User();

        try {

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE email = ? ");
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFull_name(resultSet.getString("full_name"));
                user.setPassword(resultSet.getString("password"));
                user.setRole_id(resultSet.getInt("role_id"));

                statement.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return user;
    }
}
