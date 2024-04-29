public class OperasiString{
    public static void main(String[] args){
        String kota = "Banjarbaru";
        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        //NamaClass namaObject = new Constructor()
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        System.out.println(uniskaString.toUpperCase());
        System.out.println(kota.toUpperCase());

        System.out.println(uniskaString.toLowerCase());
        System.out.println(kota.toLowerCase());

        System.out.println(uniskaString.substring(5));
        System.out.println(kota.substring(5));

        System.out.println(uniskaString.substring(0,4));
        System.out.println(kota.substring(0,4));

        String hariIni = "2024-04-22";
        String besok = "2024-04-30";
        String danSeterusnya = "2024-05-01";

        String tahun = hariIni.substring(0,4);
        String bulan = hariIni.substring(5,7);
        String tanggal= hariIni.substring(8,10);
        System.out.println(tanggal + "-" +bulan+ "-" +tahun);

        String bulanTeks = "";

        switch(bulan){
            case "01":
                System.out.println(tanggal+ " Januari " +tahun);
                bulanTeks = "Januari";
                break;
            case "02":
                System.out.println(tanggal+ " Februari "+tahun);
                bulanTeks = "Februari";
                break;
            case "03":
                System.out.println(tanggal+ " Maret " +tahun);
                bulanTeks = "Maret";
                break;
            case "04":
                System.out.println(tanggal+ " April " +tahun);
                bulanTeks = "April";
               break;
            case "05":
                System.out.println(tanggal+ " Mei " +tahun);
                bulanTeks = "Mei";
                break;
            case "06":
                System.out.println(tanggal+ " Juni " +tahun);
                bulanTeks = "Juni";
                break;
            case "07":
                System.out.println(tanggal+ " Juli " +tahun);
                bulanTeks = "Juli";
                break;
            case "08":
                System.out.println(tanggal+ " Agustus " +tahun);
                bulanTeks = "Agustus";
                break;
            case "09":
                System.out.println(tanggal+ " September " +tahun);
                bulanTeks = "September";
                break;
            case "10":
                System.out.println(tanggal+ " Oktober " +tahun);
                bulanTeks = "Oktober";
                break;
            case "11":
                System.out.println(tanggal+ " November "+tahun);
                bulanTeks = "November";
                break;
            case "12":
                System.out.println(tanggal+ " Desember "+tahun);
                bulanTeks = "Desember";
                break;
            default:
                System.out.println("Tidak Valid");
                break;

        }

        System.out.println(tanggal + " " +bulanTeks+ " " +tahun);

        System.out.println(konversiTanggal(besok));
        System.out.println(konversiTanggal(danSeterusnya));
    }

    public static String konversiTanggal(String tanggal){
        String tahun = tanggal.substring(0,4);
        String bulan = tanggal.substring(5,7);
        String hari= tanggal.substring(8,10);

        String bulanTeks = "";

        switch(bulan){
            case "01":
                bulanTeks = "Januari";
                break;
            case "02":
                
                bulanTeks = "Februari";
                break;
            case "03":
                
                bulanTeks = "Maret";
                break;
            case "04":
                
                bulanTeks = "April";
               break;
            case "05":
                
                bulanTeks = "Mei";
                break;
            case "06":
                
                bulanTeks = "Juni";
                break;
            case "07":
                
                bulanTeks = "Juli";
                break;
            case "08":
                
                bulanTeks = "Agustus";
                break;
            case "09":
                
                bulanTeks = "September";
                break;
            case "10":
                
                bulanTeks = "Oktober";
                break;
            case "11":
                
                bulanTeks = "November";
                break;
            case "12":
                
                bulanTeks = "Desember";
                break;
            default:
                return "Tidak valid";

        }

        return hari + " " +bulanTeks+ " " +tahun;
    }
}