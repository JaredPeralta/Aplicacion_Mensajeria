/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.ControladorMain;
import View.GuiMain;

/**
 *
 * @author sebastian
 */
public class Main {
    public static void main(String[] args) {
        
        GuiMain guiMain =new GuiMain();
        ControladorMain controladorMain = new ControladorMain(guiMain);
        guiMain.setVisible(true);
    }
}
