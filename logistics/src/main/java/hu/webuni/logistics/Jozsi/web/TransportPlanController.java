package hu.webuni.logistics.Jozsi.web;

import java.awt.print.Pageable;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import hu.webuni.logistics.Jozsi.dto.AddressDto;
import hu.webuni.logistics.Jozsi.dto.AddressFilterDto;
import hu.webuni.logistics.Jozsi.mapper.AddressMapper;
import hu.webuni.logistics.Jozsi.model.Address;
import hu.webuni.logistics.Jozsi.service.AddressService;

@RestController
@RequestMapping("api/addresses")
public class TransportPlanController {
	

	@Autowired
	AddressService addressService;
	
	@Autowired
	AddressMapper addressMapper;
	
	
	
	@GetMapping
	public List<AddressDto> getAll(){
		return addressMapper.addreesesToDtos(addressService.findAll());
	}
	
	@GetMapping("/{id}")
	public AddressDto getById(@PathVariable long id) {
		Address address = findByIdOrThrow(id);
		return addressMapper.addressToDto(address);
	}
	
	private Address findByIdOrThrow(long id) {
		return addressService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

	}
	
	@PostMapping
	public AddressDto createAirport(@RequestBody @Valid AddressDto addressDto) {
		Address address = addressService.save(addressMapper.dtoToAddress(addressDto));
		return addressMapper.addressToDto(address);
	}	
	
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<AddressDto> modifyAddress(@PathVariable long id, @RequestBody @Valid AddressDto addressDto) {
		addressDto.setId(id);
		Address updatedAddress = AddressService.update(addressMapper.dtoToAddress(addressDto));
		if(updatedAddress == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(addressMapper.addressToDto(updatedAddress));
		}
		

	}
	

	
	@DeleteMapping("/{id}")
	public void deleteAddress(@PathVariable long id) {
		addressService.delete(id);
	}
	
	
	
	@PostMapping(value = "/search")
	public List<AddressDto> findByExample(@RequestBody AddressFilterDto example, 
			Pageable pageable) {
		Page<AddressRequest> page = addressService.findAddressessByExample(example, pageable);
		return addressMapper.addressesToDtos(page.getContent());
	}
	
	
	
}

	


