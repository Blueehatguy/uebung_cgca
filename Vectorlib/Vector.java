/**
 *
 * @author vitzthum
 */
package vectorlib;

public class Vector {
    private final double x,y,z;

    
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;  
    }
    
    //a.	Eine Funktion, die zwei dreidimensionale Vektoren addiert    
    public Vector plus(Vector v) {
        // TODO: Aufgabe a) Vektoraddition implementieren
        return null;
    }
    
    //b.	Eine Funktion, die einen dreidimensionalen Vektor mit einem Skalar multipliziert
    public Vector scale(double s) {
        // TODO: Aufgabe b) Multiplikation mit Skalar implementieren
        return null;
    }
    
    //c.	Eine Funktion, die die L nge eines Vektors errechnet
    public double length() {
        // TODO: Aufgabe c) Vektorlänge berechnen
        return 0.0;
    }   
    
    //d.	Eine Funktion, die das Skalarprodukt  zweier Vektoren bildet
    public double dot(Vector v) {
        // TODO: Aufgabe d) Skalarprodukt berechnen
        return 0.0;
    }
    
    //e.	Eine Funktion, die einen Vektor normiert
    public Vector normalized() {
        // TODO: Aufgabe e) Vektor normieren
        return null;
    }
    
    //f.	Eine Funktion, die den Winkel zwischen zwei Vektoren errechnet (in Gruppe 2 schon erledigt)
    public double angleInDeg (Vector v) {
        // TODO: Aufgabe f) Winkel zwischen zwei Vektoren (in Grad) berechnen
        return 0.0;
    }
    
    //g.	Eine Funktion, die das Kreuzprodukt zwischen zwei dreidimensionalen Vektoren errechnet
    public Vector cross(Vector v) {
        // TODO: Aufgabe g) Kreuzprodukt berechnen
        return null;
    }
    
    //h.	Eine Funktion, die die Differenz (einen Vektor) zwischen zwei Punkten (d.h. Ortsvektoren) bildet
    public Vector minus(Vector v) {
        // TODO: Aufgabe h) Differenz zweier Vektoren berechnen
        return null;
    }
    
    //i.	Eine Funktion, die den Abstand zwischen zwei Punkten (d.h. Ortsvektoren) berechnet
    public double distance(Vector v) {
        // TODO: Aufgabe i) Abstand zweier Punkte berechnen
        return 0.0;
    }
    
    //Die Klasse soll zudem  ber Get-Methoden f r den Zugriff auf die Komponenten x,y,z eines Vektors verf gen (z.B. getX() f r die Abfrage der x-Komponente eines Vektors)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }    
    
    @Override
    public String toString() {
        return x+","+y+","+z;
    }

}
