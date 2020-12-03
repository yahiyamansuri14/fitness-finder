/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author hp
 */
public class Studio {
    private String studio_id;
    private String s_name;
    private String s_address;
    private String s_state;
    private String s_city;
    private String s_contact;
    private String workout_avail;
    private String amenities;
    private byte[] image;
    private String owner_id;
    private String s_hotlocation;
    private String distance_hotlocation;
    private String category;

    public String getStudio_id() {
        return studio_id;
    }

    public String getS_name() {
        return s_name;
    }

    public String getS_address() {
        return s_address;
    }

    public String getS_state() {
        return s_state;
    }

    public String getS_city() {
        return s_city;
    }

    public String getS_contact() {
        return s_contact;
    }

    public String getWorkout_avail() {
        return workout_avail;
    }

    public String getAmenities() {
        return amenities;
    }

    public byte[] getImage() {
        return image;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public String getS_hotlocation() {
        return s_hotlocation;
    }

    public String getDistance_hotlocation() {
        return distance_hotlocation;
    }

    public String getCategory() {
        return category;
    }

    public void setStudio_id(String studio_id) {
        this.studio_id = studio_id;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public void setS_state(String s_state) {
        this.s_state = s_state;
    }

    public void setS_city(String s_city) {
        this.s_city = s_city;
    }

    public void setS_contact(String s_contact) {
        this.s_contact = s_contact;
    }

    public void setWorkout_avail(String workout_avail) {
        this.workout_avail = workout_avail;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public void setS_hotlocation(String s_hotlocation) {
        this.s_hotlocation = s_hotlocation;
    }

    public void setDistance_hotlocation(String distance_hotlocation) {
        this.distance_hotlocation = distance_hotlocation;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Studio{" + "studio_id=" + studio_id + ", s_name=" + s_name + ", s_address=" + s_address + ", s_state=" + s_state + ", s_city=" + s_city + ", s_contact=" + s_contact + ", workout_avail=" + workout_avail + ", amenities=" + amenities + ", image=" + image + ", owner_id=" + owner_id + ", s_hotlocation=" + s_hotlocation + ", distance_hotlocation=" + distance_hotlocation + ", category=" + category + '}';
    }
    
    
}
