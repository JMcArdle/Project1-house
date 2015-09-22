/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Circle sun3;
    private Person resident;
    private Person resident2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        resident = new Person();
        resident.changeColor("black");
        resident.changeSize(50, 70);
        resident.moveHorizontal(150);
        resident.moveVertical(0);
        resident.makeVisible();
        
        resident2 = new Person();
        resident2.changeColor("red");
        resident2.changeSize(50, 70);
        resident2.moveHorizontal(-210);
        resident2.moveVertical(0);
        resident2.makeVisible();
        
        
        wall = new Square();
        wall.moveHorizontal(-400);
        wall.changeColor("blue");
        wall.moveVertical(100);
        wall.changeSize(1000);
        wall.makeVisible();
        
        roof = new Triangle();  
        roof.changeSize(150, 300);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        roof = new Triangle();  
        roof.changeSize(150, 300);
        roof.moveHorizontal(50);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(-125);
        sun.moveVertical(-40);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("blue");
        sun2.moveHorizontal(-5);
        sun2.moveVertical(-90);
        sun2.changeSize(60);
        sun2.makeVisible();

        sun3 = new Circle();
        sun3.changeColor("yellow");
        sun3.moveHorizontal(100);
        sun3.moveVertical(-40);
        sun3.changeSize(60);
        sun3.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            sun2.changeColor("black");
            sun3.changeColor("black");
            resident.changeColor("black");
            resident2.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("blue");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            sun2.changeColor("blue");
            sun3.changeColor("red");
            resident.changeColor("black");
            resident2.changeColor("red");
        }
    }
}
