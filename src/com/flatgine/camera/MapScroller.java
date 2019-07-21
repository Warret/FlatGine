package com.flatgine.camera;

import com.flatgine.objectsys.Object;

public class MapScroller {
	
	public static void scrollObjectsGroupOfAxisXByDistance(Object[] objectGroup, int distance) {
    	for(int i = 0; i < objectGroup.length; i++) {
    		objectGroup[i].setXPlusParameter(distance);
    	}
    }
	
	public static void scrollObjectsGroupOfAxisYByDistance(Object[] objectGroup, int distance) {
    	for(int i = 0; i < objectGroup.length; i++) {
    		objectGroup[i].setYPlusParameter(distance);
    	}
    }
	
}
