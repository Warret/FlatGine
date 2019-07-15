package com.flatgine;
import com.flatgine.objectsys.Object;

public class core {

    public static boolean collisionVertical(Object obj1,Object obj2) {

        int obj2Ex = obj2.getX()+obj2.getWidth();
        int obj1Ex = obj1.getX()+obj1.getWidth();
        if (((obj2.getX() <= obj1.getX()) && (obj1.getX() <= obj2Ex)) || ((obj2.getX() <= obj1Ex) && (obj1Ex <= obj2Ex))){return true;}

        else{return false;}
    }
    public static boolean collisionHrizontal  (Object obj1, Object obj2) {

        int obj2Ey = obj2.getY() + obj2.getHeight();
        int obj1Ey = obj1.getY() + obj1.getHeight();
        if (((obj2.getY() <= obj1.getY()) && (obj1.getY() <= obj2Ey)) || ((obj2.getX() <= obj1Ey) && (obj1Ey <= obj2Ey))){return true;}
        else {return false;} 
    }
    
    public static boolean hasCollisionComplex( Object obj1, Object obj2){
		if(collisionHrizontal(obj1,obj2) & collisionHrizontal(obj1,obj2)){return true;}
		else{return false;}
	}
}
