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
public class ConfigureBusiness {
    public static Business initialize() {
        Business business = Business.getInstance();
        
        Supplier s0 = business.getSupplierDirectory().addNewSupplier();
        s0.setFirstName("Jiyuan");
        s0.setLastName("Zhao");
        s0.setOrganization("NEU");
        
        UserAccount ua1 = business.getUserAccountDirectory().addNewUserAccount();
        ua1.setPerson(s0);
        ua1.setRole(UserAccount.ADMIN_ROLE);
        ua1.setStatus("Active");
        ua1.setUserName("admin");
        ua1.setPassword("admin");
        
        Supplier s1 = business.getSupplierDirectory().addNewSupplier();
        s1.setFirstName("Supplier");
        s1.setLastName("One");
        s1.setOrganization("NEU");
        
        UserAccount ua2 = business.getUserAccountDirectory().addNewUserAccount();
        ua2.setPerson(s1);
        ua2.setRole(UserAccount.SUPPLIER_ROLE);
        ua2.setStatus("Active");
        ua2.setUserName("supplier1");
        ua2.setPassword("supplier1");
        
        Supplier s2 = business.getSupplierDirectory().addNewSupplier();
        s2.setFirstName("Supplier");
        s2.setLastName("Two");
        s2.setOrganization("NEU");
        
        UserAccount ua3 = business.getUserAccountDirectory().addNewUserAccount();
        ua3.setPerson(s2);
        ua3.setRole(UserAccount.SUPPLIER_ROLE);
        ua3.setStatus("Active");
        ua3.setUserName("supplier2");
        ua3.setPassword("supplier2");
        
        Customer c1 = business.getCustomerDirectory().addNewCustomer();
        c1.setFirstName("Customer");
        c1.setLastName("One");
        c1.setOrganization("NEU");
        
        UserAccount ua4 = business.getUserAccountDirectory().addNewUserAccount();
        ua4.setPerson(c1);
        ua4.setRole(UserAccount.CUSTOMER_ROLE);
        ua4.setStatus("Active");
        ua4.setUserName("customer1");
        ua4.setPassword("customer1");
        
        Customer c2 = business.getCustomerDirectory().addNewCustomer();
        c2.setFirstName("Customer");
        c2.setLastName("Two");
        c2.setOrganization("NEU");
        
        UserAccount ua5 = business.getUserAccountDirectory().addNewUserAccount();
        ua5.setPerson(c2);
        ua5.setRole(UserAccount.CUSTOMER_ROLE);
        ua5.setStatus("Active");
        ua5.setUserName("customer2");
        ua5.setPassword("customer2");
        
        return business;
    }
}
