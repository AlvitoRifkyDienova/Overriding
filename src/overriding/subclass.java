/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author MOKLET-1
 */
    //Subclass/Kelas Anak
public class subclass extends induk{
    
    public static void main(String[] args){
        subclass data = new subclass();
System.out.println("Umur Adi: "+data.geta());
        System.out.println("Umur Dio: "+data.getb());
    }
}

