public class User {
//    TODO adding the attributes and the methods

    private String userName;
    private String name;
    private String contact;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void isRegistered(){
        System.out.println("Registered");
    }

    public void borrowBook(){
        System.out.println("Book Borrowed");
    }

    public void returnBook(){
        System.out.println("Book returned");
    }


}
