package org.sk.collection;
import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		Comparator<Patient> comparator = new Comparator<Patient>(){
			public int compare(Patient p1,Patient p2) {
				
				if(p1.isEmergency()==true && p2.isEmergency()==true){
					
					if(p1.getId()<p2.getId())
						return -1;
					else
						return 1;
				} 
				else if(p1.isEmergency()==true && p2.isEmergency()==false)
					return -1;
				else if(p1.isEmergency()==false && p2.isEmergency()==true)
					return 1;
                else if(p1.isEmergency()==false && p2.isEmergency()==false) {
					
					if(p1.getId()<p2.getId())
						return -1;
					else
						return 1;
					
				}
				return 0;
				
			}
		};
		
	
		
		PriorityQueue<Patient> patientQueue = new PriorityQueue<Patient>(comparator);
		
		patientQueue.add(new Patient(1,"patient 1",false));
		patientQueue.add(new Patient(2,"patient 2",false));
		patientQueue.add(new Patient(3,"patient 3",true));
		patientQueue.add(new Patient(4,"patient 4",false));
		patientQueue.add(new Patient(5,"patient 5",false));
		patientQueue.add(new Patient(6,"patient 6",true));
		
		
		System.out.println("patients waiting for doctor");
		
		while(true){
			
			Patient currentPatient = patientQueue.poll();
			if(currentPatient==null){
				break;
			}
			
			System.out.print(currentPatient.getName() +" <--  ");
		}
		

		
		
		

	}

}
