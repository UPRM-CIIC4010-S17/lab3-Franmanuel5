import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x1, y1, width + 1, height + 1);

	/*  //Draw a border
        g.setColor(Color.RED);
        g.drawRect(x1, y1, width, height);

        //Draw second border
        g.setColor(Color.YELLOW);
        g.drawRect(x1 + 1, y1 + 1, width - 2, height - 2);

        //Draw third border
        g.setColor(Color.BLUE);
        g.drawRect(x1 + 2, y1 + 2, width - 4, height - 4);

        //Drawing Line 1
        g.setColor(Color.WHITE);
        g.drawLine(x1, y1, x2, y2);

        //Drawing Line 2
        g.setColor(Color.BLACK);
        g.drawLine(x1, y2, x2, y1);      */

		//Draw Oval 
		//g.setColor(Color.RED);
		//g.fillOval((getWidth()-55)/2, (getHeight()-55)/2, 55, 55);

		//Drawing Polygon 1
	/*    Polygon p = new Polygon();
          p.addPoint(x1 + 5, y1 + 25);
          p.addPoint(x1 + 20, y1 + 10);
          p.addPoint(x1 + 35, y1 + 25);
          p.addPoint(x1 + 25, y1 + 25);
          p.addPoint(x1 + 25, y1 + 45);
          p.addPoint(x1 + 15, y1 + 45);
          p.addPoint(x1 + 15, y1 + 25);
          g.setColor(Color.YELLOW);
          g.fillPolygon(p);               */

		//Drawing Polygon 2
	/*    Polygon p2 = new Polygon();
          p2.addPoint(x1 + 25, y1 + 73);
          p2.addPoint(x1 + 41, y1 + 73);
          p2.addPoint(x1 + 47, y1 + 58);
          p2.addPoint(x1 + 53, y1 + 73);
          p2.addPoint(x1 + 69, y1 + 73);
          p2.addPoint(x1 + 56, y1 + 83);
          p2.addPoint(x1 + 61, y1 + 98);
          p2.addPoint(x1 + 47, y1 + 88);
          p2.addPoint(x1 + 34, y1 + 98);
          p2.addPoint(x1 + 38, y1 + 83);
          g.setColor(Color.WHITE);
          g.drawPolygon(p2);               */

		//Drawing Puerto Rican flag

		Polygon flagRedLines = new Polygon();              //Red Lines 
		flagRedLines.addPoint(x1 + 10, y1 + 10);
		flagRedLines.addPoint(x1 + 210, y1 + 10);
		flagRedLines.addPoint(x1 + 210, y1 + 150);
		flagRedLines.addPoint(x1 + 10, y1 + 150);
		g.setColor(Color.RED);
		g.fillPolygon(flagRedLines);


		Polygon flagRedLinesBorder = new Polygon();       //Red Lines Border
		flagRedLinesBorder.addPoint(x1 + 10, y1 + 10);
		flagRedLinesBorder.addPoint(x1 + 210, y1 + 10);
		flagRedLinesBorder.addPoint(x1 + 210, y1 + 150);
		flagRedLinesBorder.addPoint(x1 + 10, y1 + 150);
		g.setColor(Color.BLACK);
		g.drawPolygon(flagRedLinesBorder);

		g.setColor(Color.WHITE);
		Polygon flagWhiteLine1 = new Polygon();           //Upper White Line 
		flagWhiteLine1.addPoint(x1 + 10, y1 + 35);
		flagWhiteLine1.addPoint(x1 + 210, y1 + 35);
		flagWhiteLine1.addPoint(x1 + 210, y1 + 65);
		flagWhiteLine1.addPoint(x1 + 10, y1 + 65);
		g.fillPolygon(flagWhiteLine1);


		Polygon flagWhiteLineBorder1 = new Polygon();     //Upper White Line Border
		flagWhiteLineBorder1.addPoint(x1 + 10, y1 + 35);
		flagWhiteLineBorder1.addPoint(x1 + 210, y1 + 35);
		flagWhiteLineBorder1.addPoint(x1 + 210, y1 + 65);
		flagWhiteLineBorder1.addPoint(x1 + 10, y1 + 65);
		g.setColor(Color.BLACK);
		g.drawPolygon(flagWhiteLineBorder1);

		Polygon flagWhiteLine2 = new Polygon();          //Lower White line 
		flagWhiteLine2.addPoint(x1 + 10, y1 + 95);
		flagWhiteLine2.addPoint(x1 + 210, y1 + 95);
		flagWhiteLine2.addPoint(x1 + 210, y1 + 125);
		flagWhiteLine2.addPoint(x1 + 10, y1 + 125);
		g.setColor(Color.WHITE);
		g.fillPolygon(flagWhiteLine2);

		Polygon flagWhiteLineBorder2 = new Polygon();   //Lower White Line Border
		flagWhiteLineBorder2.addPoint(x1 + 10, y1 + 95);
		flagWhiteLineBorder2.addPoint(x1 + 210, y1 + 95);
		flagWhiteLineBorder2.addPoint(x1 + 210, y1 + 125);
		flagWhiteLineBorder2.addPoint(x1 + 10, y1 + 125);
		g.setColor(Color.BLACK);
		g.drawPolygon(flagWhiteLineBorder2);

		Polygon flagTriangle = new Polygon();           //Blue Triangle 
		flagTriangle.addPoint(x1 + 10, y1 + 10);
		flagTriangle.addPoint(x1 + 10, y1 + 150);
		flagTriangle.addPoint(x1 + 120, y1 + 80);
		g.setColor(Color.BLUE);
		g.fillPolygon(flagTriangle);

		Polygon flagTriangleBorder = new Polygon();     //Blue Triangle Border
		flagTriangleBorder.addPoint(x1 + 10, y1 + 10);
		flagTriangleBorder.addPoint(x1 + 10, y1 + 150);
		flagTriangleBorder.addPoint(x1 + 120, y1 + 80);
		g.setColor(Color.BLACK);
		g.drawPolygon(flagTriangleBorder);

		Polygon p2 = new Polygon();                    //Single White Star 
		p2.addPoint(x1 + 25, y1 + 73);
		p2.addPoint(x1 + 41, y1 + 73);
		p2.addPoint(x1 + 47, y1 + 58);
		p2.addPoint(x1 + 53, y1 + 73);
		p2.addPoint(x1 + 69, y1 + 73);
		p2.addPoint(x1 + 56, y1 + 83);
		p2.addPoint(x1 + 61, y1 + 98);
		p2.addPoint(x1 + 47, y1 + 88);
		p2.addPoint(x1 + 34, y1 + 98);
		p2.addPoint(x1 + 38, y1 + 83);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);


		Polygon p2Border = new Polygon();             //Single White Star Border   
		p2Border.addPoint(x1 + 25, y1 + 73);
		p2Border.addPoint(x1 + 41, y1 + 73);
		p2Border.addPoint(x1 + 47, y1 + 58);
		p2Border.addPoint(x1 + 53, y1 + 73);
		p2Border.addPoint(x1 + 69, y1 + 73);
		p2Border.addPoint(x1 + 56, y1 + 83);
		p2Border.addPoint(x1 + 61, y1 + 98);
		p2Border.addPoint(x1 + 47, y1 + 88);
		p2Border.addPoint(x1 + 34, y1 + 98);
		p2Border.addPoint(x1 + 38, y1 + 83);
		g.setColor(Color.BLACK);
		g.drawPolygon(p2Border);
		
	}
}
