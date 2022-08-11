package com.myShapes;

class square extends dimensions{
    public double area(){
        return 2*sides;
    }
}

public class Ex_05_Square{
    public static void main(String[] args) {
        square sq = new square();
        sq.setSides(5);
        System.out.format("%.1f",sq.area());
    }
    
}
