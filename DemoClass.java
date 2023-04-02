public class DemoClass {

    private String name;
    private long distFromSun;
    private long diameter;
    private int dayLength;


   public DemoClass(String name, long distFromSun, long diameter, int dayLength) {
        this.name = name;
        this.distFromSun = distFromSun;
        this.diameter = diameter;
        this.dayLength = dayLength;
    }

    public String getName() {
        return name;
    }

    public long getDistFromSun() {
        return distFromSun;
    }

  

    public long getDiameter() {
        return diameter;
    }

    public int getDayLength() {
        return dayLength;
    }
    
}
