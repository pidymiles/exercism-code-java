class BirdWatcher {
    //Array for storing data from current week
    private final int[] birdsPerDay;
    
    //Array for storing data from last week with length of 7 elements
    private int[] lastWeekCount = new int[7];

    //Object instance is created with two arrays, one for the current week, and one for the previous week
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.lastWeekCount = birdsPerDay.clone();
    }
    //Return Last Week data
    public int[] getLastWeek() {
        //Test case #4: Return count from previous week, array returned must be exactly 7 elements in length
        return this.lastWeekCount;
    }
    //Return number of Birds watched Today
    public int getToday() {
        //Test case #2: Zero should be returned if Bird Watcher's data from Last week is empty
        if (this.birdsPerDay.length == 0) {
            return 0;
        }
        //Test case #8: Return last index of birdsPerDaty which is equal to the number of birds watched Today
        return this.birdsPerDay[birdsPerDay.length-1];
    }
    //Increment array for current week
    public void incrementTodaysCount() {
        //Test case #9: Return makes Birdwatcher.getToday() method return Array list with Today + 1 as the last element
        this.birdsPerDay[birdsPerDay.length-1]+=1;
    }
    //Boolean for testing if there have been zero birds spotted on any day for current week
    public boolean hasDayWithoutBirds() {
       /* Test Case #5: 
        * Loop For-Each bird in birdsPerDay
        * Return true if any element in birdsPerDay contains 0 integer value 
        * Return false if every element contains non-zero integer
        */
        for (int birds : this.birdsPerDay) {
            //If value in current index is equal to 0, return true for hasDayWithoutBirds()
            if (birds == 0) return true;
        }
        //If value in current indeX is not equal to 0, return false for hasDayWithoutBirds()
        return false;
    }
    //Method for returning sum of each element in birdsPerDay array
    public int getCountForFirstDays(int numberOfDays) {
        //Create variable for Sum
        int sum = 0;
       /*
        *Test case #10: 
        * If parameter numberOfDays is greater than length of birdsPerDay, 
        *sets numberofDays to be equal to current length of birdsPerDay
        */
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
            }
       /* Test case #7: 
        * For loop which iterates for number of days that have passed in the current week, 
        * value in current index of birdsPerDay is added to sum
        */
        for (int i = 0; i < numberOfDays; i++) {
                sum = sum + this.birdsPerDay[i];     
        }
        //Return total number of birds so far in current week
        return sum;
    }
   /* Test case #6: 
    * Every day in which 5 or more birds are watched is considered a busy day.
    * This method returns the number of busy days in the current week
    */
    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
