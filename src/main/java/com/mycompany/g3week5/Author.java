/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week5;

/**
 *
 * @author chanakarnkingkaew
 */
public class Author {
    
    private String name;
    private String email;
    private char gender;
    
    public Author (String name, String email, char gender) {
    
        this.name = name;
        this.email = email;
        this.gender = gender;
    
    }
    
    public String getName() {
    
        return name;
    }
    
    public String getEmail() {
    
        return email;
    }
    
    public void setEmail(String email) {
    
        this.email = email;
    }
    
    public char getGender () {
    
        return gender;
    }
    
    @Override
    public String toString() { // แสดงข้อมูลของ object
        
        String toString = String.format("Author[name=%s, email=%s, gender=%s]", name, email, gender);
        
        return toString;
    }
    
}
