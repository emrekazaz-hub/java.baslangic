public class CustomerManager {
    public void add(Customer customer){

        System.out.println(customer.customerNumber + " kaydedildi");

    }
//bulk insert - yani polimorfizm --> bircok islemi ayni anda alip cagirmak icin kullaniyoruz.
// Bunlar array lislerle oluyor. *addMutli(islemyapanclassismi[] ornekcogulisim)*
// Sonra da for dongusune sokulup ornekcogulisim cagirilir.

    public void addMultiple(Customer [] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }


}
