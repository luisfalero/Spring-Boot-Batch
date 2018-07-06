package com.bbva.springbootbatch.batch;

import com.bbva.springbootbatch.entity.PersonEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<PersonEntity, PersonEntity> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public PersonEntity process(final PersonEntity person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final PersonEntity transformedPerson = new PersonEntity();
        transformedPerson.setFirstName(firstName);
        transformedPerson.setLastName(lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
}
