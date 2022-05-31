package hu.webuni.logistics.Jozsi.web;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import hu.webuni.logistics.Jozsi.dto.AddressDto;
import hu.webuni.logistics.Jozsi.repository.AddressRepository;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TransportPlanControllerIT {
	
	private static final String BASE_URI="/api/addresses";
	
	@Autowired
	WebTestClient webTestClient;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Test
	void testThatCreatedAddresstIsListed() throws Exception {
		List<AddressDto> addressesBefore = getAllAddresses();
		
		AddressDto newAddress = new AddressDto(5, "faasffgaf", "IGH");
		createAddress(newAddress);
		
		List<AddressDto> addressesAfter = getAllAddresses();
		
		assertThat(addressesAfter.subList(0, addressesBefore.size()))
			.usingRecursiveFieldByFieldElementComparator()
			.containsExactlyElementsOf(addressesBefore);
		
		assertThat(addressesAfter.get(addressesAfter.size()-1))
			.usingRecursiveComparison()
			.isEqualTo(newAddress);
	}

	private void createAddress(AddressDto newAddress) {
		webTestClient
			.post()
			.uri(BASE_URI)
			.bodyValue(newAddress)
			.exchange()
			.expectStatus()
			.isOk();
		
	}

	private List<AddressDto> getAllAddresses() {
		List<AddressDto> responseList = webTestClient
			.get()
			.uri(BASE_URI)
			.exchange()
			.expectStatus().isOk()
			.expectBodyList(AddressDto.class)
			.returnResult().getResponseBody();
		
		
		Collections.sort(responseList, (a1, a2) -> Long.compare(a1.getId(), a2.getId()));
		return responseList;
	}
	
	
}
