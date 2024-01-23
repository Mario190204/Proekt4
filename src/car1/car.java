package car1;

public class car {
	    private String make;
	    private String model;
	    private int year;

	    // Дефолтен конструктор
	    public car() {
	        this.make = "Unknown";
	        this.model = "Unknown";
	        this.year = 2023;
	    }

	    // Параметризиран конструктор
	    public car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    // Getter методи (не се барани во задачата, но добро е да бидат)
	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    // Преоптоварување на методот toString() за печатење на објектот
	    @Override
	    public String toString() {
	        return "Car{" +
	                "make='" + make + '\'' +
	                ", model='" + model + '\'' +
	                ", year=" + year +
	                '}';
	    }
	}
	 
	    
	
	
