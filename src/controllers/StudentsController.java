package controllers;

import java.sql.ResultSet;
import java.util.List;

import models.StudentsModel;
import views.StudentsView;

public class StudentsController {
	
	private StudentsView vista;
	private StudentsModel data;
	
	public StudentsController() {
		
		vista = new StudentsView();
		data = new StudentsModel();
	}
	
	public void home() {
		
		
		List<List> students = data.get();
		
		vista.home(students);
		
		//data.add("Juanito", "1234", "asd");
		
	}

}
