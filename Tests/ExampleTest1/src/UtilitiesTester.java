public class UtilitiesTester
{
    public static void main(String[] args) {
        Utilities u = new Utilities();

        System.out.println("(1)=========================");
        System.out.println("areaOfCircle(5): " + u.areaOfCircle(5));

        System.out.println("(2)=========================");
        System.out.println("averageOf(23, 45, 67, 19): " + u.averageOf(23, 45, 67, 19));

        System.out.println("(3)=========================");
        System.out.println("maximumOf(23, 45, 67): " + u.maximumOf(23, 45, 67));
        System.out.println("(4)=========================");
        System.out.println("maximumOf(45, 67, 23): " + u.maximumOf(45, 67, 23));
        System.out.println("(5)=========================");
        System.out.println("maximumOf(67, 45, 23): " + u.maximumOf(67, 45, 23));

        System.out.println("(6)=========================");
        System.out.println("isArithmeticSeq(23, 23, 23, 23): " + u.isArithmeticSeq(23, 23, 23, 23));
        System.out.println("(7)=========================");
        System.out.println("isArithmeticSeq(23, 46, 69, 92): " + u.isArithmeticSeq(23, 46, 69, 92));
        System.out.println("(8)=========================");
        System.out.println("isArithmeticSeq(23, 0, -23, -46): " + u.isArithmeticSeq(23, 0, -23, -46));
        System.out.println("(9)=========================");
        System.out.println("isArithmeticSeq(23, 46, 68, 90): " + u.isArithmeticSeq(23, 46, 68, 90));
        System.out.println("(10)=========================");
        System.out.println("isArithmeticSeq(23, 0, -24, -48): " + u.isArithmeticSeq(23, 0, -24, -48));
    }
}
