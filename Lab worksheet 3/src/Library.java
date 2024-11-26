import java .util.ArrayList;
public class Library {
    private ArrayList<BorrowableItems> BorrowableItemsList;

    public Library() {
        BorrowableItemsList = new ArrayList<>();
    }

    public void AddItem(BorrowableItems item) {
        BorrowableItemsList.add(item);
    }

    public void Check(String Objject) {
        for (BorrowableItems items : BorrowableItemsList) {
            if (items.toString().contains(Objject)) {
                Book book = (Book) items;
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book checked out: " + book.getTitle()+ book);
                } else {
                    System.out.println("Book is already checked out."+ book);
                }


            }
        }
    }

    public void listAvailableItems() {
        System.out.println("Available Books:");
        for (BorrowableItems item : BorrowableItemsList)
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                    System.out.println();
                }
            }

    }
    public void displayLibraryInfo() {
            int availableCount = 0;
            for (BorrowableItems item : BorrowableItemsList) {
                if (item instanceof Book && ((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
            System.out.println("Total available items: " + availableCount);
    }



}