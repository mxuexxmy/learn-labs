package xyz.mxue.mapstruct.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h2> CarDto  </h2>
 *
 * @author mxuexxmy
 * @date 8/16/2022 11:53 PM
 */
public class CarDto {

    private String make;
    private int seatCount;

    //constructor, getters, setters etc.

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public CarDto() {
    }


    public CarDto(String make, int seatCount) {
        this.make = make;
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", seatCount=" + seatCount +
                '}';
    }
}