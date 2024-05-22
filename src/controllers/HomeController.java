package controllers;

import views.AuthView;
import views.HomeView;

public class HomeController {
	
	public HomeView vista;

	public HomeController() {
		
		vista = new HomeView();
	}
	
	public void dashboard() {
		
		vista.dashboard();
		
	}

}
