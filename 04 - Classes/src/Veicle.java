public class Veicle {
    String type;
    String model;
    String color;
    int tankCapacity;
    
    Veicle() {}

    Veicle(String type, String model, String color, int tankCapacity) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.tankCapacity = tankCapacity;
    }

    void setType(String type) { this.type = type; }
    String getType() { return type; }

    void setModel(String model) { this.model = model; }
    String  getModel() { return model; }

    void setColor(String color) { this.color = color; }
    String getColor() { return color; }

    void setTankCapacity(int tankCapacity) { this.tankCapacity = tankCapacity; }
    int getTankCapacity() { return tankCapacity; }

    double fullTankPrice(double gasPrice) {
        return tankCapacity * gasPrice;
    }

}
