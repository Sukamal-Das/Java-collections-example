package org.sk.collection;

public class Patient  {
	
	
	private int id;
	private String name;
	private boolean isEmergency;
	
	public Patient(int id,String name,boolean isEmergency){
		this.id=id;
		this.name=name;
		this.isEmergency=isEmergency;
		
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isEmergency(){
		return isEmergency;
	}
	
	public String toString(){
		
		return id+" "+name+" "+isEmergency;
	}

	

}
