public class Saw extends WorkTool {
    public Saw(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }
    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String use() {
        return "Saw";
    }
}
