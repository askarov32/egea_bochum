package Models;

public class News {
    int id;
    String name;
    String content;

    public News(int id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public News() {
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
}
