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
public class Main {
    static void test(Gen<? extends Animals> o){
        //
        
    }
    public static void main(String[] args){
        Cats<Integer> c1 = new Cats<Integer>(2);
        Dogs<String> d1 = new Dogs<String>("Rex"); 
        Person<String,Integer> p = new Person<String,Integer>("Kwstas",12);
        
        Gen<Cats> w1 = new Gen<Cats>(c1);
        Gen<Dogs> w2 = new Gen<Dogs>(d1);
        
        Gen<Person> w3 = new Gen<Person>(p);
        
        test(w1);
        test(w2);
        
        //test(w3); //error w3 does not inherit from class animals
        
        
    }
    
}
