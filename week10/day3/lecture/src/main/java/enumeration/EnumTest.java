package enumeration;

public class EnumTest {

    public Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void weeekendOrWeekday() {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend!");
                break;
            default:
                System.out.println("It's a weekday!");
                break;
        }
    }
}
