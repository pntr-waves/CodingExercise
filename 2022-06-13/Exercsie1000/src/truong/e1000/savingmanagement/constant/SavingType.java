package truong.e1000.savingmanagement.constant;

public enum SavingType {
    TRADITIONAL("Traditional"), HIGH_YIELD("High Yield"), MONEY_MARKET("Money Market"), CD("CD"), CASH("Cash"), SPECIALTY("specialty");
    
    private String type;
    
    SavingType (String type) {
        this.type = type;
    }
    
    public void setType (String type) {
        this.type = type;
    }
    
    public String getType () {
        return this.type;
    }
}
