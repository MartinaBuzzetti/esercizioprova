package it.exolab.es.model;

public class Role {
	
	
	private int id;
	private String name ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Role() {
		
	}
	
	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
