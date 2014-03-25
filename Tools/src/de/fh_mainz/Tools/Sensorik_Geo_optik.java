package de.fh_mainz.Tools;

import java.awt.Point;

public class Sensorik_Geo_optik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punkt a =new Punkt();
		Punkt b =new Punkt();
		Punkt c =new Punkt();
		Punkt d =new Punkt();
		Punkt r =new Punkt();
		Punkt t =new Punkt();
		
		a.setLocation(1,2);
		b.setLocation(2,1);
		c.setLocation(10, 0);
		d.setLocation(10, 1);
		r=b.subtraktion(a);
		t=d.subtraktion(c);
		
	}

}
