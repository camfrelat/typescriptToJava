import java.util.Date;


public class User {
    private Date birthdate;
    private Number size;
    private Photo photos;
    private Address address;

    public Date getBirthdate() {return birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public Number getSize() {return size;}
    public void setSize(Number size) {this.size = size;}

    public Photo getPhotos() {return photos;}
    public void setPhotos(Photo photos) {this.photos = photos;}

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}
}
