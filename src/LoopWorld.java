public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();
    }

    public LoopWorld() {
        pattern15();
    }

    public void pattern1() {
        for(int x=0;x<=25;x=x+5) {
            System.out.println("Pattern 1: " + x);
        }
    }

    public void pattern2() {
        for(int x=2;x<=27;x=x+5) {
            System.out.println("Pattern 2: " + x);
        }
    }

    public void pattern3() {
        for(int x=21;x>=1;x=x-4) {
            System.out.println("Pattern 3: " + x);
        }
    }

    public void pattern4() {
        for(int x=3;x<=11;x=x+2) {
            for(int y=1;y<=36;y=y+x) {
                System.out.println("Pattern 4: " + y);
            }
        }
    }

    public void pattern5() {
        for(int x=1;x<=4;x++) {
            for(int y=1;y<=4;y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        for(int x=1;x<=5;x++) {
            for(int y=0;y<x-1;y++) {
                System.out.print(" ");
            }
            System.out.println(x);
        }
    }

    public void pattern7() {
        for(int x=1;x<=5;x++) {
            for(int y=5;y>=x;y--) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public void pattern8() {
        for(int x=5;x>=1;x--) {
            for(int y=5;y>=x;y--) {
                System.out.print(" ");
            }
            for(int y=0;y<=x-1;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9() {
        for(int x=1;x<=5;x++) {
            for(int y=1;y<=x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern10() {
        for(int x=1;x<=5;x++) {
            for(int y=1;y<=x;y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public void pattern11() {
        for(int x=1;x<=5;x++) {
            for(int y=1;y<=x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x=4;x>=1;x--) {
            for(int y=1;y<=x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern12() {
        for(int x=5;x>=1;x--) {
            for(int y=1;y<=x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x=2;x<=5;x++) {
            for(int y=1;y<=x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern13() {
        for(int x=5;x>=1;x--) {
            for(int y=x;y>=1;y--) {
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x=2;x<=5;x++) {
            for(int y=x;y>=1;y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern14() {
        for(int x=1;x<=7;x++) {
            for(int y=0;y<=x-1;y++) {
                System.out.print("*");
            }
            for(int z=6-x;z>=0;z--) {
                System.out.print(" ");
            }
            for(int z=6-x;z>=0;z--) {
                System.out.print(" ");
            }
            for(int y=0;y<=x-1;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern15() {
        for(int x=1;x<=20;x++) {
            for(int y=1;y<=20;y++) {
                System.out.print(x*y + "\t");
            }
            System.out.println();
        }
    }



}
