public class Operator{
    public static void main(String[] args){
        //operator operand
        //binary
        //assignment
        String nama = "Mirza";
        int jumlahSks = 144;
        double ipk = 3.89;
        String username = "admin";
        String password = "admin";

        //aritmatika
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);

        //unary
        System.out.println(jumlahSks++); //tampil dulu kemudian increment
        System.out.println(++jumlahSks); //increment dulu kemudian tampil

        System.out.println(jumlahSks--); 
        //tidak bisa System.out.println(jumlahSks**); 
        //tidak bisa System.out.println(jumlahSks//); 

        //ternary
        // System.out.println(); 
        String ket = ipk > 3.5 ? "Dengan pujian" : "B aja";
        System.out.println(ket); 
        
        String usernameInputan = "zz";
        String passwordInputan = "admin";

        if(usernameInputan.equals(username)){
            if(passwordInputan.equals(password)){
                System.out.println("Berhasil"); 
            } else {
                System.out.println("Username / Password Salah"); 
            }
        } else {
            System.out.println("Username / Password Salah"); 
        }

        if(usernameInputan.equals(username) 
            && 
            passwordInputan.equals(password)){
            System.out.println("Berhasil"); 
        } else {
            System.out.println("Username / Password Salah"); 
        }

        double totalBelanja = 53000;
        double uangDiDompet = 25000;
        double angsul = 0;
        if(uangDiDompet < totalBelanja){
            System.out.println("Kurang"); 
        } else if (uangDiDompet > totalBelanja){
            angsul = uangDiDompet - totalBelanja;
            System.out.println("Cukup, angsul: " + angsul); 
        } else {
            System.out.println("Pas"); 
        }

        System.out.println(angsul);
        //scope
    }
}