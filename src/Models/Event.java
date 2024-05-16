package Models;

import java.util.ArrayList;

public class Event {
    int id;
    String name;
    String content;
    String date;
    ArrayList<String> images;

    public Event() {
    }

    public Event(int id, String name, String content, String date,  ArrayList<String> images) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.images = images;
    }
    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", images=" + images +
                '}';
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
