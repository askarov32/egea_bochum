package Tasks;

import java.util.ArrayList;

public class Order {
    public String name;
    public String surname;
    public String food;

    public Order(String name, String surname, String food) {
        this.name = name;
        this.surname = surname;
        this.food = food;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

}
