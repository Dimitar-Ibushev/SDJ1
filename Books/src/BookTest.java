
public class BookTest
{
   public static void main(String[] args)
   {
      Author author = new Author("Someone", "Else");
      Author[] arr = new Author[1];
      arr[0] = author;
      Book book = new Book("1234", "some", 3, "2010", arr);
      
      System.out.println(book);

   } 
}
