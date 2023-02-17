public abstract class People
{

   private String name;

   private String address;

   private MyDate birthday;

   public People(String name, String address, MyDate birthday)
   {
      this.name = name;
      this.address = address;
      this.birthday = birthday;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public String getAddress()
   {
      return address;
   }

   public void setBirthday(MyDate birthday)
   {
      this.birthday = birthday;
   }

   public MyDate getBirthday()
   {
      return birthday;
   }

   public abstract String toString();

}
