package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet{

ArrayList<Colour> c = new ArrayList<Colour>();
//ArrayList<Resistor> r = new ArrayList<Resistor>();


	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
	}
	//	loadResistor();
// 	
// 	public void loadResistor()
// {
// 	Table table = loadTable("resistors.csv","header");
// 	for (int i = 0; i< table.getRowCount();i++)
// 	{
// 	  TableRow row = table.getRow(i);
// 		System.out.println(row.getString("618"));
		
// 	for (TableRow row: table.rows())
//     {
//        Resistor r = new Resistor (row); 
// 			 Resistor.add(r);
//     }
// } 

public void loadColours()
{
	Table table = loadTable("colours.csv","header");
	for (int i = 0; i< table.getRowCount();i++)
	{
	  TableRow row = table.getRow(i);
		// System.out.println(row.getString("colour"));
		// System.out.println(row.getString("r"));
		// System.out.println(row.getString("g"));
		// System.out.println(row.getString("b"));
		// System.out.println(row.getString("value"));
		System.out.println(row.getString("colour") + "\t" + row.getString("r")  + "\t" + row.getString("g")  + "\t" + row.getString("b") + "\t"  + row.getString("value"));
	}
	for (TableRow row: table.rows())
    {
       Colour c = new Colour (row); 
			 Colour.add(c);
    }
} 
    
	public void draw()
	{	
		int rectheight=200;
		int rectwidth=200;
		line(50,200,  350, 200);
		rect(100, 100, rectheight, rectwidth);
		// line(50, 150,  200, 150);
		
	}
}
