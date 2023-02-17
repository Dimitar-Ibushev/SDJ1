public class Customer extends People
{

   private String email;

   private String phone;

   public Customer(String name, String address, MyDate birthday)
   {
      super(name, address, birthday);
   }
   
   public Customer(String name, String address, MyDate birthday, String email,
         String phone)
   {
      super(name, address, birthday);
      this.email = email;
      this.phone = phone;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getEmail()
   {
      return email;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public String getPhone()
   {
      return phone;
   }

   public String toString()
   {
      return "Name: " + super.getName() + " Phone: " + getPhone() + " Email: "
            + getEmail() + "\n";
   }

}
