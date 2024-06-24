/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code takes action for every button provided in the scene-builder. 
 *   Project:  MainController
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable{
	@FXML
	private WebView webview;
	
	private WebEngine engine;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine=webview.getEngine();
				
	}
	public void btn1(ActionEvent event) {
		engine.load("https://www.google.com");
	}
	
	public void btn2(ActionEvent event) {
		engine.executeScript("window.location= \"http://easyonlineconverter.com//\";");
	}
	
	public void btn3(ActionEvent event) {
		engine.loadContent("<html><body><h1>WELCOME TO CREVAVI</h1></body></html>");
	}
	
	public void btn4(ActionEvent event) {
		engine.reload();
	}

}
