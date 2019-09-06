module javaFX {
	exports com.company.Models;
	exports com.ITD.developer.jugtours.config;
	exports com.ITD.developer.jugtours.model;
	exports com.ITD.developer.jugtours.web;
	exports com.company.Datasource;
	exports testing;
	exports com.company;
	exports com.ITD.developer.jugtours;
	exports sample;

	requires java.net.http;
	requires java.sql;
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	requires org.json;
}