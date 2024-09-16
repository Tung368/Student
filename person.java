package Homework;

import java.util.Date;

abstract class person {
    String ID;
    String fullname;
    Date Date0fbrith;

    public person() {
    }
    

    public person(String ID, String fullname, Date Date0fbrith) {
        this.ID = ID;
        this.fullname = fullname;
        this.Date0fbrith = Date0fbrith;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDate0fbrith() {
        return Date0fbrith;
    }

    public void setDate0fbrith(Date Date0fbrith) {
        this.Date0fbrith = Date0fbrith;
    }
    
    
    
}
