public class ques5 {
    int z;
    void ques5 ()
    {
        z = 0;
    }
    void ques5 ( int x)
    {
        z = z + x;
    }
    void ques5 ( int x, int y)
    {
        System.out.println(z);
        System.out.println(z +"-"+x+"-" +y);
    }
    public static void main(String[] args) {
        ques5 obj = new ques5();
        obj.ques5();
        obj.ques5(5);
        obj.ques5(8, 2);
    }
}
