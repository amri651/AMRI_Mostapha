package entité;

public class Etudiant {
	
		int id;
		String nom;
		String prenom;
		String email;
		String password;

		public Etudiant() {
				}     

			public String getPassword() {
				return password;
			}
	
			public void setPassword(String Password) {
				this.password = Password;
			}

		
			public int getId() {
				return id;
			}
		
			public void setId(int Id) {
				this.id = Id;
			}
		
			public String getNom() {
				return nom;
			}
		
			public void setNom(String Nom) {
				this.nom = Nom;
			}
		

				@Override
				public String toString() {
					return "Etudiants [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
							+ ", password=" + password + "]";
				}


			public String getPrenom() {
				return prenom;
			}
		
			public void setPrenom(String Prenom) {
				this.prenom = Prenom;
			}
		
			public String getEmail() {
				return email;
			}
		
			public void setEmail(String Email) {
				this.email = Email;
			}

	

}
