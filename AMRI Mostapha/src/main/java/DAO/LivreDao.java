package DAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entité.Livre; 

public class LivreDao {
    public Livre getlivres(int Id) {
		    Livre li=new Livre();
		    InteractionDataBase.connect();
		    ResultSet res =  InteractionDataBase.select("select * from oeuvrages where id= "+Id);
		     try {
		    	 if (res.next()) {
		    		 li.setId(res.getInt(1));
		    		 li.setAuteur(res.getString(2));
		    		 li.setTitre(res.getString(3));
		    		 li.setDescription(res.getString(4));	    		 
		    	 }	
			} catch (Exception e) {
			}
		     InteractionDataBase.disconnect();
		        return li;
	  }
	  public List<Livre> getlivresBycategorie(int Id){
		  List<Livre> li = new ArrayList<Livre>() ;
		  InteractionDataBase.connect();
	    	ResultSet res= InteractionDataBase.select("select * from oeuvrages where id_categorie="+Id);
	    	 try {
	    		 while(res.next()) {
	    			        Livre liv=new Livre();
	    		            liv.setId(res.getInt(1));
	    		            liv.setAuteur(res.getString(2));
	    		            liv.setTitre(res.getString(3));
	    		            liv.setDescription(res.getString(4));
	    		 
				        li.add(liv);
	    		 }
			} catch (Exception e) {
			}
			return li;
	  }
	  
	  
	    public List<Livre> Listelivres(){
	    	List<Livre> li = new ArrayList<Livre>() ;
	    	 InteractionDataBase.connect();
	    	ResultSet res= InteractionDataBase.select("select * from oeuvrages");
	    	 try {
	    		 while(res.next()) {
	    			        Livre m=new Livre();
	    		            m.setId(res.getInt(1));
	    		            m.setAuteur(res.getString(2));
	    		            m.setTitre(res.getString(3));
	    		            m.setDescription(res.getString(4));
	    		 
				        li.add(m);
	    		 }
			} catch (Exception e) {
				// TODO: handle exception
			}
			return li;
	    	
	    }
	    public static void AjouterLivre(Livre r) {
	    	
	    	 InteractionDataBase.connect();
	    	String sql="INSERT INTO `ouvrage` (`Auteur`, `Aitre`, `Description`, `IDCategorie`)"
	    			+ " VALUES ('"+r.getAuteur()+"','"+r.getTitre()+"','"+r.getDescription()+"', 3 )";
	    	 InteractionDataBase.misajour(sql);
	    	 InteractionDataBase.disconnect();
	    }
	    public void SupprimerLivres(int Id) {
	    	 InteractionDataBase.connect();
	    	String sql=("delete from oeuvrages where id="+Id);
	    	 InteractionDataBase.misajour(sql);
	    	 InteractionDataBase.disconnect();
	    	
	    }
	    
	    public static void reservation(int Id, int Id_livre) {
	    	 InteractionDataBase.connect();
	    	String sql="INSERT INTO `reservation` (`id_etudiant`, `id_livre`)"
	    			+ " VALUES ("+Id+","+Id_livre+")";
	    	 InteractionDataBase.misajour(sql);
	    	 InteractionDataBase.disconnect();
	    }
	    
	    public void ModifierLivre( Livre r) {
	    	 InteractionDataBase.connect();
			String sql="UPDATE `ouvrage`"
					+ "SET  Auteur = '"+r.getAuteur()+"', Titre ='"+r.getTitre()+"' , Description = '"+r.getDescription()+"'"
					+ " WHERE Id ="+r.getId();
			 InteractionDataBase.misajour(sql);
			 InteractionDataBase.disconnect();
		}
	    
	    
	
}
