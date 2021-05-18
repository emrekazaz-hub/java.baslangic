public class main {
    public static void main(String[] args) {

        String satir = "internet subeye gir";
        double dolarDun = 8.15;
        double dolarBugun = 8.15;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(satir);
        System.out.println(dolarDun);

        if(dolarBugun<dolarDun){
            System.out.println("dolar dustu");
        }
        else if(dolarBugun == dolarDun){
            System.out.println("dolar ayni kaldi");
        }
        else{
            System.out.println("doalr yukseldi");
        }

        String[] krediler  = {"hiliz kredi","mutlu kredi","emekli kredi","ciftci"};


        for(String a : krediler){
            System.out.println(a);

        }

        for(int i=0; i<krediler.length; i=i+1){
            System.out.println(krediler[i]);

        }



    }
}
