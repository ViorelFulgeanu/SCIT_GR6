package Sales;

public class SalesRepresentative {

    private String name;
    private Integer numberOfSales;
    private Integer valueOfProduct;
    private Integer totalValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(Integer numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public Integer getValueOfProduct() {
        return valueOfProduct;
    }

    public void setValueOfProduct(Integer valueOfProduct) {
        this.valueOfProduct = valueOfProduct;
    }

    public Integer getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
    }
}
