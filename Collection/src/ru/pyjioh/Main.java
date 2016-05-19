package ru.pyjioh;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		public static Random r = new Random();
		
		public static void main(String[] args){
			
	for(int i=0;i<10;i++){
		mobiles.add(new Mobile(r.nextInt(99999),"sdfsdfsd"));
			
	}
	for(Mobile m: mobiles){
		System.out.println(m.getNumber() + " " + m.getName());
}

}}



