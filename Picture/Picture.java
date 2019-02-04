
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square grass;
    private Square Hobhouse;
    private Square door;
    private Square window1;
    private Triangle tree;
    private Square trunk;

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
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        

        
        trunk = new Square();
        trunk.changeColor("black");
        trunk.changeSize(40);
        trunk.moveVertical(260);
        trunk.moveHorizontal(325);
        trunk.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(200, 80);
        tree.moveHorizontal(350);
        tree.moveVertical(100);
        tree.makeVisible();
        
     

        

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(400);
        sun.moveVertical(-150);
        sun.changeSize(150);
        sun.makeVisible();
        
        
       
      
        
        Hobhouse = new Square();
        Hobhouse.changeColor("black");
        Hobhouse.changeSize(250);
        Hobhouse.moveVertical(200);
        Hobhouse.makeVisible();
        
        
        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(50, 300);
        roof.moveHorizontal(135);
        roof.moveVertical(190);
        roof.makeVisible();
        
        
        door = new Square();
        door.changeColor("yellow");
        door.changeSize(50);
        door.moveVertical(255);
        door.moveHorizontal(100);
        door.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(30);
        window.moveVertical(250);
        window.makeVisible();
        
        window1 = new Square();
        window1.changeColor("white");
        window1.moveHorizontal(185);
        window1.moveVertical(250);
        window1.makeVisible();
        
        
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(600);
        grass.moveVertical(300);
        grass.moveHorizontal(-60);
        grass.makeVisible();
        
        
        
        
        
       
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
