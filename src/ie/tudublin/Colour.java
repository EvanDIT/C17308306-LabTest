package ie.tudublin;
import java.io.ObjectInputStream.GetField;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    public float r;
    public float g;
    public float b;

    public  Colour(String colour,float r,float g,float b)
    {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" ;
    }
    public Colour(TableRow tr) //Constructor Overload
    {
        this(tr.getString("colour"), tr.getFloat("r"),tr.getFloat("g"),tr.getFloat("b"));
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public float getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
	 * @param b the b to set
	 */
	public void setB(float b) {
		this.b = b;
    }

	public static void add(Colour c) {
	}
}