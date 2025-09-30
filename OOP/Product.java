public class Product {
    private int prodCode;
    private String prodName;
    private int stockQty;
    private double unitPrice;
    private int qtyOrder;
    private double totalAmount;
    
    public Product(){
    }
    
    // Accessor
    public int getProdCode(){ return prodCode; }
    public String getProdName(){ return prodName; }
    public int getStockQty(){ return stockQty; }
    public double getUnitPrice(){ return unitPrice; }
    public int getQtyOrder(){ return qtyOrder; }
    public double getTotalAmount(){ 
        totalAmount = qtyOrder * unitPrice;
        return totalAmount;
    }
    
    // Mutator
    public void setProdCode(int prodCode){ this.prodCode = prodCode; }
    public void setProdName(String prodName){ this.prodName = prodName; }
    public void setStockQty(int stockQty){ this.stockQty = stockQty; }
    public void setUnitPrice(double unitPrice){ this.unitPrice = unitPrice; }
    public void setQtyOrder(int qtyOrder){ this.qtyOrder = qtyOrder; }
}
