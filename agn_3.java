class agn_3{
    public static void main(){
        int time = 461, years, months, days, x;
        years = time/365; // Calculating number of years
        x = time%365;
        months = x/30; // Calculating number of months
        days = x%30; //  Calculating the number of days
        System.out.println("461 days consists of " + years + " years, " + months + " months and " + days + " days."); // Displaying the number of years, months and days in 461 days
    }
}