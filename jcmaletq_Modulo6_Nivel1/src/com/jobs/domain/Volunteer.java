package com.jobs.domain;

public class Volunteer extends AbsStaffMember {	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
	
	}
	private String description;

	@Override
	public void pay() {
		//TODO
		
	}


	@Override
	public String toString() {
	//	return "Volunteer [description=" + description + ", id=" + id + ", name=" + name + ", address=" + address
	//			+ ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
	return "Vol [" +
	        "id= " + id +
			", name= " + name + 
			", address= " + address +
			", phone= " + phone +
	        ", description= " + description + 
			", totalPaid= " + totalPaid + 
			"]"+ "\n";

	}
	
	

}
