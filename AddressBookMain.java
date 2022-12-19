package day9Practiceproblem.AddressBookSystem;



public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

    }

    public static class Contacts {
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int pinCode;
        long phoneNumber;
        String emailID;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPinCode() {
            return pinCode;
        }

        public void setPinCode(int pinCode) {
            this.pinCode = pinCode;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailID() {
            return emailID;
        }

        public void setEmailID(String email) {
            this.emailID = email;
        }

        public String toString() {
            return "Contacts [First Name: " + firstName + ", Last Name : " + lastName +
                    ", address : " + address + ", city: " + city + ",state : " + state + ",Pincode : "
                    + pinCode + ",Phone Number: " + phoneNumber + ", EmailID : " + emailID + "]";
        }

    }
}




