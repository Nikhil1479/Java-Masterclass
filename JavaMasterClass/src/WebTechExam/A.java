package WebTechExam;

import org.w3c.dom.ls.LSOutput;

class A {
    String name = "a";

    String f1() {
        return "hello";
    }
}
    class B extends A {
        String name = "b";

        String f1() {
            return "bye";
        }
    }

    class C{
        public static void main(String[] args) {
            new C().f3();
            }
            void f3(){
            A o = new B();
                System.out.println(o.name + o.f1());
        }
    }
