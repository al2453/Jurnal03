package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SinglyLinked<Pojo> linkedList = new SinglyLinked();
        Scanner input = new Scanner(System.in);
        int masukan = 0;
        boolean var8 = false;

        while(masukan != 4) {
            System.out.println("Select input :");
            System.out.println("1. Input data");
            System.out.println("2. Delate data");
            System.out.println("3. Check member list");
            System.out.println("4. Exit");
            masukan = input.nextInt();
            if (masukan == 1) {
                System.out.println("Masukan data anggota ");
                System.out.println("Tuliskan nip, nama dan divisi");
                String dataNip = input.next();
                String dataNama = input.next();
                String dataDivisi = input.next();
                System.out.println("Tambahkan sebuah data di awal list? (y/n))");
                String opsi = input.next();
                if (opsi.equals("y")) {
                    linkedList.insertAtFront(new Pojo(dataNip, dataNama, dataDivisi));
                }

                if (opsi.equals("n")) {
                    linkedList.insertAtBack(new Pojo(dataNip, dataNama, dataDivisi));
                }
            } else if (masukan == 2) {
                System.out.println("Pilih opsi data yang akan dihapus:");
                System.out.println("1. Data Awal");
                System.out.println("2. Data Akhir");
                int hapusData = input.nextInt();
                if (hapusData == 1) {
                    linkedList.removeFromFront();
                    linkedList.print();
                } else if (hapusData == 2) {
                    linkedList.removeFromBack();
                    linkedList.print();
                }
            } else if (masukan == 3) {
                linkedList.print();
            }
        }
    }
}
