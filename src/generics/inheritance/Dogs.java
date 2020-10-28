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
public class Dogs<T> extends Animals {
    T name;
    Dogs(T name){
        super();
        this.name=name;
    }
}
