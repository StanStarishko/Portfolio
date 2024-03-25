
public interface MenusTools {
    void setContainerMenu(String textMenu, String textColor, String typeMunu);
    void showMenu();
    String getContainerMenu(String typeMunu);
    int getMenuItemSelection(int maxItem);
}