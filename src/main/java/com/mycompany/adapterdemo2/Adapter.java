package com.mycompany.adapterdemo2;

import com.mycompany.adapterdemo2.shape.Triangle;

import com.mycompany.adapterdemo2.shape.RectInterface;

public class Adapter extends Triangle implements RectInterface {
    @Override
    public void aboutMe() {
        aboutTriangle();
    }
    
}
