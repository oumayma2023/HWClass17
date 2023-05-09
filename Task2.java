package HWClass17;

public class Task2 {

    public class MyClass {
        private int value1;
        public int value2;
        int value3;
        protected int value4;

        private MyClass(int v1) {
            value1 = v1;
        }

        public MyClass(int v1, int v2) {
            value1 = v1;
            value2 = v2;
        }

        MyClass(int v1, int v2, int v3) {
            value1 = v1;
            value2 = v2;
            value3 = v3;
        }

        protected MyClass(int v1, int v2, int v3, int v4) {
            value1 = v1;
            value2 = v2;
            value3 = v3;
            value4 = v4;
        }

        public void printValues() {
            System.out.println("value1: " + value1 + ", value2: " + value2 + ", value3: " + value3 + ", value4: " + value4);
        }
    }


       {
            MyClass obj1 = new MyClass(10);
            MyClass obj2 = new MyClass(20, 30);
            MyClass obj3 = new MyClass(40, 50, 60);
            MyClass obj4 = new MyClass(70, 80, 90, 100);

            obj1.printValues();
            obj2.printValues();
            obj3.printValues();
            obj4.printValues();
        }
    }

