package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entité.Categorie;

public class CategorieDao {
	 public static List<Categorie> ListeCategorie(){
	    	List<Categorie> cat = new ArrayList<Categorie>() ;
	    	InteractionDataBase.connect();
	    	ResultSet r=InteractionDataBase.select("select * from Categorie");
	    	 try {
	    		 while(r.next()) {
	    			       Categorie n=new Categorie();
	    		            n.setId(r.getInt(1));
	    		            n.setNom(r.getString(2));	    		            
				           cat.add(n);
	    		 } 
			} catch (Exception e) {
			}
			return cat;
	    	
	    }
}

