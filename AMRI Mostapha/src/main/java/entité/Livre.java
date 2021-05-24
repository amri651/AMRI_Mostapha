package entité;

public class Livre {
	
		int id;
		String titre;
		String auteur;
	    String description; 
	    public Livre() {
		}

			public int getId() {
				return id;
			}
			public void setId(int Id) {
				this.id = Id;
			}
			public String getTitre() {
				return titre;
			}
			public void setTitre(String Titre) {
				this.titre = Titre;
			}
			public String getAuteur() {
				return auteur;
			}
			public String setAuteur(String Auteur) {
				return this.auteur = Auteur;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String Description) {
				this.description = Description;
			}

			@Override
			public String toString() {
				return "livres [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", description=" + description
						+ "]";
			}

			
	

}
