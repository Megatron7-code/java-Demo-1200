package com.vm322.d118;

import java.awt.*;

public class GPSCar extends Car implements GPS {

    @Override
    public Point getLocation() {
        Point point = new Point();
        point.setLocation(super.getSpeed(), super.getSpeed());
        return point;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(super.toString());
        sbuilder.append(",坐标: (" + getLocation().x + ", " + getLocation().y + ")");
        return sbuilder.toString();
    }
}
