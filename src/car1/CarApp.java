package car1;

public class CarApp {
	// CarApp.java
	
	    public static void main(String[] args) {
	        // Креирање на инстанца од Car користејќи го дефолтниот конструктор
	        car defaultCar = new car();

	        // Креирање на инстанца од Car користејќи го параметризираниот конструктор
	        car paramCar = new car("Toyota", "Camry", 2022);

	        // Печатење на деталите за двете автомобили
	        System.out.println("Default Car: " + defaultCar);
	        System.out.println("Parameterized Car: " + paramCar);
	    }
	}