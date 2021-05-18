public class Main {
    public static void main(String[] args) {

        // classlar iki cesittir : 1) deger, bilgi tutan (Product ve Category bunlara ornek).
        //                         2) islem tutan islem yapan classlar --> metodlarla yapilir

        //----------------------------------------------------------------------------------------------------------------------------------

        Product product1 = new Product(1,"Lenovo V14", 15000, "16 gb ram");

        Product product2 = new Product(3, "Lenovo V15", 16000, "32 gb ram");

        //ister yukardakileri ister alttakileri kullan ikisi de ayni yukardaki islevsel ve kendi java clasi icerisinde
        //public halinde belirlenip() alt kisimda this.  ile tek tek cagirip kendisine esitlenir.(product java icerisindeki islemler)
        // this --> clasta tutulan ana id,name falan
        // esitledigin ise --> kendi classindaki --> public Product(parantez icerisindekilerin maindeki halleri)...

        Product product3 = new Product();
        product3.id = 3;
        product3.detail ="8 gb ram";
        product3.name = "HP 5";
        product3.unitPrice = 10000;


        Product[] products = {product1,product2,product3};
        System.out.println(products.length);

        for(Product product : products){
            System.out.println(product.name);
        }

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bahce";



        ProdctManager prodctManager = new ProdctManager();
        prodctManager.addToCart(product1);
        prodctManager.addToCart(product2);
        prodctManager.addToCart(product3);





























    }
}
