
package GUI;


public class RoomData {
    String RoomType;
    int Price;
    String Description;
    int Max_Guest;
    int room;
    String roomStatus;
    String roomType;
    int houseKeeper;
    int count;
    
    public RoomData(String roomType, int Price, String Description, int Max_Guest){
        this.roomType = roomType;
        this.Price = Price;
        this.Description = Description;
        this.Max_Guest = Max_Guest;
    }
    public RoomData(int room, String roomStatus, String roomType,int houseKeeper){
        this.room = room;
        this.roomStatus = roomStatus;
        this.houseKeeper = houseKeeper;
        this.roomType = roomType;
    }
    public RoomData(String roomType, int count){
        this.roomType = roomType;
        this.count = count;
    }
    public int getRoom(){
        return room;
    }
    public int getCount(){
        return count;
    }
    public String getRoomStatus(){
        return roomStatus;
    }
    public String getRoomType(){
        return roomType;
    }
    public int getHouseKeeper(){
        return houseKeeper;
    }
   
    public int getPrice(){
        return Price;
        
    }
    public String getDescription(){
        return Description;
    }
    public int getMaxGuest(){
        return Max_Guest;
    }
}
