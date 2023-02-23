
public class Book
{
   private String isbn;
   private String title;
   private int editionNumber;
   private String copyright;
   private Author[] authors;
   
   public Book(String isbn, String title, int editionNumber, String copyright, Author[] authors)
   {
      this.isbn = isbn;
      this.title = title;
      this.editionNumber = editionNumber;
      this.copyright = copyright;
      this.authors = authors;
   }
   
   public void setISBN(String isbn)
   {
      this.isbn = isbn;
   }
   
   public String getISBN()
   {
      return isbn;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setEditionNumber(int editionNumber)
   {
      this.editionNumber = editionNumber;
   }
   
   public int getEditionNumber()
   {
      return editionNumber;
   }
   
   public void setCopyright(String copyright)
   {
      this.copyright = copyright;
   }
   
   public String getCopyright()
   {
      return copyright;
   }
   
   public String getAuthor(int index)
   {
      return authors[index - 1].toString();
   }
   
   public int getNumberOfAuthors()
   {
      return authors.length;
   }
   
   public String toString()
   {
      String str = "ISBN: " + isbn + ", title: " + title + ", Copyright: " + copyright + ", Edition: " + editionNumber;
      for(int i = 0; i < authors.length; i++)
      {
         str += authors[i].toString();
      }
      
      return str;
   }
   
   
   
   
   
}
