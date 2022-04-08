package telran.java41.person.service;

import telran.java41.person.dto.AddressDto;
import telran.java41.person.dto.CityPopulationDto;
import telran.java41.person.dto.PersonDto;

public interface PersonService {
	boolean addPerson(PersonDto personDto);

	PersonDto findPersonById(Integer id);

	PersonDto removePerson(Integer id);

	PersonDto updatePersonName(Integer id, String name);

	PersonDto updatePersonAddress(Integer id, AddressDto addressDto);
	
	Iterable<PersonDto> findPersonsByName(String name);
	
	Iterable<PersonDto> findPersonsByCity(String city);
	
	Iterable<PersonDto> findPersonsBetweenAge(Integer minAge, Integer maxAge);
	
	Iterable<CityPopulationDto> getCityPopulation();
}
