package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	    zad3a();
	    zad3b();
	    zad3c();
    }

    static void zad3a() throws FileNotFoundException {
        int licznik,mianownik,x,y;
        File plik = new File("ulamki.txt");
        Scanner odczyt = new Scanner(plik);
        StringBuffer buffer = new StringBuffer();

        while (odczyt.hasNextLine()) {
            licznik=odczyt.nextInt();
            mianownik=odczyt.nextInt();
            x=licznik;
            y=mianownik;
            while(x!=y){
                if(x>y) x=x-y;
                else y=y-x;
            }
            licznik=licznik/x;
            mianownik=mianownik/x;
            buffer.append(licznik+" "+mianownik+System.lineSeparator());
        }
        odczyt.close();

        PrintWriter zapis = new PrintWriter("wynik.txt");
        zapis.println(buffer);
        zapis.close();
    }

    static void zad3b() throws IOException {
        int licznik,mianownik;
        File plik = new File("wynik.txt");
        Scanner odczyt = new Scanner(plik);
        ObjectOutputStream zapis = new ObjectOutputStream(new FileOutputStream("data.dat"));

        for (int i = 0; i < 1000; i++) {
            licznik=odczyt.nextInt();
            mianownik=odczyt.nextInt();
            Fraction ulamek = new Fraction(licznik,mianownik);
            zapis.writeObject(ulamek);
        }
        odczyt.close();
        zapis.close();
    }

    static void zad3c() throws IOException, ClassNotFoundException {
        Object ulamek;
        ObjectInputStream odczyt = new ObjectInputStream(new FileInputStream("data.dat"));

        for (int i = 0; i < 1000; i++) {
            ulamek=odczyt.readObject();
            System.out.println(ulamek);
        }
        odczyt.close();
    }

}
