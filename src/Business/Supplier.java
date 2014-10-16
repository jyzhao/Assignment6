/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author zhaojiyuan
 */
public class Supplier extends Person {

    private static int count = 1000;

    private int supplierID;
    private String organization;

    private ProductCatalog productCatalog;

    public Supplier() {
        productCatalog = new ProductCatalog();
        supplierID = ++count;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
  
    @Override
    public String toString() {
        return super.getFirstName();
    }

}
