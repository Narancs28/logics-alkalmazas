package hu.webuni.logistics.Jozsi.mapper;

import java.util.List;

import javax.validation.Valid;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import hu.webuni.logistics.Jozsi.dto.AddressDto;
import hu.webuni.logistics.Jozsi.model.Address;


@Mapper(componentModel = "spring")
public interface AddressMapper {
	
	
	@InheritInverseConfiguration
	AddressDto addressToDto(Address address);

	List<AddressDto> addreesesToDtos(List<Address> findAll);

	Address dtoToAddress(@Valid AddressDto addressDto);

	

	
	

	
	
}





	
	


