package listprogramms;

import java.util.Vector;

public class MarkerMainClass 
{
	
		public static void main(String[] args) {

			Marker m1 =new Marker("Cello",35,"Red") ;
			Marker m2 =new Marker("Calimn",55,"Black") ;
			Marker m3 =new Marker("Doms",40,"Blue") ;
			Vector v = new Vector();
			v.add(m1);
			v.add(m2);
			v.add(m3);

			for(int i=0;i<=v.size()-1;i++) 
			{
				
			Marker m = (Marker) v.get(i);
			if(m.getColor().equalsIgnoreCase("Red")) 
			{
				
				m.display();
			}
			if(m.getCost()>40) 
			{
				
				System.out.println("Marker Color "+m.getColor());
			}
			if(m.getColor()=="Blue")
			{
			m.setCost(50);
			}}
			int leastcost = ((Marker) v.get(0)).getCost();

			for (int i = 0; i < v.size(); i++) { 
			    Marker marker = (Marker) v.get(i); 
			    if (marker.getCost() < leastcost) { 
			        leastcost = marker.getCost(); 
			    }
			}
System.out.println("----------------------------------------");
			System.out.println("Least Cost is " + leastcost);



}
}
