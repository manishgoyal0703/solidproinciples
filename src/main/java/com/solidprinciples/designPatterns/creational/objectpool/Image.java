package com.solidprinciples.designPatterns.creational.objectpool;

//Represents our abstract reusable
public interface Image{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
