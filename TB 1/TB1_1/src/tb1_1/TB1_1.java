/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tb1_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Zaidan Habitullah Husni
 * @nim 41821010025
 */
public class TB1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = JOptionPane.showInputDialog(null, "Masukkan Nama Anda : ", "NAMA ANDA",
                                JOptionPane.QUESTION_MESSAGE);

            while (true) {
                mahasiswa1.nilai = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Masukkan Nilai Anda : ", "NILAI ANDA", JOptionPane.QUESTION_MESSAGE));
                        if (mahasiswa1.getNilai() <= 100) {
                                break;
                        }
                        JOptionPane.showMessageDialog(null, "Inputkan Data Dengan Benar!!!", "KETERANGAN", 1);
                }

                mahasiswa1.mk = JOptionPane.showInputDialog(null, "Masukkan MataKuliah Anda : ", "MATAKULIAH ANDA",
                        JOptionPane.QUESTION_MESSAGE);

            if (mahasiswa1.getNilai() >= 50) {
                JOptionPane.showMessageDialog(null,
                    mahasiswa1.getNama() + "...\nNilai Angka Anda : " + mahasiswa1.getNilai() + "\nNilai Huruf Anda : "
                            + mahasiswa1.getIndeks() + "\nAnda Lulus pada MK : " + mahasiswa1.getMK(), "KETERANGAN", 1);
                } 
                else {
                    JOptionPane.showMessageDialog(null,
                       nmahasiswa1.getNama() + "...\nNilai Angka Anda : " + mahasiswa1.getNilai() + "\nAnda tidak lulus ! pada MK : " + mahasiswa1.getMK(),
                                        "KETERANGAN", 1);
        }
    }
    
}

