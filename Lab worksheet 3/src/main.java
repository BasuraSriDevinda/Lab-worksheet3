public class main {

        public static void main(String[] args) {
            // Creating a Library instance
            Library library = new Library();

            // Creating Book objects using provided information
            Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
            Book book2 = new Book("Nuranakdaya Bauithka Nuladnaayakshanamaala", "Seymanaseakaka", "9789553548721", true);
            Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);
            library.AddItem(book1);
            library.AddItem(book2);
            library.AddItem(book3);



            // Display library information
            library.displayLibraryInfo();

            // List available items
            library.listAvailableItems();



            // List available items after checkout
            library.listAvailableItems();

            // Display library information after checkout
            library.displayLibraryInfo();
        }


}
