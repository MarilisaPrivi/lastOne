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
    
    public ArrayList<Contact> getContatti() {
    	return contatti;
    }
    
    public void AggiungiContatto(){
    	contatti.add(this);
    	System.out.println("Hai inserito");
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
    	
    }
    	
    	public void VisualizzaContatti(){
    		for(int j=0;j<contatti.size();j++){
    			System.out.println("Nome: "+contatti.get(j).getFirstname());
    			System.out.println("Cognome: "+contatti.get(j).getLastname());
    			System.out.println("Nome: "+contatti.get(j).getTelephone());
    			
    		}
    	}
    	
    }
    
