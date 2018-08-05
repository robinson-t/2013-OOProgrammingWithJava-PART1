public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int yearsDif;
        int thisSum = this.month * this.day;
        int comparedSum = comparedDate.month * comparedDate.day;
        
        if (this.year > comparedDate.year) {
            if (thisSum >= comparedSum) {
                yearsDif = this.year - comparedDate.year;
            } else {
                yearsDif = this.year - comparedDate.year - 1;
            }
        } else if (this.year < comparedDate.year) {
            if (comparedSum >= thisSum) {
                yearsDif = comparedDate.year - this.year;
            } else {
                yearsDif = comparedDate.year - this.year - 1;
            }
        } else {
            yearsDif = 0;
        }
        return yearsDif;
        
    }
    
    

}
