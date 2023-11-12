public class punya_saya {
    public static void main(String[] args) {
//        for (int x =1;x < 15 ; x++){
//        System.out.println(x);}
        String status;
        for (int angka = 10; angka < 20; angka++){
            if (angka % 2 == 0){
                status = "angka genap";
            }else{
                status = "angka ganjil";
            }
            System.out.println(angka + " adalah " + status);
        }
    }
}
