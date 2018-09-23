
public class Vehicle {
	private String model;
	private String[] features;

	public Vehicle(String model, String...features) {//var-args
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
	
		Vehicle alto = new Vehicle("Alto",  "Power Steering", "Power Window");

		Vehicle jazz = new Vehicle("Jazz",  "ABS", "Pano Roof", "Keyless", "Airbags");

		alto.specs();
		jazz.specs();

	}

}
