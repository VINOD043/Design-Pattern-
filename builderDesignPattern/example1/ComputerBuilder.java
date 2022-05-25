package example1;

public class ComputerBuilder {
	/**mandatory*/
	private String RAM;
	private String HDD;
	private String CPU;
	
	/**optional*/
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	public ComputerBuilder setRAM(String RAM) {
		this.RAM = RAM;
		return this;
	}
	public ComputerBuilder setHDD(String HDD) {
		this.HDD = HDD;
		return this;
	}
	public ComputerBuilder setCPU(String CPU) {
		this.CPU = CPU;
		return this;
	}
	public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
		this.isGraphicCardEnabled = isGraphicCardEnabled;
		return this;
	}
	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}
	
	public Computer getComputer() {
		return new Computer(RAM, HDD, CPU, isGraphicCardEnabled, isBluetoothEnabled);
	}
}
