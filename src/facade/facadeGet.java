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
public class facadeGet {
   shape circle;
   shape regtangle;

    public facadeGet() {      
        this.circle = new circle();
        this.regtangle = new regtangle();
    }

    
   
  public void printc(){
     circle.print();
  } 
 public void printr(){
     regtangle.print();
  } 
}
