package day35_Encapsulation.encapsulation;

public class Credentials {
    //    Variables:
//    username, password
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
/*
1. Password MUST be at least have 8
characters long, and should not
contain space
2. PassWord should at least contain
one letter
3. Password should at least contain
one special characters
4. Password should at least contain a
digit
 */
       for (int i = 0; i < password.length(); i++) {
           char each = password.charAt(i);

            if (password.contains(" ") && (password.length() >= 8)){
                System.err.println("wrong entry: "+password+ ", should be more than 8 letters and no spaces");
                System.exit(0);
            } else if (!Character.isSpaceChar(each)) {
                System.err.println("wrong entry: " + password + ", should be at least one specChar");
                System.exit(0);
            }else if (!Character.isLetter(each)){
                System.err.println("wrong entry: " + password + ", should be at least one letter");
                System.exit(0);
            } else if (!Character.isDigit(each)) {
                System.err.println("wrong entry: "+password+ ", should be at least one digit");
                System.exit(0);
            }
            this.password = password;
        }
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Credentials input1 = new Credentials("Muhammet", "Br1kjhkj234@");

        System.out.println(input1);


    }
}
/*
create a class named Credentials
Variables:
username, password
Methods:
isStrongPassWord(): takes an argument of string and verify
if the given string is strong password
Characteristics of strong passwords are:
1. Password MUST be at least have 8
characters long, and should not
contain space
2. PassWord should at least contain
one letter
3. Password should at least contain
one special characters
4. Password should at least contain a
digit
getPassword(): reads the password
getUsername(): reads the username
setUsername(): sets the username
setPassword(): sets a new password
the new password MUST be a strong
password
toString():
 */