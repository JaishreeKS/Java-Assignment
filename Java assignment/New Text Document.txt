public class Holiday{
    private String name;
    private int day;
    private String month;

    // Constructor Holiday
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    // inSameMonth method to compare if two holidays are in the same month
    public boolean inSameMonth(Holiday otherHoliday){
        return this.month.equals(otherHoliday.month);
    }

    // avgDate method to calculate the average day of holidays
    public static double avgDate(Holiday[] holidays){
        int totalDays = 0;
        for(Holiday holiday : holidays){
            totalDays += holiday.day;
        }
        return (double)totalDays / holidays.length;
    }

    public String getName(){
        return name;
    }
    public int getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }

    // Main method for class Holiday
    public static void main(String[] args){
        // Holiday instance for Independence Day
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        // displaying the details of Independence Day
        System.out.println("Holiday Name: " + independenceDay.getName());
        System.out.println("Day: " + independenceDay.getDay());
        System.out.println("Month: " + independenceDay.getMonth());

        // an array for other Holiday instances
        Holiday[] holidays = {
            independenceDay,
            new Holiday("New Year's Day", 1, "January"),
            new Holiday("Christmas", 25, "December"),
            new Holiday("Labor Day", 1, "May"),
            new Holiday("Halloween", 31, "October")
        };

        // calculating the average day of holidays
        double averageDay = Holiday.avgDate(holidays);
        System.out.println("Average Day: " + averageDay);

        // if two holidays are in the same month
        boolean sameMonth = independenceDay.inSameMonth(holidays[4]);
        System.out.println("Independence Day and Halloween in same month: " + sameMonth);
    }
}

