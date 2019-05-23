abstract class GetTime {
    public void getTime() {
        long start = System.currentTimeMillis();
        runcode();
        long end = System.currentTimeMillis();
        System.out.println("Time(ms):"+(end-start));
    }
    public abstract void runcode();
}

class Subtime extends GetTime {
    public void runcode()
    {
        for (int x = 0; x<4000; x++)
        {
            System.out.print(x);
        }
        System.out.println("\n");
    }
}

class run_time{
    public static void main(String[] args)
    {
        Subtime tm = new Subtime();
        tm.getTime();
    }

}