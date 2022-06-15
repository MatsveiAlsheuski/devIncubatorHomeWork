package module3Classes.Task4;

public enum DaysOfTheWeek {
    MONDAY("MON", "not a weekend"),
    TUESDAY("TUE", "not a weekend"),
    WEDNESDAY("WED", "not a weekend"),
    THURSDAY("THU", "not a weekend"),
    FRIDAY("FRI", "not a weekend"),
    SATURDAY("SAT", "a weekend"),
    SUNDAY("SUN", "a weekend");

    private String title;
    private String inform;

    private DaysOfTheWeek(String title, String inform) {
        this.title = title;
        this.inform = inform;
    }


    public static DaysOfTheWeek initializer(int number) {
        switch (number) {
            case 1:
                System.out.println(MONDAY);
                return MONDAY;
            case 2:
                System.out.println(TUESDAY);
                return TUESDAY;
            case 3:
                System.out.println(WEDNESDAY);
                return WEDNESDAY;
            case 4:
                System.out.println(THURSDAY);
                return THURSDAY;
            case 5:
                System.out.println(FRIDAY);
                return FRIDAY;
            case 6:
                System.out.println(SATURDAY);
                return SATURDAY;
            default:
                System.out.println(SUNDAY);
                return SUNDAY;
       /* switch (number) {
            case 1:
                MONDAY.title = "MON";
                MONDAY.inform = "not a weekend";
                System.out.println(MONDAY);
                return MONDAY;
            case 2:
                TUESDAY.title = "TUE";
                TUESDAY.inform = "not a weekend";
                return TUESDAY;
            case 3:
                WEDNESDAY.title = "WED";
                WEDNESDAY.inform = "not a weekend";
                return WEDNESDAY;
            case 4:
                THURSDAY.title = "THU";
                THURSDAY.inform = "not a weekend";
                return THURSDAY;
            case 5:
                FRIDAY.title = "FRI";
                FRIDAY.inform = "not a weekend";
                return FRIDAY;
            case 6:
                SATURDAY.title = "SAT";
                SATURDAY.inform = "a weekend";
                return SATURDAY;
            default:
                SUNDAY.title = "SUN";
                SUNDAY.inform = "a weekend";
                return SUNDAY;
*/
        }
    }

    @Override
    public String toString() {
        return name() + " (" + title + ") is " + inform + ".";
    }

}