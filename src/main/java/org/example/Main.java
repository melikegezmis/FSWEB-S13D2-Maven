package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int verilensayi){
        int sayi = Math.abs(verilensayi);
        String uzunluk = String.valueOf(sayi);
        String[] sayilar = uzunluk.split("");
        boolean deger = true;

            for(int i = 0; i<sayilar.length/2; i++) {
                if (!sayilar[i].equals(sayilar[sayilar.length - 1 - i])) {
                    deger = false;
                    break;
                }
            }
        return deger;
    }

    public static boolean isPerfectNumber(int sayi){
        if(sayi<0){
            return false;
        } else {
            int toplam=0;
            for(int i = 1; i<sayi; i++){
                if(sayi%i==0){
                    toplam+=i;
                }
            }
            if(toplam==sayi){
                return true;
            } else {
                return false;
            }
        }
    }

    public static String numberToWords(int sayi){
        if(sayi<0){
            return "Invalid Value";
        } else {
            String string = String.valueOf(sayi);
            String[] sayilar = string.split("");
            for(int i=0; i<sayilar.length; i++){
                switch(sayilar[i]){
                    case "0":
                        sayilar[i]="Zero";
                        break;
                    case "1":
                        sayilar[i]="One";
                        break;
                    case "2":
                        sayilar[i]="Two";
                        break;
                    case "3":
                        sayilar[i]="Three";
                        break;
                    case "4":
                        sayilar[i]="Four";
                        break;
                    case "5":
                        sayilar[i]="Five";
                        break;
                    case "6":
                        sayilar[i]="Six";
                        break;
                    case "7":
                        sayilar[i]="Seven";
                        break;
                    case "8":
                        sayilar[i]="Eight";
                        break;
                    case "9":
                        sayilar[i]="Nine";
                        break;
                }
            }
            String sonuc = String.join(" ", sayilar);
            return sonuc;
        }
    }
}
