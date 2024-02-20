package com.solidprinciples.designPatterns.structural.proxy;


//Proxy class.
public class ImageProxy implements Image{

    private String name;
    private Point2D location;

    private BitmapImage image;

    public ImageProxy(String name){
        this.name = name;
    }
    @Override
    public void setLocation(Point2D point2d) {
        if(image !=null){
            image.setLocation(point2d);
        } else {
            this.location = point2d;
        }
    }

    @Override
    public Point2D getLocation() {
        if(image !=null){
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if(image == null){
            image = new BitmapImage(name);
            if(location !=null){
                image.setLocation(location);
            }
        }
        image.render();
    }
}
