/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author zero1
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        facadeGet f =new facadeGet();
       f.printc();
       f.printr();
    }
    
}
