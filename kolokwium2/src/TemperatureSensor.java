public class TemperatureSensor implements Sensor {
    private Sensor sensor;
    public TemperatureSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double readValue() {
        return 0.0;
    }

    @Override
    public String getStatus() {
        return "";
    }

    @Override
    public void reset(){
        return;
    }
}
