package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Attribute;
import ru.oneicon.oneicon_backend.entity.AttributeValue;
import ru.oneicon.oneicon_backend.exception.BadRequestException;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.repository.AttributeValueRepository;

import java.util.List;

@Service
@Slf4j
public class AttributeValueService {

    private final AttributeValueRepository attributeValueRepository;


    @Autowired
    public AttributeValueService(AttributeValueRepository attributeValueRepository) {
        this.attributeValueRepository = attributeValueRepository;
    }

    public List<AttributeValue> getAllAttributeValues() {
        log.info("getAllAttributeValues was called");
        return attributeValueRepository.findAll();
    }

    public AttributeValue getAttributeValueById(Long id) {
        log.info("getAttributeValueById was called");
        return attributeValueRepository.findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("AttributeValue with id " + id + " was not found");
                    log.error("error in getting attributeValue {}", id, notFoundException);
                    return notFoundException;
                });
    }

    public void addAttributeValue(AttributeValue attributeValue) {
        log.info("addAttributeValue was called");
        if(attributeValue.getValue() == null)
            throw new BadRequestException("AttributeValue name must not be empty");
            attributeValueRepository.save(attributeValue);
    }

    public AttributeValue updateAttributeValue(AttributeValue attributeValue) {
        log.info("updateAttributeValue was called");
        return attributeValueRepository.save(attributeValue);
    }

    public void deleteAttributeValue(Long id) {
        log.info("deleteAttributeValue was called");
        if(!attributeValueRepository.existsById(id)) {
            throw new NotFoundException("AttributeValue with id " + id + " does not exists");
        }
        attributeValueRepository.deleteById(id);
    }
}
