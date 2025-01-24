public class PressureSensor implements Sensor{
    private Sensor sensor;
    public PressureSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double readValue() {
        return 0;
    }

    @Override
    public String getStatus() {
        return "";
    }

    @Override
    public void reset() {
        return;
    }
}
