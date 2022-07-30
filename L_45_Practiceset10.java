//class circle{
//    public double radius;
//
//    public circle(int r) {
//        this.radius = r;
//    }
//    public double area(){
//        return Math.PI*radius*radius;
//    }
//}
//class cylinder extends circle{
//    public double height;
//
//    public cylinder(int r, int h) {
//        super(r);
//        this.height = h;
//    }
//    public double volume(){
//        return Math.PI*radius*radius*height;
//    }
//    public double area(){
//        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
//    }
//}
//
//class rectangle{
//    public double length;
//    public double breadth;
//
//    public double getLength() {
//        return length;
//    }
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getBreadth() {
//        return breadth;
//    }
//    public void setBreadth(double breadth){
//        this.breadth=breadth;
//    }
//
////    public rectangle(double l, double b){     //Commented because of setters and getters
////        this.length=l;
////        this.breadth=b;
////    }
//    public double area(){
//        return length*breadth;
//    }
//}
//class cuboid extends rectangle{
//    public double height;
//
////    public cuboid(double l,double b,double h){    //Commented because of setters and getters
////        super(l,b);
////        this.height=h;
////    }
//
//    public double getHeight(){
//        return height;
//    }
//    public void setHeight(double height){
//        this.height = height;
//    }
//
//
//    public double volume(){
//        return length*breadth*height;
//    }
//    public double area(){
//        return 2*length*breadth+2*length*height+2*height*breadth;
//
//    }
//}
//public class L_45_Practiceset10 {
//    public static void main(String[] args) {
//        // Problem : 1
//
//        circle c = new circle(5);
//        System.out.println(c.area());
//        cylinder cy = new cylinder(5,8);
//        System.out.println(cy.volume));
//
//        // Problem : 2
//
//        rectangle rec = new rectangle(2,4);
//        System.out.println(rec.area());
//        cuboid cu = new cuboid(2,2,4);
//        System.out.println(cu.volume());
//
//        // Problem : 3
//
//        System.out.println(cy.area());
//
//        // problem : 4
//
//        rectangle rec = new rectangle();
//        rec.setBreadth(7);
//        System.out.println(rec.getBreadth());
//        rec.setLength(3);
//        System.out.println(rec.getLength());
//        System.out.println("");
//        cuboid cu = new cuboid();
//        cu.setLength(3);
//        System.out.println(cu.getLength());
//        cu.setBreadth(7);
//        System.out.println(cu.getBreadth());
//        cu.setHeight(9);
//        System.out.println(cu.getHeight());
//        System.out.println(cu.area());
//
//
//
//    }
//}
