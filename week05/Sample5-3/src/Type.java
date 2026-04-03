public class Type {

    private char code;
    private String typeName;
    private int unitPrice;
    private float taxRate;

    public Type(char code, String typeName, int unitPrice, float taxRate) {
        this.code = code;
        this.typeName = typeName;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
    }

    public char getCode() {
        return code;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public float getTaxRate() {
        return taxRate;
    }
}