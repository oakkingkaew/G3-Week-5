/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week5;

/**
 *
 * @author chanakarnkingkaew
 */
public class BookTest {

    public static void main(String[] args) {

        Author a = new Author("Chanakarn Kingkaew", "oakabc@gmail.com", 'M');

        System.out.println(a);

        Book b = new Book("My name is CK", a, 100);

        System.out.println(b);

        ///// Annonymous instance
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);

        System.out.println(anotherBook); // toString() 
        
        Author chantana = new Author ("จันทนา สาขากร", "chanatana@chula.com", 'f');
        
        Book kkpn = new Book ("การควบคุมภายในและการตรวจสอบภายใน", chantana, 315 );
        System.out.println(kkpn);
        
    }

}
