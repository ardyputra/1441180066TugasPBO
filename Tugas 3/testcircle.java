class TestCircle {
	public static void main(String[] args) {
		
	
	circle cahya = new circle();
	circle ardi = new circle(30);
	circle gingsoel = new circle(96,"green");

	System.out.println("Radius = "+ cahya.getRadius()+" Color = "+ cahya.getColor() + " Luasnya = " + cahya.getArea());
	System.out.println("Radius = "+ ardi.getRadius()+" Color = "+ ardi.getColor() + " Luasnya = " + ardi.getArea());
	System.out.println("Radius = "+ gingsoel.getRadius()+" Color = "+ gingsoel.getColor() + " Luasnya = " + gingsoel.getArea());
	}

}
