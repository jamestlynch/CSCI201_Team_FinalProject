/**
 * ==========================================================================================================================
 * @fileName 			CSCI201Maps.java
 * @createdBy 			JamesLynch
 * @teamMembers 		Joseph Lin (josephml), Sarah Loui (sloui), James Lynch (jamestly), Ivana Wang (ivanawan)
 * @date 				Apr 12, 2014 4:45:04 PM
 * @professor			Jeffrey Miller
 * @project   			CSCI201 Final Project
 * @projectDescription	Map Transportation Network for Spring 2014 CSCI201 ("Principles of Software Development") at USC
 * @version				0.10
 * @versionCreated		0.10
 * ==========================================================================================================================
 *
 * ==========================================================================================================================
 */

package main;

import java.util.ArrayList;

import javax.swing.JFrame;

import main.freeway.FreewaySegment;
import main.map.GeoMap;
import main.map.GeoMapModel;
import main.map.GeoMapView;

public class CSCI201Maps {
	private GeoMapModel geoMapModel;
	private GeoMapView geoMapView;
	private GeoMap geoMap;
	
	// Call the user interface
	// Instantiate all objects
	public CSCI201Maps() {
		geoMapModel = new GeoMapModel();
		geoMapView = new GeoMapView(500, 500);
		geoMap = new GeoMap(geoMapView, geoMapModel);
		ArrayList<FreewaySegment> temp = new ArrayList<FreewaySegment>();
		temp = geoMapModel.returnAllSegment();
		System.out.println();
		try
		{
			System.out.println("HH");
			geoMapView.getMapViewer();
			geoMapView.drawPath(temp);
		}
		catch(NullPointerException npe)
		{
			System.out.println("NPE: " + npe.getMessage());
		}
		JFrame a = new JFrame();
		a.setSize(600,  600);
		a.add(geoMapView);
		a.setVisible(true);

		// Instantiate the GUI
//		new UICSCI201Maps();
//		new UICSCI201Maps();
	}
	
	public static void main(String [] args) {
		new CSCI201Maps();
		
	}
}
