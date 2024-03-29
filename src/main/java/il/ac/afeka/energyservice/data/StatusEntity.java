package il.ac.afeka.energyservice.data;

import java.util.Arrays;

public class StatusEntity {
	private boolean isOn;
	private int brightness;
	private int[] colorRGB;
	private float currentPowerInWatts;

	public StatusEntity() {}

	public boolean getIsOn() {
		return isOn;
	}

	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public int[] getColorRGB() {
		return colorRGB;
	}

	public void setColorRGB(int[] colorRGB) {
		this.colorRGB = colorRGB;
	}

	public float getCurrentPowerInWatts() {
		return currentPowerInWatts;
	}

	public void setCurrentPowerInWatts(float currentPowerInWatts) {
		this.currentPowerInWatts = currentPowerInWatts;
	}

	@Override
	public String toString() {
		return "StatusEntity{" +
				"isOn=" + isOn +
				", brightness=" + brightness +
				", colorRGB=" + Arrays.toString(colorRGB) +
				", currentPowerInWatts=" + currentPowerInWatts +
				'}';
	}
}
