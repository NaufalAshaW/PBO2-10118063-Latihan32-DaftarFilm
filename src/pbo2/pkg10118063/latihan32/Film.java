/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan32;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Film {
        public String filmName, filmGenre;
        public double filmRating;
        public int filmDuration;
        
        public void nowPlaying(){
            System.out.println("Judul Film : " + filmName);
            System.out.println("Genre Film : " + filmGenre);
            System.out.println("Rating Film : " + filmRating);
            System.out.println("Durasi Film : " + filmDuration + " Menit \n");
        }
    }

