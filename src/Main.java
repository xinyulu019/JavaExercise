public class Main {
    public static void main(String[] args) {
        System.out.println("9x9");
        new Building9x9().show9x9();
        System.out.println("------------------------------------------------------");

        System.out.println("三角形");
        new BuildingTriangle().showTriangle(5);
        System.out.println("------------------------------------------------------");
        new BuildingTriangle().showTriangle2(5);
        System.out.println("------------------------------------------------------");
        new BuildingTriangle().showTriangle3(5);
        System.out.println("------------------------------------------------------");
        new BuildingTriangle().showTriangle4(5);
        System.out.println("------------------------------------------------------");
        new BuildingTriangle().showTriangle5(5);
        System.out.println("------------------------------------------------------");

    }
}