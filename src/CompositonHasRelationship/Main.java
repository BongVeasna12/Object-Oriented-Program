package CompositonHasRelationship;

 class Engine {
     protected int serialNumber;
     protected String  model;
     protected  String brand;
     protected  String made_in ;
    Engine (){

    }
    Engine(int serialNumber, String model, String brand, String made_in){
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
        this.made_in = made_in;
    }

    void showEngineInfo(){
        System.out.println("---------------------------------");
        System.out.println("SerialNumber is : "+ serialNumber);
        System.out.println("Model Car is : "+ model);
        System.out.println("Brand Car is : "+ brand);
        System.out.println("Made_In Car is :"+ made_in);
        System.out.println("---------------------------------");
    }
}

 class  Car{
    protected int id;
    protected  String model;
    protected String made_in;
    protected String created_by;
    protected Engine engine;

    Car(){
      engine = new Engine();
    }
    Car(int id, String model, String made_in, String created_by, Engine engine){
        this.id = id;
        this.model = model;
        this.made_in = made_in;
        this.created_by  = created_by;
        this.engine = engine;
    }
    void showCarInfo(){
        System.out.println("----------------------------------");
        System.out.println("Car ID is : "+ id);
        System.out.println("Car Model is:"+ model);
        System.out.println("Car Made In is :"+ made_in);
        System.out.println("Car Created By is :" + created_by);
        engine.showEngineInfo();
        System.out.println("----------------------------------");
    }
}

public class  Main{
    public static void main(String[] args) {
        Car car = new Car(109,"model","Cabodia","Khmer",
                new Engine(1002,"Tesk","Tesaka","Cambodia"));
                car.showCarInfo();
    }
}
