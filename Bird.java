package bird;

public class Bird {
    String name;
    String color;
    float weight;

    String getName() {
        return this.name;
    }

    float getWeight() {
        return this.weight;
    }

    String getColor() {
        return this.color;
    }

    void setName(String name) {
        this.name = name;
    }

    void setWeight(float weight) {
        if(weight < 0) {
            throw new Error("Weight must be greater than zero");
        }
        this.weight = weight;
    }

    void setColor(String color) {
        this.color = color;
    }
}
