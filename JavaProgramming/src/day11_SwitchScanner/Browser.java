package day11_SwitchScanner;

public class Browser {

    public static void main(String[] args) {

        /*
        Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
         */

        /*
         String browserName = "chrome";
        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                            || browserName == "safari" || browserName == "edge" ;
        if(validBrowser){

            if(browserName == "chrome"){
               result = "Chrome Browser is Selected";
            }else if(browserName == "firefox"){
                result = "FireFox Browser is Selected";
            }else if(browserName == "opera"){
                result = "Opera Browser is Selected";
            }else if(browserName == "safari"){
                result = "Safari Browser is Selected";
            }else{
                result = "Edge Browser is Selected";
            }

        }else{
            result = "Invalid Browser Name";
         */
        String browserName = "tru";

        String selected = (browserName == "chrome"|| browserName == "firefox"|| browserName =="opera" || browserName == "safari"
        || browserName == "edge")? (browserName == "chrome")? "Chrome Browser is selected" :(browserName =="opera")? "Opera Browser is selected"
               : (browserName == "safari")? "Safari Browser is selected" :(browserName == "edge")? "Safari Browser is selected"
                :"Firefox Browser is selected" : "Invalid";

        System.out.println(selected);

    }
}
