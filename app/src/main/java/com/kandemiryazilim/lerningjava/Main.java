package com.kandemiryazilim.lerningjava;

public class Main {

    public static void main(String[] args){

        //System.out.println(); kısaltılmış hali sout

        //Değişkenler
        //integer(int) En çok kullanılan veri tipidir. 32 bitlik veri tipi, -2.147.483.648 ile 2.147.483.647 arasında bir değer alabilir.

        int a=5;
        int b=9;
        System.out.println(a+b);

        //Double veri tipi 64 bitlik büyüklüğe sahiptir ve 4.9×10^-324 ile 1.8×10^308 arasında bir değer tanımlanabilir.

        double e=10.9;
        double f=11.19;
        System.out.println(e+f);

        //String  değişkenlerine atanan değerler (metinler) çift tırnak  (" ")  içine yazılırlar.

        String name = "ilayda";
        String surname = "kandemir";
        String fullname = name + surname;
        System.out.println(fullname);

        //Float float veri tipi 32 bitlik büyüklüğe sahiptir.Alabileceği sayı değeri aralığı; hem pozitif hem de negatif yönde olmak üzere ± 1.5 e?45 ile ± 3.4 e38 arasındadır.

        float c=10.0f;
        float d=4.5f;
        System.out.println(c+d);

        //boolean sadece true or false değerlerini verir.
        boolean isAlive = true;
        isAlive=false;
        System.out.println(isAlive);

        //dairenin çevresini hesaplama
        double pi=3.14;
        int r=5;
        System.out.println(2*r*pi);
    }

}
