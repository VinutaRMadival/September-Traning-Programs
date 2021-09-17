package com.vco.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity          //the studentDTO class is now Entity class Entity class is a class which will get mapped to a table. 
@Table(name="student_information")        //will help us to map a perticuler table
public class Studentdto {
	

		@Id    // it will make the studentId behaves like the PK attribute.
		@Column(name="stud_Id")      //we will map attribute of the object to the column of the table. 
		private int stud_Id;         //primary attribue of the class
		
		@Column(name="stud_name")
		private String stud_name;
		
		@Column(name="stud_branch")
		private String stud_branch;
		
		@Column(name="stud_marks")
		private double stud_marks;
		
		@Column(name="stud_phonenumber")
		private String stud_phonenumber;
		
		@Column(name="stud_address")
		private String stud_address;
		
		
		public Studentdto() 
		{
			System.out.println(this.getClass().getSimpleName()+" Object created without argument");
		}

		public Studentdto(int stud_Id, String stud_name, String stud_branch, double stud_marks, String stud_phonenumber,
				String stud_address ) 
		{
			System.out.println(this.getClass().getSimpleName()+" Object created using argument");
			this.stud_Id = stud_Id;
			this.stud_name = stud_name;
			this.stud_branch = stud_branch;
			this.stud_marks = stud_marks;
			this.stud_phonenumber = stud_phonenumber;
			this.stud_address = stud_address;
			
		}

		public int getstud_Id() {
			return stud_Id;
		}

		public void setstud_Id(int stud_Id) {
			this.stud_Id = stud_Id;
		}

		public String getStud_name() {
			return stud_name;
		}

		public void setStud_name(String stud_name) {
			this.stud_name = stud_name;
		}

		public String getStud_branch() {
			return stud_branch;
		}

		public void setStud_branch(String stud_branch) {
			this.stud_branch = stud_branch;
		}

		public double getStud_marks() {
			return stud_marks;
		}

		public void setStud_marks(double stud_marks) {
			this.stud_marks = stud_marks;
		}

		public String getstud_phonenumber() {
			return stud_phonenumber;
		}

		public void setstud_phonenumber(String stud_phonenumber) {
			this.stud_phonenumber = stud_phonenumber;
		}

		public String getStud_address() {
			return stud_address;
		}

		public void setStud_address(String stud_address) {
			this.stud_address = stud_address;
		}

		@Override
		public String toString() {
			return "StudentDTO [stud_Id=" + stud_Id + ", stud_name=" + stud_name + ", stud_branch=" + stud_branch
					+ ", stud_marks=" + stud_marks + ", stud_phonenumber=" + stud_phonenumber + ", stud_address="
					+ stud_address + "]";
		}
	}


