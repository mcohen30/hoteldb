/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mpowel12
 */
class Res_Trans {
    private int resID, orgBal, bPaid,room, cID, booker, cashDrawer, transID;
    private String  End_Date, Start_Date,Marketing_Source,reaStay,resStat,transDate, transType, payType, transStat, Shift;
    public Res_Trans(String transDate, String transType, String payType, String transStat, int cashDrawer, String Shift, int transID, int resID, int booker, int cID){
        this.transDate = transDate;
        this.transType = transType;
        this.payType = payType;
        this.transStat = transStat;
        this.cashDrawer = cashDrawer;
        this.Shift = Shift;
        this.transID = transID;
        this.cID = cID;
        this.booker = booker;
    }
    
    public  Res_Trans(int resID, String Start_Date, String End_Date, String Marketing_Source,String reaStay, int orgBal, int bPaid,String resStat, int room, int cID, int booker){
        this.resID = resID;
        this.Start_Date = Start_Date;
        this.End_Date = End_Date;
        this.Marketing_Source = Marketing_Source;
        this.reaStay = reaStay;
        this.orgBal = orgBal;
        this.bPaid = bPaid;
        this.resStat = resStat;
        this.room = room;
        this.cID = cID;
        this.booker = booker;
    }
    String getTransType(){
        return transType;
    }
    String getPayType(){
        return payType;
    }
    String getTransStat(){
        return transStat;
    }
    int getCashDrawer(){
        return cashDrawer;
    }
    String getShift(){
        return Shift;
    }
    int getTransID(){
        return transID;
    }
    int getResID(){
        return resID;   
    }
    String getTransDate(){
        return transDate;
    }
    int getOrgBal(){
        return orgBal;
    }
    int getbPaid(){
        return bPaid;
    }
    int getRoom(){
        return room;
    }
    int getcID(){
        return cID;
    }
    int getBooker(){
        return booker;
    }
    String  getStartDate(){
        return Start_Date;
    }
    String getEndDate(){
        return End_Date;
    }
    String getMarketing_Source(){
        return Marketing_Source;
    }
    String getReaStay(){
        return reaStay;
    }
    String getResStat(){
        return resStat;
    }
    
}
