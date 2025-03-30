package question2;

class libraryUser{
protected String UserId;
protected String name;
protected String email;

libraryUser(String userId,String name,String email){
    this.UserId=userId;
    this.email=email;
    this.name=name;

}
    public void displayDetails() {
        System.out.println("User ID is"+UserId);
        System.out.println("Name is "+name);
        System.out.println("Email is "+email);
    }

}
     class Librarian   extends  libraryUser {
         public String employeeId;
         public String workShift;

         Librarian (String employeeId ,String workShift,String userId,String name,String email) {
             super(userId,name,email);
           this.employeeId=employeeId;
           this. workShift=workShift;
         }
         public void display() {
             super.displayDetails();
             System.out.println("employee id is "+employeeId);
             System.out.println("Work SHift is "+workShift);
         }
     }

  class Member extends libraryUser{
private String membershipId;
private int borrowedBooksCount;

     public Member( String membershipId,int borrowedBooksCount, String userId,String name,String email) {
          super(userId,name,email);
          this.membershipId = membershipId;
          this.borrowedBooksCount = borrowedBooksCount;
      }

      public void display() {
          super.displayDetails();
          System.out.println("membership id is "+membershipId);
          System.out.println("borrowedBooksCount is "+borrowedBooksCount);
      }
}
   class Guest extends libraryUser{
       private String visitPurpose;

     public   Guest ( String visitPurpose,String userId,String name,String email) {
           super(userId,name,email);
           this.visitPurpose = visitPurpose;

       }
       public void display() {
           super.displayDetails();
           System.out.println("visit purpose is "+visitPurpose);

       }
   }


public class main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("E123", "Morning", "U567", "Taha", "Taha@example.com");
        Member member = new Member("M567", 3,"U345","Bilal","bilal@example.com" );
        Guest guest = new Guest("Research", "U897","Abdullah", "abdul@example.com");

        // Displaying details of each user
        System.out.println("\n Librarian Details ");
        librarian.displayDetails();

        System.out.println("\n Member Details ");
        member.displayDetails();

        System.out.println("\n Guest Details ");
        guest.displayDetails();

    }
}
