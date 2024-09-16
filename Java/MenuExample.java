import javafx.scene.Group; import javafx.scene.Scene; import javafx.scene.control.Menu; import javafx.scene.control.MenuBar; import javafx.scene.control.MenuItem; import javafx.scene.paint.Color; import javafx.stage.Stage; 
public class MenuExample extends Application  
{ 
   public void start(Stage stage)  
   { 
       	//Creating a menu 
      Menu fileMenu = new Menu("File"); 
       	//Creating menu Items 
      MenuItem item1 = new MenuItem("Add Files"); 
      MenuItem item2 = new MenuItem("Start Converting"); 
      MenuItem item3 = new MenuItem("Stop Converting"); 
      MenuItem item4 = new MenuItem("Remove File"); 
      MenuItem item5 = new MenuItem("Exit"); 
       	//Adding all the menu items to the menu       fileMenu.getItems().addAll(item1, item2, item3, item4, item5);        	//Creating a menu bar and adding menu to it.       MenuBar menuBar = new MenuBar(fileMenu); 
      menuBar.setTranslateX(200);       menuBar.setTranslateY(20); 
       	//Setting the stage 
      Group root = new Group(menuBar); 
      Scene scene = new Scene(root, 595, 200, Color.BEIGE);       stage.setTitle("Menu Example");       stage.setScene(scene); 
      stage.show(); 
   } 
   public static void main(String args[]) 
   { 
      launch(args); 
   } 
} 
 
 
