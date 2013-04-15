/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CarboLife;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Fatec
 */
public class CarboLifeMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command okCommand;
    private Command digitarCommand;
    private Command okCommand1;
    private Command digitarCommand1;
    private Command okCommand2;
    private Command verificaCommand;
    private Command backCommand;
    private Form formCarboLifeList;
    private StringItem stringItem;
    private ChoiceGroup choiceGroup;
    private StringItem resultStringItem;
    private Form formCarboLifeWrite;
    private StringItem respStringItem;
    private TextField writeTextField;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The CarboLifeMIDlet constructor.
     */
    public CarboLifeMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getFormCarboLifeList());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == formCarboLifeList) {//GEN-BEGIN:|7-commandAction|1|39-preAction
            if (command == digitarCommand1) {//GEN-END:|7-commandAction|1|39-preAction
                // write pre-action user code here
                switchDisplayable(null, getFormCarboLifeWrite());//GEN-LINE:|7-commandAction|2|39-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|4|19-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|5|35-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|6|35-postAction
               if(choiceGroup.isSelected(0)){
                   resultStringItem.setText("AÇÚCAR DE MESA, AMEIXA, AMORA PRETA, ARROZ, BANANA, BARRAS DE CHOCOLATE, BEBIDAS CARBONATADAS, BOLINHOS, BOLO,CEREAIS EMBALADOS,DERIVADOS DO LEITE,CHOCOLATE,CEREJA,DOCES,FRAMBOESA,GROSELHA,KIWI,LARANJA,LEITE,LICHIA,LIMÃO,MACARRÃO (FARINHA BRANCA),MAÇÃ,MEL,MELADOS,MELÃO,MIRTILO (BLUEBERRY),MORANGO");
                }if(choiceGroup.isSelected(1)){
                resultStringItem.setText("ESPINAFRE,  ABOBRINHA, ALCACHOFRAS, ALFACE, ARROZ INTEGRAL, ASPARGOS,AVEIA, BATATA, BATATA DOCE, BERINJELA, BOLACHA DE ÁGUA, BRÓCOLIS, CEBOLA, CENOURA, CENTEIO, CEREAIS, CEVADA,COUVE-FLOR, DAMASCOS SECOS, ERVILHA, FARINHA DE TRIGO INTEGRAL, FEIJÃO,FEIJÃO BRANCO, FIBRAS");
                }
            }//GEN-BEGIN:|7-commandAction|7|49-preAction
        } else if (displayable == formCarboLifeWrite) {
            if (command == backCommand) {//GEN-END:|7-commandAction|7|49-preAction
                // write pre-action user code here
                switchDisplayable(null, getFormCarboLifeList());//GEN-LINE:|7-commandAction|8|49-postAction
                // write post-action user code here
            } else if (command == verificaCommand) {//GEN-LINE:|7-commandAction|9|46-preAction
                String text;
//GEN-LINE:|7-commandAction|10|46-postAction

                text=writeTextField.getString();
                if(text.equals("OXICOCO")||text.equals("PÃO")){
                respStringItem.setText("É simples");
                }
            }//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|12|
    //</editor-fold>//GEN-END:|7-commandAction|12|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formCarboLifeList ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of formCarboLifeList component.
     * @return the initialized component instance
     */
    public Form getFormCarboLifeList() {
        if (formCarboLifeList == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            formCarboLifeList = new Form("CarboLife", new Item[] { getStringItem(), getChoiceGroup(), getResultStringItem() });//GEN-BEGIN:|14-getter|1|14-postInit
            formCarboLifeList.addCommand(getExitCommand());
            formCarboLifeList.addCommand(getOkCommand1());
            formCarboLifeList.addCommand(getDigitarCommand1());
            formCarboLifeList.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return formCarboLifeList;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
            stringItem = new StringItem("Escolha Entre os 2 tipos de Carboidratos ou v\u00E1 ao menu e digite o nome do alimento", "");//GEN-LINE:|16-getter|1|16-postInit
            // write post-init user code here
        }//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|16-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|23-getter|0|23-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|23-getter|1|23-postInit
            // write post-init user code here
        }//GEN-BEGIN:|23-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|23-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: digitarCommand ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initiliazed instance of digitarCommand component.
     * @return the initialized component instance
     */
    public Command getDigitarCommand() {
        if (digitarCommand == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            digitarCommand = new Command("Digitar", Command.ITEM, 0);//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return digitarCommand;
    }
    //</editor-fold>//GEN-END:|30-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of choiceGroup component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Carboidratos", Choice.EXCLUSIVE);//GEN-BEGIN:|27-getter|1|27-postInit
            choiceGroup.append("Simples(Ruim)", null);
            choiceGroup.append("Complexo(Bom)", null);
            choiceGroup.setSelectedFlags(new boolean[] { false, false });//GEN-END:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return choiceGroup;
    }
    //</editor-fold>//GEN-END:|27-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: resultStringItem ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of resultStringItem component.
     * @return the initialized component instance
     */
    public StringItem getResultStringItem() {
        if (resultStringItem == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            resultStringItem = new StringItem("", "");//GEN-LINE:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return resultStringItem;
    }
    //</editor-fold>//GEN-END:|33-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formCarboLifeWrite ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of formCarboLifeWrite component.
     * @return the initialized component instance
     */
    public Form getFormCarboLifeWrite() {
        if (formCarboLifeWrite == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            formCarboLifeWrite = new Form("CarboLife", new Item[] { getWriteTextField(), getRespStringItem() });//GEN-BEGIN:|22-getter|1|22-postInit
            formCarboLifeWrite.addCommand(getVerificaCommand());
            formCarboLifeWrite.addCommand(getBackCommand());
            formCarboLifeWrite.setCommandListener(this);//GEN-END:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return formCarboLifeWrite;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initiliazed instance of okCommand1 component.
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return okCommand1;
    }
    //</editor-fold>//GEN-END:|34-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: digitarCommand1 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of digitarCommand1 component.
     * @return the initialized component instance
     */
    public Command getDigitarCommand1() {
        if (digitarCommand1 == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            digitarCommand1 = new Command("Digitar", Command.ITEM, 0);//GEN-LINE:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return digitarCommand1;
    }
    //</editor-fold>//GEN-END:|38-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initiliazed instance of okCommand2 component.
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return okCommand2;
    }
    //</editor-fold>//GEN-END:|43-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: verificaCommand ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initiliazed instance of verificaCommand component.
     * @return the initialized component instance
     */
    public Command getVerificaCommand() {
        if (verificaCommand == null) {//GEN-END:|45-getter|0|45-preInit
            // write pre-init user code here
            verificaCommand = new Command("Verifica", Command.ITEM, 0);//GEN-LINE:|45-getter|1|45-postInit
            // write post-init user code here
        }//GEN-BEGIN:|45-getter|2|
        return verificaCommand;
    }
    //</editor-fold>//GEN-END:|45-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: respStringItem ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initiliazed instance of respStringItem component.
     * @return the initialized component instance
     */
    public StringItem getRespStringItem() {
        if (respStringItem == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            respStringItem = new StringItem("", "");//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return respStringItem;
    }
    //</editor-fold>//GEN-END:|42-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|48-getter|0|48-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|48-getter|0|48-preInit
            // write pre-init user code here
            backCommand = new Command("Voltar", Command.BACK, 0);//GEN-LINE:|48-getter|1|48-postInit
            // write post-init user code here
        }//GEN-BEGIN:|48-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|48-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: writeTextField ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initiliazed instance of writeTextField component.
     * @return the initialized component instance
     */
    public TextField getWriteTextField() {
        if (writeTextField == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            writeTextField = new TextField("Digite o alimento: (FAVOR DIGITAR TUDO MAISCULO)", "", 32, TextField.ANY);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return writeTextField;
    }
    //</editor-fold>//GEN-END:|51-getter|2|



    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
