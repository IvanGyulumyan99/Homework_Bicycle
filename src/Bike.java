public class Bike {
    private String name;
    private String type;
    private int size;
    private int speed = 0;
    private String color;
    private boolean hasBottlePlace;
    private String brakeType;
    private boolean hasBrake;
    private float price;
    private static final int MAX_SPEED = 70;
    private String direction = "North";

    public Bike(String name, String type, int size, String color,
                String brakeType, float price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.color = color;
        this.brakeType = brakeType;
        this.price = price;
        System.out.println("We create a bike with name - " + name + ", type - " + type +
                ", size - " + size + "\"," + "\n" + " color - " + color + ", brake type - " + brakeType +
                ", price - " + price + "$");

    }

    public Bike() {
        name = "default";
        type = "default";
        size = 0;
        color = "default";
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasBottlePlace() {
        return hasBottlePlace;
    }

    public void setHasBottlePlace(boolean hasBottlePlace) {
        this.hasBottlePlace = hasBottlePlace;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public boolean isHasBrake() {
        return hasBrake;
    }

    public void setHasBrake(boolean hasBrake) {
        this.hasBrake = hasBrake;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void start() {
        direction = "North";
        System.out.println("Starting with speed: " + speed);
    }

    public void stop() {
        while (speed > 0) {
            pressBreak();
        }
        System.out.println("Stopped");
    }

    public void currentDirection() {
        System.out.println("Current direction is: " + direction);
    }


    public void pressBreak() {
        System.out.println("Break is pressed on speed: " + speed);
        if (hasBrake) {
            if (speed > 40) {
                speed -= 5;
            } else if (speed > 30) {
                speed -= 4;
            } else if (speed > 20) {
                speed -= 3;
            } else if (speed > 10) {
                speed -= 2;
            } else {
                speed--;
            }
        }
        System.out.println("Speed breaked to: " + speed);
    }

    public void accelerate() {
        System.out.println("Accelerate on speed: " + speed);
        if (speed < MAX_SPEED) {
            if (speed > 40) {
                speed += 1;
            } else if (speed > 30) {
                speed += 2;
            } else if (speed > 20) {
                speed += 3;
            } else if (speed > 10) {
                speed += 4;
            } else {
                speed += 5;
            }
        }
        System.out.println("Accelerate to: " + speed + ", direction: " + direction);
    }

    public void turnLeft() {
        switch (direction) {
            case "North":
                direction = "West";
                break;
            case "West":
                direction = "South";
                break;
            case "South":
                direction = "East";
                break;
            case "East":
                direction = "North";
                break;
        }
        System.out.println("Turned left, current direction is: " + direction);

    }

    public void turnRight() {
        switch (direction) {
            case "North":
                direction = "East";
                break;
            case "East":
                direction = "South";
                break;
            case "South":
                direction = "West";
                break;
            case "West":
                direction = "North";
                break;
        }
        System.out.println("Turned right, current direction is: " + direction);

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Has bottle place?: " + hasBottlePlace);
        System.out.println("Brake type: " + brakeType);
        System.out.println("Has brake?: " + hasBrake);
        System.out.println("Price: " + price);
        System.out.println("Direction: " + direction);
    }

    public static void main(String[] args) {
        // Bike stels = new Bike("stels", "mountain", 19,
        //  "black", "v-brake", 150);

        Bike merida = new Bike();
        merida.setBrakeType("disc");
        merida.setColor("red");
        merida.setPrice(200);
        merida.setName("Merida");
        merida.setType("mountain");
        merida.setHasBottlePlace(true);
        merida.setHasBrake(true);
        merida.setSize(19);
        merida.setDirection("still");
        System.out.println("Name - " + merida.getName() + ", color - " + merida.getColor() +
                ", brake type - " + merida.getBrakeType() + ", price - " + merida.getPrice());
        merida.start();
        merida.accelerate();
        merida.accelerate();
        merida.currentDirection();
        merida.setDirection("West");
        merida.turnLeft();
        merida.turnLeft();
        merida.turnLeft();
        merida.turnLeft();
        merida.turnRight();
        merida.turnRight();
        merida.turnRight();
        merida.turnRight();
        merida.printInfo();
    }
}
