package com.group.libraryapp.temp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    public PersonService(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    @Transactional
    public void savePerson() {
        Person person = personRepository.save(new Person());
        Address address = addressRepository.save(new Address());
        person.setAddress(address); // 사람과 주소를 이어줌. 원래 setter를 사용하면 안됨
       // address.setPerson(person);
    }
}
