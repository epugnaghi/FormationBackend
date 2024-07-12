package com.ep.Hibernate4All.converter;

import com.ep.Hibernate4All.domain.Certification;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Optional;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class CertificationAttributeConverter implements AttributeConverter<Optional<Certification>, Integer>
{
    @Override
    public Integer convertToDatabaseColumn(Optional<Certification> certification)
    {
        if (certification.isPresent())
            return certification.get().getKey();

        return null;
    }

    @Override
    public Optional<Certification> convertToEntityAttribute(Integer dbData)
    {
        return Optional.ofNullable(Stream.of(Certification.values())
                .filter(certification -> certification.getKey().equals(dbData))
                .findFirst()
                .orElse(null));
    }
}
