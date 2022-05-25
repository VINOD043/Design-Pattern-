package example1;

public class Runner {

	public static void main(String[] args) {
		ComputerBuilder computerBuilder = new ComputerBuilder();
		computerBuilder.setCPU("2GHz");
		computerBuilder.setHDD("500 GB");
		computerBuilder.setRAM("8 GB");
		
		Computer computer = computerBuilder.getComputer();
		System.out.println(computer);
	}

}
