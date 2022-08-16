package xyz.mxue.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import xyz.mxue.mapstruct.dao.CarDto;
import xyz.mxue.mapstruct.entity.Car;

/**
 * <h2> CarMapper  </h2>
 *
 * @author mxuexxmy
 * @date 8/16/2022 11:55 PM
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "make", target = "make")
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);

}
