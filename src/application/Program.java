package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	
	public static void main(String[] args) {
		
		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(3.00, 2.00));
		myShape.add(new Circle(2.0));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircle));
		
	}
	
	public static double totalArea(List<? extends Shape> list){
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
}
