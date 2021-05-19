public class Main {
    public static void main(String [] args){

    IndividualCustomer engin = new IndividualCustomer();
    engin.customerNumber = "12345";

    CorporateCustomer hepsiBurada = new CorporateCustomer();
    hepsiBurada.customerNumber = "6789";

    SendikaCustomer sendikaCustomer = new SendikaCustomer();
    sendikaCustomer.customerNumber = "159753";

    CustomerManager customerManager = new CustomerManager();

    Customer[] customers = {engin, sendikaCustomer, hepsiBurada};

    customerManager.addMultiple(customers);




    }
}
