package Inheritances.Compositon;

class Engine {
    int serialNumber;
    int power;
    String madeIn;
    String model;

    Engine() {
    }

    Engine(int serialNumber, int power, String madeIn, String model) {
        this.serialNumber = serialNumber;
        this.power = power;
        this.madeIn = madeIn;
        this.model = model;
    }

    void showEngineInfo() {
        System.out.println("------------------------------------------");
        System.out.println("Serial ID : " + serialNumber);
        System.out.println("Engine Power : " + power + " horse power");
        System.out.println("Made In:" + madeIn);
        System.out.println("Model " + model);
        System.out.println("------------------------------------------");
    }
}

class Car {
    int id;
    String carModel;
    String madeIn;
    String createdAt;
    // Has A relationship
    Engine engine;

    Car() {
        engine = new Engine(); // has a relationship
    }

    Car(int id, String carModel, String madeIn, String createdAt, Engine engine) {
        this.id = id;
        this.carModel = carModel;
        this.madeIn = madeIn;
        this.createdAt = createdAt;
        this.engine = engine;
    }

    void showCarInfo() {
        System.out.println("Card id is :" + id);
        System.out.println("Card Model is : " + carModel);
        System.out.println("Made In :" + madeIn);
        System.out.println("Created At :" + createdAt);

        engine.showEngineInfo();//

    }


}

public class Main {
    public static void main(String[] args) {

        //  new Engine().showEngineInfo(); // anonymous object !

        Car car = new Car(1001, "Tesla-KH", "Cambodia", "12.12.2025",
                new Engine(100111, 200, "Cambodia", "EngineX"));


        Car car1 = new Car(1002, "TResk", "Kh","Kong dong",new Engine( 10002 , 200, "cambodia","Hdosdii"));
//        car.engine = new Engine(); // in case , you want to update the engine
//        car.engine.power = 900;
//        car.engine.madeIn = "Kompong Som";
//        car.showCarInfo();

    }
}
