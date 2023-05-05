public class Chocolate extends Product{

    private int calorie;

   public int getCalorie() {
        return calorie;
    }

    public Chocolate(String name, double price, int calorie){
        super(name, price);
        this.calorie = calorie;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - каллории: %d", brand, name, price, calorie);

    }
}
