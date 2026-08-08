package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public void setOn() {
        for (Sensor sensor: this.sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    public int read() throws IllegalStateException{
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }

        int reading = (int) this.sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        this.readings.add(reading);

        return reading;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
