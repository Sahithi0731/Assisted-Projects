package constructors;

public class constructor {
	double width;
	double height;
	double depth;
	constructor()
	{
		System.out.println("constructor without parameter");
		width = 10;
		height = 10;
		depth = 10;
	}
	constructor(int a, int b, int c)
	{
		System.out.println("constructor with parameter");
		width = a;
		height = b;
		depth = c;
	}
	double volume()
	{
		return width * height * depth;
	}

}
class constructordemo
{
	public static void main(String args[])
	{
		constructor cuboid1 = new constructor();
		double vol;
		vol = cuboid1.volume();
		System.out.println("Volume is" + vol);
		constructor cuboid2 = new constructor(8, 11, 9);
		vol = cuboid2.volume();
		System.out.println("Volume is" + vol);
	}
}
