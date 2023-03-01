public class BuildingTriangle {
    public void showTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void showTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void showTriangle3(int n) {
        for(int i = 0; i < n ; i++) {
            for(int k = (n-1); k > i; k--) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void showTriangle4(int n) {
        for(int i = 0; i < n ; i++) {
            for(int k = (n-1); k > i; k--) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            for(int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for(int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void showTriangle5(int n) {
        int x = 0;
        for(int i = 0; i < n ; i++) {
            for(int k = (n-1); k > i; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= x; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            x+=2;
        }
    }


}
