
class firstRecursion {
    // base is termination point and initial is starting point
    static void rec(int base, int initial){
        if(initial<=base){
            System.out.println(initial);
            rec(base,initial+1);
        }
        else{
            return;
        }
    }
    public static void main(String ar[]){
        rec(4,1);
    }
}
