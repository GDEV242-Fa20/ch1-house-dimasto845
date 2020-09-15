/**
 * This class represents a picture of a couple walking towards a rock. 
 * 
 * 
 * @author  Dmitriy Stomma
 * @version 2016.02.29
 */
public class Picture
{
    private Square sky;
    private Square ground;
    private Square car1;
    private Square car2;
    private Square car3;
    private Square car4;
    private Square car5;
    private Square car6;
    private Square car7;
    private Square car8;
    private Triangle rock;
    private Triangle window;
    private Circle sun;
    private Circle tire1;
    private Circle tire2;
    private Person person1;
    private Person person2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        ground = new Square();
        car1 = new Square();
        car2 = new Square();
        car3 = new Square();
        car4 = new Square();
        car5 = new Square();
        car6 = new Square();
        car7 = new Square();
        car8 = new Square();
        rock = new Triangle();
        window = new Triangle();
        sun = new Circle();
        tire1 = new Circle();
        tire2 = new Circle();
        person1 = new Person();
        person2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-340);
            sky.moveVertical(-550);
            sky.changeSize(600);
            sky.changeColor("skyblue");
            sky.makeVisible();
            
            ground.changeColor("green");
            ground.moveHorizontal(-320);
            ground.moveVertical(20);
            ground.changeSize(600);
            ground.makeVisible();
    
            rock.changeSize(80, 210);
            rock.changeColor("brown");
            rock.moveHorizontal(180);
            rock.moveVertical(-80);
            rock.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(180);
            sun.moveVertical(-80);
            sun.changeSize(80);
            sun.makeVisible();
            
            
            tire1 = new Circle();
            tire1.changeColor("black");
            tire1.moveHorizontal(-200);
            tire1.moveVertical(30);
            tire1.changeSize(20);
            tire1.makeVisible();
            
            tire2 = new Circle();
            tire2.changeColor("black");
            tire2.moveHorizontal(-130);
            tire2.moveVertical(30);
            tire2.changeSize(20);
            tire2.makeVisible();
            
            car1 = new Square();
            car1.changeColor("black");
            car1.moveHorizontal(-190);
            car1.moveVertical(-25);
            car1.changeSize(27);
            car1.makeVisible();
            
            car2 = new Square();
            car2.changeColor("black");
            car2.moveHorizontal(-230);
            car2.moveVertical(-25);
            car2.changeSize(27);
            car2.makeVisible();
            
            car3 = new Square();
            car3.changeColor("black");
            car3.moveHorizontal(-205);
            car3.moveVertical(-25);
            car3.changeSize(27);
            car3.makeVisible();
            
            car4 = new Square();
            car4.changeColor("black");
            car4.moveHorizontal(-250);
            car4.moveVertical(-25);
            car4.changeSize(27);
            car4.makeVisible();
            
            car5 = new Square();
            car5.changeColor("black");
            car5.moveHorizontal(-275);
            car5.moveVertical(-25);
            car5.changeSize(27);
            car5.makeVisible();
            
            car6 = new Square();
            car6.changeColor("black");
            car6.moveHorizontal(-295);
            car6.moveVertical(-25);
            car6.changeSize(27);
            car6.makeVisible();
           
            car7 = new Square();
            car7.changeColor("black");
            car7.moveHorizontal(-250);
            car7.moveVertical(-60);
            car7.changeSize(37);
            car7.makeVisible();
            
            car8 = new Square();
            car8.changeColor("black");
            car8.moveHorizontal(-260);
            car8.moveVertical(-60);
            car8.changeSize(37);
            car8.makeVisible();
            
            window = new Triangle();
            window.changeColor("black");
            window.moveHorizontal(-116);
            window.moveVertical(-82);
            window.changeSize(37, 80);
            window.makeVisible();
            
            person1 = new Person();
            person1.moveHorizontal(-65);
            person1.moveVertical(-78);
            person1.changeSize(40,25);
            person1.makeVisible();
            
            person2 = new Person();
            person2.moveHorizontal(-85);
            person2.moveVertical(-78);
            person2.changeSize(40,25);
            person2.makeVisible();
            drawn = true;
        }
    }
    


    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        ground.changeColor("white");
        rock.changeColor("white");
        sun.changeColor("white");
        car1.changeColor("white");
        car2.changeColor("white");
        car3.changeColor("white");
        car4.changeColor("white");
        car5.changeColor("white");
        car6.changeColor("white");
        car7.changeColor("white");
        car8.changeColor("white");
        tire1.changeColor("white");
        tire2.changeColor("white");
        window.changeColor("white");
        person1.changeColor("white");
        person2.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("skyblue");
        ground.changeColor("green");
        rock.changeColor("brown");
        sun.changeColor("yellow");
        car1.changeColor("black");
        car2.changeColor("black");
        car3.changeColor("black");
        car4.changeColor("black");
        car5.changeColor("black");
        car6.changeColor("black");
        car7.changeColor("black");
        car8.changeColor("black");
        tire1.changeColor("black");
        tire2.changeColor("black");
        window.changeColor("black");
        person1.changeColor("black");
        person2.changeColor("black");
    }
}
