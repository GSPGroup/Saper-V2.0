package fxml;


//КРГАЕНЕСАУЧІК
// генеруэться маын контролер. фхмд ы батон в любом колычествы як треба )
import java.io.FileWriter;
import java.io.IOException;

public class GeneratedFXML {
	public static 	int x = 10;// кількість клітинок в ширину
	public static 	int y = 10;// кількість клітинок в висоту
	public static  int button = x* y; // кількість клітинок всього
	

	public static void GenerationFXML() {
		int butone = button;
		int Goriz = x;
		int Verti = y;
		double prefHeight = Goriz*20.0+20;
		double prefWidth = Verti*20.0+10+100;
		// для генераціїї поля
		try (FileWriter writer = new FileWriter("D:/Dropbox/GSP/Saper/src/fxml/main.fxml", false)) {
			String text;
			 text= "<?xml version="+ "\"" +1.0+ "\"" +" encoding="+
			 "\"" +"UTF-8"+ "\"" +"?>" + "\r\n"
			 + " <?import javafx.scene.shape.*?>"+ "\r\n"
			 + " <?import javafx.scene.effect.*?>"+ "\r\n"
			 + " <?import javafx.scene.*?>"+ "\r\n"
			 + " <?import javafx.scene.text.*?>"+ "\r\n"
			 + " <?import javafx.geometry.*?>"+ "\r\n"
			 + " <?import java.lang.*?>"+ "\r\n"
			 + " <?import javafx.scene.control.*?>"+ "\r\n"
			 + " <?import javafx.scene.layout.*?>"+ "\r\n"
			 + "<Pane maxHeight="+ "\"" +prefHeight+ "\"" +" maxWidth="+ "\"" +prefWidth+ "\"" 
			 +" minHeight="+ "\"" +"20.0"+ "\"" +" minWidth="+ "\"" +"20.0"+ "\"" 
			 +" prefHeight="+ "\"" + prefHeight + "\"" +" prefWidth="+ "\"" +prefWidth+ "\"" 
			 +" stylesheets="+ "\"" +"/css/MainWindow.css"+ "\"" +" xmlns="+ "\"" +"http://javafx.com/javafx/8"+ "\"" 
			 +" xmlns:fx="+ "\"" +"http://javafx.com/fxml/1"+ "\"" +" fx:controller="+ "\"" +"controllers.MainController"+ "\"" +">"+ "\r\n"
			 +" <children>"+ "\r\n"
			 +" <Button fx:id="+ "\"" +"restartButton"+ "\"" +" layoutX="+ "\"" +"426.0"+ "\"" +" layoutY="+ "\"" +"158.0"+ "\"" +" mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"Restart"+ "\"" +" />"+ "\r\n"
//			 +"      <MenuBar>"+ "\r\n"
//			 +"        <menus>"+ "\r\n"
//			 +"      <Menu mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"File"+ "\"" +">"+ "\r\n"
//			 +"     <items>"+ "\r\n"
//		     +"       <MenuItem mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"Close"+ "\"" +" />"+ "\r\n"
//			 +"   </items>"+ "\r\n"
//			 +"          </Menu>"+ "\r\n"
//			 +"          <Menu mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"Edit"+ "\"" +">"+ "\r\n"
//			 +"            <items>"+ "\r\n"
//			 +"              <MenuItem mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"Delete"+ "\"" +" />"+ "\r\n"
//			 +"            </items>"+ "\r\n"
//			 +"          </Menu>"+ "\r\n"
//			 +"          <Menu mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"Help"+ "\"" +">"+ "\r\n"
//			 +"            <items>"+ "\r\n"
//			 +"              <MenuItem mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"About"+ "\"" +" />"+ "\r\n"
//			 +"            </items>"+ "\r\n"
//			 +"         </Menu>"+ "\r\n"
//			 +"       </menus>"+ "\r\n"
//			 +"      </MenuBar>"+ "\r\n"
			 +" <VBox layoutX="+ "\"" +"2.0"+ "\"" +" layoutY="+ "\"" +"27.0"+ "\"" +" prefHeight="+ "\"" +"407.0"+ "\"" +" prefWidth="+ "\"" +"412.0"+ "\"" +">"+ "\r\n"
			 +" <children>"+ "\r\n"
			 +" <GridPane prefHeight="+ "\"" +"220.0"+ "\"" +" prefWidth="+ "\"" +"220.0"+ "\"" +">"+ "\r\n"
			 +" <columnConstraints> "+ "\r\n"
			 +" <children>"+ "\r\n"
			 +" <VBox layoutX="+ "\"" +"7.0"+ "\"" +" layoutY="+ "\"" +"11.0"+ "\"" +" prefHeight="+ "\"" +"400.0"+ "\"" +" prefWidth="+ "\"" +"400.0"+ "\"" +">"+ "\r\n"
			 +" <children>"+ "\r\n"
			 +" <GridPane prefHeight="+ "\"" +prefHeight+ "\"" +" prefWidth="+ "\"" +prefHeight+ "\"" +">"+ "\r\n"
			 +" <columnConstraints> "+ "\r\n";
			 writer.write(text);
			 for (int i = 1; i < Goriz+1;) {
					 text = " <ColumnConstraints hgrow="+ "\"" +"SOMETIMES"+ "\"" +" minWidth="+ "\"" +"20.0"+ "\"" +" prefWidth="+ "\"" +"20.0"+ "\"" +" />"+ "\r\n";
					writer.write(text);
					i++;
				}
			 text= " </columnConstraints>"+ "\r\n"
			 +" <rowConstraints>"+ "\r\n";
			 writer.write(text);
			 for (int i = 1; i < Verti+1;) {
					 text = " <RowConstraints minHeight="+ "\"" +"20.0"+ "\"" +" prefHeight="+ "\"" +"20.0"+ "\"" +" vgrow="+ "\"" +"SOMETIMES"+ "\"" +" />"+ "\r\n";
					writer.write(text);
					i++;
				}
			 text= " </rowConstraints>"+ "\r\n"
             +" <children>"+ "\r\n"
	    	 +"<Button fx:id="+ "\"" +"b1"+ "\"" +" maxHeight="+ "\"" +"20.0"+ "\"" +" maxWidth="+ "\"" +"20.0"+ "\"" +" minHeight="+ "\"" +"20.0"+ "\"" 
			 +" minWidth="+ "\"" +"20.0"+ "\"" +" mnemonicParsing="+ "\"" +"false"+ "\"" +" onMouseClicked="+ "\"" +"#mouseClick"+ "\"" +" prefHeight="+ "\"" 
			 +"20.0"+ "\"" +" prefWidth="+ "\"" +"20.0"+ "\"" +" />"+ "\r\n";
			 writer.write(text);
			for (int Height = 0; Height < Goriz;) {
				for (int i = 1; i <button ;) {
					for (int Width = 0; Width < Verti;) {
						String curentID = "b" + (i);
						if (Height==0) {
							if (Width==0) {
							 text=  "\n";
							
							}else { text=  "<Button fx:id="+ "\"" +curentID+ "\"" +" layoutX="+ "\"" +"10.0"+ "\"" +" layoutY="+ "\"" +"10.0"+ "\"" 
									+" maxHeight="+ "\"" +"20.0"+ "\"" +" maxWidth="+ "\"" +"20.0"+ "\"" +" minHeight="+ "\"" +"20.0"+ "\"" 
									 +" minWidth="+ "\"" +"20.0"+ "\"" +" mnemonicParsing="+ "\"" +"false"+ "\"" +" onMouseClicked="+ "\"" 
							+"#mouseClick"+ "\"" +" prefHeight="+ "\"" +"20.0"+ "\"" +" prefWidth="+ "\"" +"20.0"+ "\"" 
									 +" GridPane.columnIndex="+ "\"" +Width+ "\"" +" />"+ "\r\n";}
//							
						}else if (Width==0) {
							 text=  "<Button fx:id="+ "\"" +curentID+ "\"" +" layoutX="+ "\"" +"10.0"+ "\"" +" layoutY="+ "\"" +"10.0"+ "\"" 
										+" maxHeight="+ "\"" +"20.0"+ "\"" +" maxWidth="+ "\"" +"20.0"+ "\"" +" minHeight="+ "\"" +"20.0"+ "\"" 
												 +" minWidth="+ "\"" +"20.0"+ "\"" +" mnemonicParsing="+ "\"" +"false"+ "\"" +" onMouseClicked="+ "\"" 
										+"#mouseClick"+ "\"" +" prefHeight="+ "\"" +"20.0"+ "\"" +" prefWidth="+ "\"" +"20.0"+ "\"" 
										+ " GridPane.rowIndex=" + "\"" + Height + "\"" + " />" + "\r\n";
							
							
						}else {
						 text=  "<Button fx:id="+ "\"" +curentID+ "\"" +" layoutX="+ "\"" +"10.0"+ "\"" +" layoutY="+ "\"" +"10.0"+ "\"" 
									+" maxHeight="+ "\"" +"20.0"+ "\"" +" maxWidth="+ "\"" +"20.0"+ "\"" +" minHeight="+ "\"" +"20.0"+ "\"" 
											 +" minWidth="+ "\"" +"20.0"+ "\"" +" mnemonicParsing="+ "\"" +"false"+ "\"" +" onMouseClicked="+ "\"" 
									+"#mouseClick"+ "\"" +" prefHeight="+ "\"" +"20.0"+ "\"" +" prefWidth="+ "\"" +"20.0"+ "\"" 
									+" GridPane.columnIndex="+ "\"" +Width+ "\"" 
						 + " GridPane.rowIndex=" + "\"" + Height + "\"" + " />" + "\r\n";
						
					}
						++i;
						++Width;
						writer.write(text);
					}
					++Height;
				}
			}
			 text= "	</children>"+ "\r\n"
					 + "   <opaqueInsets>" + "\r\n"
					 + "      <Insets bottom="+ "\"" +"10.0"+ "\"" +" left="+ "\"" +"10.0"+ "\"" +" right="+ "\"" +"10.0"+ "\"" +" top="+ "\"" +"10.0"+ "\"" +" />" + "\r\n"
					 + "     </opaqueInsets>" + "\r\n"
					 + "     </GridPane>" + "\r\n"
					 + "    </children>" + "\r\n"
					 + "    <opaqueInsets>" + "\r\n"
					 + "       <Insets bottom="+ "\"" +"10.0"+ "\"" +" left="+ "\"" +"10.0"+ "\"" +" right="+ "\"" +"10.0"+ "\"" +" top="+ "\"" +"10.0"+ "\"" +" />" + "\r\n"
					 + "    </opaqueInsets>" + "\r\n"
					 + "  </VBox>" + "\r\n"
					 + " <Button fx:id="+ "\"" +"restartButton"+ "\"" +" layoutX="+ "\"" +"426.0"+ "\"" +" layoutY="+ "\"" +"158.0"+ "\"" +" mnemonicParsing="+ "\"" +"false"+ "\"" +" text="+ "\"" +"Restart"+ "\"" +" />" + "\r\n"
					 + "</children>" + "\r\n"
					 + "<padding>" + "\r\n"
					 + "  <Insets bottom="+ "\"" +"10.0"+ "\"" +" left="+ "\"" +"10.0"+ "\"" +" right="+ "\"" +"10.0"+ "\"" +" top="+ "\"" +"10.0"+ "\"" +" />" + "\r\n"
					 + "</padding>" + "\r\n"
					 + "</Pane>" + "\r\n";

					 writer.write(text);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	

	
}
