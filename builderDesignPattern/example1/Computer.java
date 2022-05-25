package example1;

public class Computer {
	/**mandatory*/
	private String RAM;
	private String HDD;
	private String CPU;
	
	/**optional*/
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Computer(String rAM, String hDD, String cPU, boolean isGraphicCardEnabled, boolean isBluetoothEnabled) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
		this.isGraphicCardEnabled = isGraphicCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public void setGraphicCardEnabled(boolean isGraphicCardEnabled) {
		this.isGraphicCardEnabled = isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + ", isGraphicCardEnabled="
				+ isGraphicCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
}
