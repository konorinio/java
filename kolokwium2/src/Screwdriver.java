public class Screwdriver extends WorkTool {
    public Screwdriver(String name, int productionYear) {
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
        return "Screwdriver";
    }
}
