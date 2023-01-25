public class keyExercise3_7 {
    public static void printPrice(String item) {
        int dividerPosition = item.indexOf("--");
        String itemName = item.substring(0, dividerPosition);
        //...
        int slashPosition = item.indexOf("/");
        String itemPrice = item.substring(dividerPosition + 3, slashPosition) + "." + item.substring(slashPosition + 1, item.length());
        System.out.println(itemName.trim().toUpperCase() + ": " + itemPrice);

    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}

