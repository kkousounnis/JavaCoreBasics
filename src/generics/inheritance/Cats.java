/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author root
 */
public class Cats<T extends Number> extends Animals{
    T age;
    
    Cats(T age){
        super("Luigi");
        this.age=age;
    }
}
