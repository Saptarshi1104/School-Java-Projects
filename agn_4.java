class agn_4{
    public static void main(){
        int periods = 7, time = 40, mins, hours; // Initializing the variables
        mins = periods * time; // Calculating the number of minutes in 7 periods
        hours = mins/60; // Calculating the number of hours in 7 periods
        System.out.println("There are: " + hours + " hours"); // Displaying the number of hours in 7 periods
    }
}