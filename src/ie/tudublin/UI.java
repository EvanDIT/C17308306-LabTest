package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
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
		loadData();
	}
	public void loadData()
{
	Table table = loadTable("colours.csv","header");
	for (int i = 0; i< table.getRowCount();i++)
	{
	  TableRow row = table.getRow(i);
		System.out.println(row.getString("colour"));
		System.out.println(row.getString("r"));
		System.out.println(row.getString("g"));
		System.out.println(row.getString("b"));
		System.out.println(row.getString("value"));
	}
	for (TableRow row: table.rows())
    {
       // Colour c = new Colour (row); 
        //Colour.add(c); 
    }
} 
    
	public void draw()
	{			
	}
}
