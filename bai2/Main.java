package bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D $2d = new Point3D();
//        Point3D test = new Point3D();
//        test.setXYZ(11,12,13);
        Point3D $3d = (Point3D) $2d;
        $3d.setXYZ(1, 2, 3);
        ((Point3D) $2d).getXYZ();
        ((Point3D) $2d).setXYZ(1, 2,3);
        Point2D check = new Point3D();
        Point3D point3D = (Point3D) check;
        ((Point3D) check).getXYZ();
        check.setXY(2, 1);
        System.out.println($3d);
        System.out.println($2d);
        System.out.println(Arrays.toString(((Point3D) check).getXYZ()));
        System.out.println(Arrays.toString($3d.getXYZ()));
        System.out.println(Arrays.toString($2d.getXY()));
        System.out.println(Arrays.toString(check.getXY()));

//        System.out.println(test.move());
    }
}
