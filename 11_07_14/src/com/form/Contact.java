package com.form;

import java.util.ArrayList;

public class Contact {
	
	static ArrayList<Contact> contatti = new ArrayList<Contact>();
	
    private String firstname;
    private String lastname;
    private String email;
    private String telephone;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public void AggiungiContatto(){
    	contatti.add(this);
    	
    	for(int i=0;i<contatti.size();i++){
    		System.out.println("Nome: "+contatti.get(i).firstname+"\nCognome: "+contatti.get(i).lastname);
    		System.out.println("email: "+contatti.get(i).email+"\nTelefono: "+contatti.get(i).telephone);
    	}
    }

    public void ModificaContatto(){
    	for(int i = 0; i < contatti.size(); i++) {
    		if(contatti.get(i).getFirstname().equals(this.getFirstname())
    				&& contatti.get(i).getLastname().equals(this.getLastname())) {
    			contatti.get(i).setTelephone(this.getTelephone());
    			System.out.println("modifica effettuata");
    		}
    			
    	}
    	
    	/*int i = 0;
    	while(!this.getFirstname().equals(contatti.get(i).getFirstname()) 
    			|| !this.getLastname().equals(contatti.get(i).getLastname())
    			&& i > contatti.size())
    		i++;
    	
    	contatti.get(i).setTelephone(this.getTelephone());*/
    }
    
}