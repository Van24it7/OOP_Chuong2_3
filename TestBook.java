public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);
        author1.setEmail("ahteck@somewhere.comc");
        System.out.println(author1);
        System.out.println("Name is: "+author1.getName());
        System.out.println("Email is: "+author1.getEmail());

        Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);
        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("Isbn is: "+book1.getIsbn());
        System.out.println("Name is: "+book1.getName());
        System.out.println("Price is: "+book1.getPrice());
        System.out.println("Qty is: "+book1.getQty());
        System.out.println("author is: "+ book1.getAuthor());
        System.out.println("author' name: "+book1.getAuthorName());
        System.out.println("author' name: "+book1.getAuthor().getName());
        System.out.println("author's name:"+book1.getAuthor().getEmail());
    }
}
