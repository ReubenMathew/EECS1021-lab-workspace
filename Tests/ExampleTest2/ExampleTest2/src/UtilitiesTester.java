public class UtilitiesTester {
    public static void main(String[] args) {
        Utilities u = new Utilities();

        int[] ia1 = {};
        int[] ia2 = {75};
        int[] ia3 = {76};
        int[] ia4 = {5, 10, 15, 20, 25}; // {5, 10, 15, 10, 5}
        int[] ia5 = {5, 10, 15, 19, 25};
        int[] ia5b = {4, 11, 14, 25, 19};

        System.out.println("============averageOf");
        System.out.println(u.averageOf(ia2));
        System.out.println(u.averageOf(ia3));
        System.out.println(u.averageOf(ia4));
        System.out.println(u.averageOf(ia5));

        System.out.println("============allMultiplesOf5");
        System.out.println(u.allMultiplesOf5(ia1));
        System.out.println(u.allMultiplesOf5(ia2));
        System.out.println(u.allMultiplesOf5(ia3));
        System.out.println(u.allMultiplesOf5(ia4));
        System.out.println(u.allMultiplesOf5(ia5));
        System.out.println(u.allMultiplesOf5(ia5b));

        System.out.println("============atLeastOneMultipleOf5");
        System.out.println(u.atLeastOneMultipleOf5(ia1));
        System.out.println(u.atLeastOneMultipleOf5(ia2));
        System.out.println(u.atLeastOneMultipleOf5(ia3));
        System.out.println(u.atLeastOneMultipleOf5(ia4));
        System.out.println(u.atLeastOneMultipleOf5(ia5));
        System.out.println(u.atLeastOneMultipleOf5(ia5b));

        int[] ia6 = {5, 5};
        int[] ia7 = {6, 5};
        int[] ia8 = {4, 9, 1, 5, 8, 3, 10, 7, 2, 6};
        int[] ia9 = {4, 10, 1, 5, 8, 3, 10, 7, 2, 6};
        int[] ia10 = {4, 9, 1, 5, 8, 3, 10, 7, 2, 9};

        System.out.println("============secondMaximumOf");
        System.out.println(u.secondMaximumOf(ia6));
        System.out.println(u.secondMaximumOf(ia7));
        System.out.println(u.secondMaximumOf(ia8));
        System.out.println(u.secondMaximumOf(ia9));
        System.out.println(u.secondMaximumOf(ia10));

        System.out.println("============reverseOf");
        System.out.println(toString(u.reverseOf(ia1)));
        System.out.println(toString(u.reverseOf(ia2)));
        System.out.println(toString(u.reverseOf(ia3)));
        System.out.println(toString(u.reverseOf(ia4)));
        System.out.println(toString(u.reverseOf(ia5)));

        System.out.println("============isReverseOfEachOther");
        System.out.println(u.isReverseOfEachOther(ia2, ia3));
        System.out.println(u.isReverseOfEachOther(ia4, ia5));
        System.out.println(u.isReverseOfEachOther(ia4, ia4));
        System.out.println(u.isReverseOfEachOther(ia1, ia1));
        System.out.println(u.isReverseOfEachOther(ia4, u.reverseOf(ia4)));

        System.out.println("============getArithSeq");
        System.out.println(toString(u.getArithSeq(3, 2, 0)));
        System.out.println(toString(u.getArithSeq(3, 2, 1)));
        System.out.println(toString(u.getArithSeq(3, 2, 5)));
        System.out.println(toString(u.getArithSeq(3, -2, 0)));
        System.out.println(toString(u.getArithSeq(3, -2, 1)));
        System.out.println(toString(u.getArithSeq(3, -2, 5)));

        int[] ia11 = {};
        int[] ia12 = {5};
        int[] ia13 = {5, 8};
        int[] ia14 = {5, 2};
        int[] ia15 = {5, 8, 11, 14};
        int[] ia16 = {5, 2, -1, -4};
        int[] ia17 = {5, 8, 11, 15};
        int[] ia18 = {5, 2, -2, -5};

        System.out.println("============isArithSeq");
        System.out.println(u.isArithSeq(ia11));
        System.out.println(u.isArithSeq(ia12));
        System.out.println(u.isArithSeq(ia13));
        System.out.println(u.isArithSeq(ia14));
        System.out.println(u.isArithSeq(ia15));
        System.out.println(u.isArithSeq(ia16));
        System.out.println(u.isArithSeq(ia17));
        System.out.println(u.isArithSeq(ia18));

        System.out.println("============getFibSeq");
        System.out.println(toString(u.getFibSeq(0)));
        System.out.println(toString(u.getFibSeq(1)));
        System.out.println(toString(u.getFibSeq(2)));
        System.out.println(toString(u.getFibSeq(3)));
        System.out.println(toString(u.getFibSeq(4)));
        System.out.println(toString(u.getFibSeq(5)));
        System.out.println(toString(u.getFibSeq(6)));
        System.out.println(toString(u.getFibSeq(7)));

        int[] ia19 = {};
        int[] ia20 = {1};
        int[] ia21 = {1, 1};
        int[] ia22 = {1, 1, 2};
        int[] ia23 = {1, 1, 2, 3, 5, 8};
        int[] ia24 = {2};
        int[] ia25 = {1, 2};
        int[] ia26 = {1, 1, 2, 3, 4, 7};
        int[] ia27 = {3, 3, 6, 9, 15, 24, 39};

        System.out.println("============isFibSeq");
        System.out.println(u.isFibSeq(ia19));
        System.out.println(u.isFibSeq(ia20));
        System.out.println(u.isFibSeq(ia21));
        System.out.println(u.isFibSeq(ia22));
        System.out.println(u.isFibSeq(ia23));
        System.out.println(u.isFibSeq(ia24));
        System.out.println(u.isFibSeq(ia25));
        System.out.println(u.isFibSeq(ia26));
        System.out.println(u.isFibSeq(ia27));

        String[] sa = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
        String[] ea = {}; // empty array

        System.out.println("============numberOfOccurrences");
        System.out.println(u.numberOfOccurrences(sa, "a"));
        System.out.println(u.numberOfOccurrences(sa, "b"));
        System.out.println(u.numberOfOccurrences(sa, "c"));
        System.out.println(u.numberOfOccurrences(sa, "d"));
        System.out.println(u.numberOfOccurrences(sa, "e"));
        System.out.println(u.numberOfOccurrences(ea, "a"));
        System.out.println(u.numberOfOccurrences(ea, "e"));

        System.out.println("============getIndices");
        System.out.println(toString(u.getIndices(sa, "a")));
        System.out.println(toString(u.getIndices(sa, "b")));
        System.out.println(toString(u.getIndices(sa, "c")));
        System.out.println(toString(u.getIndices(sa, "d")));
        System.out.println(toString(u.getIndices(sa, "e")));
        System.out.println(toString(u.getIndices(ea, "a")));
        System.out.println(toString(u.getIndices(ea, "e")));
    }

    /*
        Helper method for returning the
        string representation of an array.
        Do not modify this helper method.
     */
    public static String toString(int[] a) {
        String s = null;
        if(a != null) {
            s = "{";
            for(int i = 0; i < a.length; i ++) {
                s += a[i];
                if(i < a.length - 1) {
                    s += ",";
                }
            }
            s += "}";
        }
        return s;
    }
}
