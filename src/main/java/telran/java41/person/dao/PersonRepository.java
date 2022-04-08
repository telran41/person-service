package telran.java41.person.dao;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.java41.person.dto.CityPopulationDto;
import telran.java41.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	//@Query("select p from Person p where p.name=?1")
	Stream<Person> findByName(String name);
	
	Stream<Person> findByAddressCity(String city);
	
	Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);

	@Query("select new telran.java41.person.dto.CityPopulationDto(p.address.city, count(p)) from Person p group by p.address.city order by count(p) desc")
	Iterable<CityPopulationDto> getCityPopulation();
}
