package day31_Constructors;

public class Offer_WarmUpTask {

    //make attributes for 'Offer' object
    public String location;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO; // PTO - pay time off
    public boolean hasWFH; //WFH - work from home
    public boolean hasFullTime;

    public void setInfo(String location, String companyName, String jobTitle,
                            double salary, boolean hasBenefit, boolean hasPTO,
                            boolean hasWFH, boolean hasFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.hasWFH = hasWFH;
        this.hasFullTime = hasFullTime;
    }

    public String toString() {
        return "Offer_WarmUpTask{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", hasWFH=" + hasWFH +
                ", hasFullTime=" + hasFullTime +
                '}';
    }
}
/*
1. Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH,
                     isFullTime

            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
 */