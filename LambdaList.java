/*
* Nama File    : LambdaList.java
* Nama Pembuat : Ihsan Alif Lazuardi Anwar
* NIM          : 24060121140162
* Deskripsi    : Implementasi lamda pada list, digunakan sebagai parameter pada method
* Tanggal      : 06 Juni 2023
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Resma");
        mahasiswaList.add("Adi");
        mahasiswaList.add("Nugroho");
        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });
    }
}
