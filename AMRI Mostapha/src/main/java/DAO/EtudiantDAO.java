
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entité.Etudiant;

public class EtudiantDAO {
	public Etudiant getEtudiant(int Id){
		Etudiant et = null;
		 InteractionDataBase.connect();
		ResultSet r =  InteractionDataBase.select("select * from Etudiant where id="+Id);
	try {
			  if(r.next()) {
				et = new Etudiant();
				et.setId(r.getInt(1));
				et.setNom(r.getString(2));
				et.setPrenom(r.getString(3));
				et.setEmail(r.getString(4));
			}
				} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		 InteractionDataBase.disconnect();
		return et;
	}
		            
	public List<Etudiant> getListEtudiant(){
		List<Etudiant> Liste =  new ArrayList<Etudiant>();
		 InteractionDataBase.connect();
		ResultSet r =  InteractionDataBase.select("select * from Etudiant");
		try {
			while(r.next()) {
				Etudiant et  = new Etudiant();
				et.setId(r.getInt(1));
				et.setNom(r.getString(2));
				et.setPrenom(r.getString(3));
				et.setEmail(r.getString(4));
				et.setPassword(r.getString(5));
				Liste.add(et);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 InteractionDataBase.disconnect();
		return Liste;
	}
	public static void AjouterEtudiant(Etudiant etu) {
		 InteractionDataBase.connect();
		String sql="INSERT INTO `Etudiant` ( `Nom`, `Prenom`, `Email`, `Password`)" 
				+ "VALUES('"+etu.getNom()+"','"+etu.getPrenom()+"','"+etu.getEmail()+"','"+etu.getPassword()+"')";
		 InteractionDataBase.misajour(sql);		
		 InteractionDataBase.disconnect();
	}
	
	public void SupprimerEtudiant(int Id) {
		 InteractionDataBase.connect();
		String sql=("delete from etudiant where id="+Id);
		
		 InteractionDataBase.misajour(sql);	
		 InteractionDataBase.disconnect();
	}
	public void ModifierEtudiant( Etudiant et) {
		InteractionDataBase.connect();
		String sql="UPDATE `Etudiant`"
				+ "SET  Nom = '"+et.getNom()+"', Prenom ='"+et.getNom()+"' , Email= '"+et.getEmail()+"', Password='"+et.getPassword()+"'"
				+ " WHERE Id ="+et.getId();
		 InteractionDataBase.misajour(sql);
		 InteractionDataBase.disconnect();
	}
	
	public static Etudiant Authentification(String login,String password) {
		Etudiant et = null;
		 InteractionDataBase.connect();
		ResultSet r =  InteractionDataBase.select("select * from Etudiant where Email= '"+login+"' and Password='"+password+"';");
		try {
			  if(r.next()) {
				et = new Etudiant();
				et.setId(r.getInt(1));
				et.setNom(r.getString(2)); 
				et.setPrenom(r.getString(3));
				et.setEmail(r.getString(4));
			}
	 } catch (SQLException e) {
		e.printStackTrace();
		}
    	 InteractionDataBase.disconnect();
		return et;
	}	
}
