/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimmer;

import java.io.Serializable;
import java.util.Vector;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author SomeBody
 */
public class FirstFetchData extends SwimmerData implements Cloneable, Serializable{
    protected ArrayList<Swimmer> listOfSwimmers;
    
    public FirstFetchData(){
        /**
         
         Assume here there is huge database and returns list of swimmers that fetched from Database
         we used dummy data here but the data will came from Database
         
         
         **/
        listOfSwimmers = new ArrayList<Swimmer>();
        listOfSwimmers.add(new Swimmer("Kassu","Male",17,23.4));
        listOfSwimmers.add(new Swimmer("Bekele","Female",19,27.3));
        listOfSwimmers.add(new Swimmer("Kassech","Female",18,24.7));
        listOfSwimmers.add(new Swimmer("Kebede","Male",22,23.4));
        listOfSwimmers.add(new Swimmer("Ayele","Female",28,27.3));
        listOfSwimmers.add(new Swimmer("Markos","Female",18,24.7));
    }
    public ArrayList<Swimmer> getData(){
        return listOfSwimmers;
    }
}
