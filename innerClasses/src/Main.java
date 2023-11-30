//public class Main {
//    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//    }
//}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        OuterClass myOuther = new OuterClass();
        System.out.println(myInner.y + "  " +  myOuther.x);
    }
}

//class OuterClass {
//    int x = 10;
//
//    class InnerClass {
//        int y = 5;
//    }
//}

//class OuterClass {
//    int x = 10;
//
//    private class InnerClass {
//        int y = 5;
//    }
//}
class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}


//1. class dotor class zarlahiiig inner class gej bgaa

